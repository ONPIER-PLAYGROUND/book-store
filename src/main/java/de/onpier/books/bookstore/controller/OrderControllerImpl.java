package de.onpier.books.bookstore.controller;

import de.onpier.books.bookstore.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class OrderControllerImpl implements OrderController {
    private BookService bookService;

    public OrderControllerImpl(BookService bookService) {
        this.bookService = bookService;
    }

    public ResponseEntity<?> orderBook(Order order) {
        if (bookService.orderBook(order.getBookId(), order.getUserAddress())) {
            return ResponseEntity.ok(order);
        } else {
            return ResponseEntity.ok(ErrorMessage.builder().message("Order was not successful"));
        }

    }
}
