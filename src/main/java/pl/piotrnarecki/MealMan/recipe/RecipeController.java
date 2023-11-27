package pl.piotrnarecki.MealMan.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piotrnarecki.MealMan.product.Product;
import pl.piotrnarecki.MealMan.product.ProductService;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService){this.recipeService=recipeService;}


    @GetMapping()
    public List<Recipe> getRecipes(){
        return recipeService.getRecipes();
    }
}
