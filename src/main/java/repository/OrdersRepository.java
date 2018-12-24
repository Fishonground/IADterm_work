package repository;

import entities.OrderConditionsEntity;
import entities.OrdersEntity;
import entities.ProductEntity;
import entities.UsersEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer> {
    List<OrdersEntity> findAllByAddresseeId(Integer add);
    List<OrdersEntity> findAllByUsersByCustomerOrderByAddresseeId(UsersEntity usersEntity);
    List<OrdersEntity> findAllByOrderConditionsByConditionEquals(OrderConditionsEntity orderConditionsEntity);
    List<OrdersEntity> findOrdersEntitiesByProductByProductOrderByAddresseeId(ProductEntity productEntity);
}
