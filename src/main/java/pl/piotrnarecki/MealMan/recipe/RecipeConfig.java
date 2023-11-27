package pl.piotrnarecki.MealMan.recipe;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.piotrnarecki.MealMan.product.Product;
import pl.piotrnarecki.MealMan.product.ProductRepository;

import java.util.List;

@Configuration
public class RecipeConfig {



    @Bean
    CommandLineRunner recipeCommandLineRunner(RecipeRepository recipeRepository){


        return args -> {

//            Product egg = new Product("egg","protein",100);
//            Product bacon = new Product("bacon","protein",300);
//            Product steak = new Product("steak","protein",500);
//
//            ProductQuantity eggQuantity = new ProductQuantity(egg,10);
//            ProductQuantity baconQuantity = new ProductQuantity(bacon,15);
//            ProductQuantity steakQuantity = new ProductQuantity(steak,25);
//
//            List<ProductQuantity>  productQuantityList1 = List.of(eggQuantity,baconQuantity,steakQuantity);
//            List<ProductQuantity>  productQuantityList2 = List.of(baconQuantity,steakQuantity);
//            List<ProductQuantity>  productQuantityList3 = List.of(eggQuantity,baconQuantity);

            String instruction  = "Do something";

            Recipe recipe1 = new Recipe("recipe 1",instruction);
            Recipe recipe2 = new Recipe("recipe 2",instruction);
            Recipe recipe3 = new Recipe("recipe 3",instruction);

            recipeRepository.saveAll(List.of(recipe1,recipe2,recipe3));

        };




    }

}
