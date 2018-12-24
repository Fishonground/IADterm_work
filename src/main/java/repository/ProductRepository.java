package repository;

import entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity, String> {
    List<ProductEntity> findProductEntitiesByAuthorityGreaterThan (Integer authority);
    List<ProductEntity> findProductEntitiesByAuthorityIsLessThan (Integer authority);
    List<ProductEntity> findProductEntitiesByCountGreaterThan(Integer count);
    List<ProductEntity> findProductEntitiesByCountGreaterThanOrderByPrice(Integer count);

}
