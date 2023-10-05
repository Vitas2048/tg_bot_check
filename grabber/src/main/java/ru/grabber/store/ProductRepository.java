package ru.grabber.store;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grabber.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
