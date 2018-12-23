package serviseImpl;

import entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.PrisonerRepository;

import java.sql.Date;

public class Prisoner {
    @Autowired


    PrisonerRepository prisonerRepository;

    @Transactional
    public void CreateNewPrisoner(Integer id, java.sql.Date term , RoomsEntity roomsEntity, UsersEntity usersEntity, Integer rating, FactionEntity factionEntity){
        PrisonerEntity prisonerEntity = new PrisonerEntity();
        prisonerEntity.setPersonId(id);
        prisonerEntity.setTerm(term);
        prisonerEntity.setRoomsByRoom(roomsEntity);
        prisonerEntity.setUsersByOwner(usersEntity);
        prisonerEntity.setRating(rating);
        prisonerEntity.setFactionByFaction(factionEntity);
        prisonerRepository.save(prisonerEntity);
    }

    @Transactional
    public  PrisonerEntity changeTerm(PrisonerEntity prisonerEntity, Date term){
        prisonerEntity.setTerm(term);
        prisonerRepository.save(prisonerEntity);
        return (prisonerEntity);
    }

    @Transactional
    public  PrisonerEntity changeRoom(PrisonerEntity prisonerEntity, RoomsEntity roomsEntity){
        prisonerEntity.setRoomsByRoom(roomsEntity);
        prisonerRepository.save(prisonerEntity);
        return (prisonerEntity);
    }  @Transactional
    public  PrisonerEntity changeRating(PrisonerEntity prisonerEntity, Integer rating){
        prisonerEntity.setRating(rating);
        prisonerRepository.save(prisonerEntity);
        return (prisonerEntity);
    }  @Transactional
    public  PrisonerEntity changeFaction(PrisonerEntity prisonerEntity, FactionEntity factionEntity){
        prisonerEntity.setFactionByFaction(factionEntity);
        prisonerRepository.save(prisonerEntity);
        return (prisonerEntity);
    }
}
