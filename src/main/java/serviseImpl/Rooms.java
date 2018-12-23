package serviseImpl;

import entities.RoomsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.RoomsRepository;

public class Rooms {
    @Autowired

    RoomsRepository roomsRepository;

    @Transactional
    public void CreateNewRoom(Integer id, Integer guests, String name){
        RoomsEntity roomsEntity = new RoomsEntity();
        roomsEntity.setId(id);
        roomsEntity.setName(name);
        roomsEntity.setNumberOfPrisoners(guests);
        roomsRepository.save(roomsEntity);
    }

    @Transactional
    public  RoomsEntity changeName(RoomsEntity roomsEntity, String name){
        roomsEntity.setName(name);
        roomsRepository.save(roomsEntity);
        return (roomsEntity);
    }

    @Transactional
    public  RoomsEntity changeGuests(RoomsEntity roomsEntity, Integer guests){
        roomsEntity.setNumberOfPrisoners(guests);
        roomsRepository.save(roomsEntity);
        return (roomsEntity);
    }

}
