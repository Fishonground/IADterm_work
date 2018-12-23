package serviseImpl;

import entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.OrderConditionsRepository;

public class OrderConditions {
    @Autowired
    OrderConditionsRepository orderConditionsRepository;


    @Transactional
    public void CreateNewOrderCondition(Integer id, String description){
        OrderConditionsEntity orderConditionsEntity = new OrderConditionsEntity();
        orderConditionsEntity.setId(id);
        orderConditionsEntity.setDescription(description);
        orderConditionsRepository.save(orderConditionsEntity);

    }

    @Transactional
    public  OrderConditionsEntity changeDescription(OrderConditionsEntity orderConditionsEntity, String description){
        orderConditionsEntity.setDescription(description);
        orderConditionsRepository.save(orderConditionsEntity);
        return (orderConditionsEntity);
    }

}
