package pl.piotrnarecki.MealMan.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/api/v1/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){this.productService=productService;}



    @GetMapping()
    public List<Product> getProducts(){
        return productService.getProducts();
    }



    @PostMapping()
    public void addNewProduct(@RequestBody Product product){//bierze z dane z JSONa i mapuje

        productService.addNewProduct(product);


    }


    @DeleteMapping(path = "{productId}")
    public void deleteProduct(@PathVariable("productId") Long id){


        productService.deleteProduct(id);



    }


    @PutMapping(path = "{productId}")
    public void updateStudent(@PathVariable("productId") Long productId,
                              @RequestParam(required = false) String name,@RequestParam(required = false) int calories){

        productService.updateProduct(productId,name,calories);

    }



}
