package repository;

import entities.ThingsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ThingsRepository extends CrudRepository<ThingsEntity, String> {
}
