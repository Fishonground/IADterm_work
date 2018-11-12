package repository;

import entities.FactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface FactionRepository extends CrudRepository<FactionEntity, String> {
}
