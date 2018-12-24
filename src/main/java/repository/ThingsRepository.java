package repository;

import entities.ThingsEntity;
import entities.UsersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ThingsRepository extends CrudRepository<ThingsEntity, String> {
 List<ThingsEntity> findThingsEntitiesByPrisonerByOwner(ThingsEntity thingsEntity);
 List<ThingsEntity>findAllByOrderByPrice();
 List<ThingsEntity>findThingsEntitiesByDescriptionEquals(String description);
}
