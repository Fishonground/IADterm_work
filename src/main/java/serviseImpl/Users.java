package serviseImpl;

import entities.PeopleEntity;
import entities.UsersEntity;
import entities.UsersStatusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UsersRepository;

@Service
public class Users {
    @Autowired

    UsersRepository usersRepository;

    @Transactional
    public UsersEntity CreateNewUser(String password, String login, PeopleEntity peopleEntity, UsersStatusEntity usersStatusEntity){
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setLogin(login);
        usersEntity.setPassword(password);
        usersEntity.setPeopleByPeopleId(peopleEntity);
        usersEntity.setUsersStatusByStatus(usersStatusEntity);
        usersRepository.save(usersEntity);
        return usersEntity;
    }

    @Transactional
    public UsersEntity changeLogin(UsersEntity usersEntity, String login){
        usersEntity.setLogin(login);
        usersRepository.save(usersEntity);
        return usersEntity;
    }

    @Transactional
    public UsersEntity changePassword(UsersEntity usersEntity, String password){
        usersEntity.setPassword(password);
        usersRepository.save(usersEntity);
        return usersEntity;
    }

    @Transactional
    public UsersEntity changeStatus(UsersEntity usersEntity, UsersStatusEntity usersStatusEntity){
        usersEntity.setUsersStatusByStatus(usersStatusEntity);
        usersRepository.save(usersEntity);
        return usersEntity;
    }
    @Transactional
    public String getStatus(UsersEntity usersEntity){
       return usersEntity.getUsersStatusByStatus().getName();
    }

    public UsersEntity getUserByLogin(String login){
        UsersEntity usersEntity = usersRepository.findById(login).get();
        return usersEntity;
    }

    public Integer delUserById(String id){
        usersRepository.deleteById(id);
        return 1;
    }


}
