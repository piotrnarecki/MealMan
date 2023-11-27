package pl.piotrnarecki.MealMan.recipe;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name="recipes")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Recipe {
    @Id
    @SequenceGenerator(name = "recipe_sequence", sequenceName = "recipe_sequence", allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_sequence")
    private Long id;
    private String name;
    //private List<ProductQuantity> productsQuantityList;
    private String instruction;

    public Recipe(String name, String instruction) {
        this.name = name;
        this.instruction = instruction;
    }
}
