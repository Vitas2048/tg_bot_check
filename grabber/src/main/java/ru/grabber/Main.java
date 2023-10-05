package ru.grabber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.grabber.model.Product;
import ru.grabber.store.ProductRepository;

@EnableJpaRepositories
@EnableAutoConfiguration
public class Main {
    public static void main(String[] args) {
        var context = SpringApplication.run(Main.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        var product = new Product();
        product.setLink("https://1click.ru/catalogue/novosib/phones/telefony-google/googlepixel7/googlepixel78128gblemongrassjp/");
        product.setName("Pixel 7");
        product.setShop("1click");
        product.setPrice(50000);
        productRepository.save(product);
    }
}
