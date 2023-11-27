package pl.piotrnarecki.MealMan.product;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner productCommandLineRunner(ProductRepository productRepository){



        return args -> {


            Product product1 = new Product("egg","protein",100);
            Product product2 = new Product("bacon","protein",300);
            Product product3 = new Product("steak","protein",500);




            productRepository.saveAll(List.of(product1,product2,product3));

        };




    }


}
