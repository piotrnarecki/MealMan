package pl.piotrnarecki.MealMan.recipe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import pl.piotrnarecki.MealMan.product.Product;


@Getter
@Setter
@AllArgsConstructor
@ToString

public class ProductQuantity {

    private Product product;
    private int quantity;




}
