package repository;

import entities.PeopleEntity;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<PeopleEntity, Integer> {

}
