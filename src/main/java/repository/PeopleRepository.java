package repository;

import entities.PeopleEntity;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface PeopleRepository extends CrudRepository<PeopleEntity, Integer> {
    List<PeopleEntity> findPeopleEntitiesByDateOfBirth(Date date);
    List<PeopleEntity> findPeopleEntitiesByGenderEquals(String gender);
}
