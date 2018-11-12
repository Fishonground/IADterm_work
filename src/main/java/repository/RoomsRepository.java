package repository;

import entities.RoomsEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomsRepository extends CrudRepository<RoomsEntity, Integer> {
}
