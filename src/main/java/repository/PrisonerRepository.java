package repository;

import entities.PrisonerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PrisonerRepository extends CrudRepository<PrisonerEntity, Integer> {

    Collection<PrisonerEntity> findAllByFactionIsNotNullAndOrderByRating();
}
