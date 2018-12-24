package repository;

import entities.UsersStatusEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersStatusRepository extends CrudRepository<UsersStatusEntity , Integer> {
    UsersStatusEntity findUsersStatusEntityById(Integer id);
}
