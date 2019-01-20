package controller;

import entities.*;
import entities.ThingsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import serviseImpl.*;

@RestController
@RequestMapping(value = "/api")
public class UsersController {

    @Autowired
    public Users users;


    //Это любой юзер
    @Secured({ "ROLE_USER","ROLE_GUEST", "ROLE_ADMIN" ,"ROLE_TRAINER"})
    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createNewUsers(
            @RequestBody UsersEntity usersEntity
    ){
        UsersEntity usersEntity1 = users.CreateNewUser(usersEntity.getPassword(),usersEntity.getLogin(),usersEntity.getPeopleByPeopleId(),usersEntity.getUsersStatusByStatus());
        return ResponseEntity.ok(usersEntity1);
    }

    @Secured({ "ROLE_GUEST", "ROLE_ADMIN", "ROLE_TRAINER" })
    @RequestMapping(value = "/users/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getUsers(
            @PathVariable String name
    ){
        UsersEntity usersEntity = users.getUserByLogin(name);
        return ResponseEntity.ok(usersEntity);
    }

    @Secured({ "ROLE_USER", "ROLE_ADMIN", "ROLE_TRAINER" })
    @RequestMapping(value = "/users/del/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delUsers(
            @PathVariable String id
    ){
        Integer i = users.delUserById(id);
        return ResponseEntity.ok(i);
    }

    @Secured({ "ROLE_USER", "ROLE_ADMIN", "ROLE_TRAINER" })
    @RequestMapping(value = "/users/{id}/upd/login/{login}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updPrisoner(
            @PathVariable String id,
            @PathVariable String login
    ){
         UsersEntity usersEntity = users.getUserByLogin(id);
        usersEntity = users.changeLogin(usersEntity, login);
        return ResponseEntity.ok(usersEntity);
    }

}