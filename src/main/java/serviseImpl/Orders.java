package serviseImpl;

import entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.OrdersRepository;

public class Orders {
    @Autowired
    OrdersRepository ordersRepository;

    @Transactional
    public void CreateNewOrder(Integer id, OrderConditionsEntity orderConditionsEntity , ProductEntity productEntity,
                               UsersEntity usersEntity){
        OrdersEntity ordersEntity = new OrdersEntity();
        ordersEntity.setId(id);
        ordersEntity.setOrderConditionsByCondition(orderConditionsEntity);
        ordersEntity.setProductByProduct(productEntity);
        ordersEntity.setUsersByCustomer(usersEntity);
        ordersRepository.save(ordersEntity);

    }

    @Transactional
    public  OrdersEntity changeCondition(OrdersEntity ordersEntity, OrderConditionsEntity orderConditionsEntity){
        ordersEntity.setOrderConditionsByCondition(orderConditionsEntity);
        ordersRepository.save(ordersEntity);
        return (ordersEntity);
    }


}
