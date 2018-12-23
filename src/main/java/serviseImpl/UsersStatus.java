package serviseImpl;

import entities.UsersStatusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UsersStatusRepository;

@Service
public class UsersStatus {
    @Autowired
            UsersStatusRepository usersStatusRepository;

    @Transactional
    public void createNewUsersStatus(Integer id, String name) {
        UsersStatusEntity usersStatusEntity = new UsersStatusEntity();
        usersStatusEntity.setId(id);
        usersStatusEntity.setName(name);
        usersStatusRepository.save(usersStatusEntity);
    }
    @Transactional
    public UsersStatusEntity changeStatus(UsersStatusEntity usersStatusEntity, String status){
        usersStatusEntity.setName(status);
        usersStatusRepository.save(usersStatusEntity);
        return usersStatusEntity;
    }
}
