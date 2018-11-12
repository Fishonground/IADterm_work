package repository;

import entities.MessagesEntity;
import org.springframework.data.repository.CrudRepository;

public interface MessagesRepository extends CrudRepository<MessagesEntity, Integer > {
}
