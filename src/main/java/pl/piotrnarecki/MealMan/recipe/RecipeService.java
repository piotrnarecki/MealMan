package pl.piotrnarecki.MealMan.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrnarecki.MealMan.product.Product;
import pl.piotrnarecki.MealMan.product.ProductRepository;

import java.util.List;

@Service
public class RecipeService {


    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }



    public List<Recipe> getRecipes(){

        return recipeRepository.findAll();

    }
}
