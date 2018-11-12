package repository;

import entities.OrderConditionsEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderConditionsRepository extends CrudRepository <OrderConditionsEntity, Integer> {
}
