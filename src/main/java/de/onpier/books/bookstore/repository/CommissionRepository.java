package de.onpier.books.bookstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommissionRepository extends MongoRepository<CommissionEntity, String> {
}
