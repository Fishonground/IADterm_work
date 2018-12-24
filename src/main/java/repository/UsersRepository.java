package repository;

import entities.UsersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends CrudRepository<UsersEntity, String> {
    UsersEntity findUsersEntityByLogin(String login);
    @Query(value = "select usersEntity from UsersEntity usersEntity join UsersStatusEntity usersStatus on " +
            "usersEntity.usersStatusByStatus.id = usersStatus.id where usersStatus.name = :name")
    List<UsersEntity> getListUsersByStatus(@Param("name") String name);

}
