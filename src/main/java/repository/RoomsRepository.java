package repository;

import entities.RoomsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomsRepository extends CrudRepository<RoomsEntity, Integer> {

    List<RoomsEntity> findRoomsEntitiesByNumberOfPrisonersLessThanOrderByNumberOfPrisoners(Integer number_of_prisoner);
    List<RoomsEntity> findRoomsEntitiesByNameEquals(String name);

}
