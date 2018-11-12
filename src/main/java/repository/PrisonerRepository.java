package repository;

import entities.PrisonerEntity;
import org.springframework.data.repository.CrudRepository;

public interface PrisonerRepository extends CrudRepository<PrisonerEntity, Integer> {
}
