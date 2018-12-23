package serviseImpl;

import entities.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.ProductRepository;

public class Product {
    @Autowired

    ProductRepository productRepository;

    @Transactional
    public void CreateNewProduct(String name, Integer count, Integer price, Integer authority){
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(name);
        productEntity.setCount(count);
        productEntity.setPrice(price);
        productEntity.setAuthority(authority);
        productRepository.save(productEntity);
    }

    @Transactional
    public  ProductEntity changeName(ProductEntity productEntity, String name){
        productEntity.setName(name);
        productRepository.save(productEntity);
        return (productEntity);
    }

    @Transactional
    public  ProductEntity changeCount(ProductEntity productEntity, Integer  count){
        productEntity.setCount(count);
        productRepository.save(productEntity);
        return (productEntity);
    }
    @Transactional
    public  ProductEntity changePrice(ProductEntity productEntity, Integer price){
        productEntity.setPrice(price);
        productRepository.save(productEntity);
        return (productEntity);
    }
    @Transactional
    public  ProductEntity changeAughtority(ProductEntity productEntity, Integer augh){
        productEntity.setAuthority(augh);
        productRepository.save(productEntity);
        return (productEntity);
    }
}
