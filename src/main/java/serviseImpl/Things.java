package serviseImpl;

import entities.PrisonerEntity;
import entities.ThingsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.ThingsRepository;

public class Things {
    @Autowired
    ThingsRepository thingsRepository;

    @Transactional
    public void CreateNewThing(String name, String description, Integer price, PrisonerEntity prisonerEntity){
        ThingsEntity thingsEntity = new ThingsEntity();
        thingsEntity.setName(name);
        thingsEntity.setDescription(description);
        thingsEntity.setPrice(price);
        thingsEntity.setPrisonerByOwner(prisonerEntity);
        thingsRepository.save(thingsEntity);
    }

    @Transactional
    public  ThingsEntity changeName(ThingsEntity thingsEntity, String name){
        thingsEntity.setName(name);
        thingsRepository.save(thingsEntity);
        return (thingsEntity);
    }

    @Transactional
    public  ThingsEntity changeDescription(ThingsEntity thingsEntity, String description){
        thingsEntity.setDescription(description);
        thingsRepository.save(thingsEntity);
        return (thingsEntity);
    }
    @Transactional
    public  ThingsEntity changePrice(ThingsEntity thingsEntity, Integer price){
        thingsEntity.setPrice(price);
        thingsRepository.save(thingsEntity);
        return (thingsEntity);
    }
    @Transactional
    public  ThingsEntity changeOwner(ThingsEntity thingsEntity, PrisonerEntity prisonerEntity){
        thingsEntity.setPrisonerByOwner(prisonerEntity);
        thingsRepository.save(thingsEntity);
        return (thingsEntity);
    }


}
