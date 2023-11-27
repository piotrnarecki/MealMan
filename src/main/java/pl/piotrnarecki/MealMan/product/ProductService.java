package pl.piotrnarecki.MealMan.product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public List<Product> getProducts(){

        return productRepository.findAll();

    }

    public void addNewProduct(Product product) {

            productRepository.save(product);

    }

    public void deleteProduct(Long id) {

        boolean productExists = productRepository.existsById(id);
        if(productExists){

            productRepository.deleteById(id);

        }else {
            throw new IllegalStateException("product with id: " + id +" does not exists");
        }

    }

    @Transactional
    public void updateProduct(Long studentId, String name, int calories){



        Product product = productRepository.findById(studentId).orElseThrow(()->new IllegalStateException("product not found"));

        if(name != null && name.length()>0 && !Objects.equals(product.getName(),name)){
            product.setName(name);
        }

        if( calories>0 && !Objects.equals(product.getCalories(),calories)){


            product.setCalories(calories);

        }

        productRepository.save(product);

    }



}
