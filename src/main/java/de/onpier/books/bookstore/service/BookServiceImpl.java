package de.onpier.books.bookstore.service;

import de.onpier.books.bookstore.client.*;
import de.onpier.books.bookstore.controller.Book;
import de.onpier.books.bookstore.repository.CommissionRepository;
import de.onpier.books.bookstore.repository.Order;
import de.onpier.books.bookstore.repository.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    private final AdventureProviderApi adventureProviderApi;
    private final FantasyProviderApi fantasyProviderApi;
    private final TravelProviderApi travelProviderApi;
    private final OrderRepository orderRepository;
    private final CommissionRepository commissionRepository;

    public BookServiceImpl(AdventureProviderApi adventureProviderApi,
                           FantasyProviderApi fantasyProviderApi,
                           TravelProviderApi travelProviderApi,
                           OrderRepository orderRepository,
                           CommissionRepository commissionRepository) {
        this.adventureProviderApi = adventureProviderApi;
        this.fantasyProviderApi = fantasyProviderApi;
        this.travelProviderApi = travelProviderApi;
        this.orderRepository = orderRepository;
        this.commissionRepository = commissionRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.addAll(adventureProviderApi.getBooks().stream().map(adventureBook -> Book.builder().build()).toList());
        books.addAll(travelProviderApi.getBooks().stream().map(travelBook -> Book.builder().build()).toList());
        books.addAll(fantasyProviderApi.getBooks().stream().map(fantasyBook -> Book.builder().build()).toList());
        return books;
    }

    @Override
    public List<Book> getFantasyBooks() {
        return fantasyProviderApi.getBooks().stream().map(travelBook -> Book.builder().build()).toList();
    }

    @Override
    public List<Book> getAdventureBooks() {
        return adventureProviderApi.getBooks().stream().map(travelBook -> Book.builder().build()).toList();
    }

    @Override
    public List<Book> getTravelBooks() {
        return travelProviderApi.getBooks().stream().map(travelBook -> Book.builder().build()).toList();
    }

    public boolean orderBook(String bookId, UserAddress userAddress) {
        List<IBook> books = new ArrayList<>();
        books.addAll(adventureProviderApi.getBooks());
        books.addAll(travelProviderApi.getBooks());
        books.addAll(fantasyProviderApi.getBooks());
        IBook bookToOrder = books.stream().filter(book -> bookId.equals(book.getBookId())).findFirst().get();
        var order = new Order(userAddress, bookToOrder.getBookId());
        orderRepository.save(order);
        commissionRepository.save(bookToOrder.getCommission());
        if (bookToOrder instanceof FantasyBook) {
            try {
                fantasyProviderApi.orderBook(bookId);
            } catch (BookNotAvailableException e) {
                return false;
            }
        }
        if (bookToOrder instanceof TravelBook) {
            try {
                travelProviderApi.orderBook(bookId);
            } catch (BookNotAvailableException e) {
                return false;
            }
        }
        if (bookToOrder instanceof AdventureBook) {
            try {
                adventureProviderApi.orderBook(bookId);
            } catch (BookNotAvailableException e) {
                return false;
            }
        }
        return true;
    }
}
