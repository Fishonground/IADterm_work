package repository;

import entities.MessagesEntity;
import entities.PrisonerEntity;
import entities.UsersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessagesRepository extends CrudRepository<MessagesEntity, Integer > {
    List<MessagesEntity> findAllByUsersByUser(UsersEntity usersEntity);
    List<MessagesEntity> findAllByPrisonerByPrisoner(PrisonerEntity prisonerEntity);
}
