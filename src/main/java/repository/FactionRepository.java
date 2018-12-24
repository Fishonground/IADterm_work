package repository;

import entities.FactionEntity;
import entities.PeopleEntity;
import entities.PrisonerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FactionRepository extends CrudRepository<FactionEntity, String> {
   List<FactionEntity> findFactionEntitiesByOrderByRating();
   FactionEntity findFactionEntityByPrisonerByMainPerson(PrisonerEntity prisonerEntity);
   @Query (value = "select prisoner from PrisonerEntity prisoner join FactionEntity faction on prisoner.personId=faction.prisonerByMainPerson.personId")
    List<PeopleEntity> getListOfFractionLeaders();
   FactionEntity findTop3ByOrderByRating();

}
