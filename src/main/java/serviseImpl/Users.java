package serviseImpl;

import entities.PeopleEntity;
import entities.UsersEntity;
import entities.UsersStatusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.UsersRepository;

public class Users {
    @Autowired

    UsersRepository usersRepository;

    @Transactional
    public void CreateNewUser(String password, String login, PeopleEntity peopleEntity, UsersStatusEntity usersStatusEntity){
        UsersEntity usersEntity = new UsersEntity();
        usersEntity.setLogin(login);
        usersEntity.setPassword(password);
        usersEntity.setPeopleByPeopleId(peopleEntity);
        usersEntity.setUsersStatusByStatus(usersStatusEntity);
        usersRepository.save(usersEntity);
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

}
