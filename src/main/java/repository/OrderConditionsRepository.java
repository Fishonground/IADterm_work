package repository;

import entities.OrderConditionsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderConditionsRepository extends CrudRepository <OrderConditionsEntity, Integer> {
}
