package serviseImpl;

import entities.FactionEntity;
import entities.PrisonerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.FactionRepository;

public class Faction{
        @Autowired
    FactionRepository factionRepository;


        @Transactional
        public void CreateNewFaction(String name, PrisonerEntity prisonerEntity, Integer rating){
            FactionEntity factionEntity = new FactionEntity();
            factionEntity.setName(name);
            factionEntity.setPrisonerByMainPerson(prisonerEntity);
            factionEntity.setRating(rating);
            factionRepository.save(factionEntity) ;
        }

        @Transactional
        public  FactionEntity changeName(FactionEntity factionEntity, String name){
            factionEntity.setName(name);
            factionRepository.save(factionEntity);
            return (factionEntity);
        }

        @Transactional
        public  FactionEntity changeMain(FactionEntity factionEntity, PrisonerEntity prisonerEntity){
            factionEntity.setPrisonerByMainPerson(prisonerEntity);
            factionRepository.save(factionEntity);
            return (factionEntity);
        }
        @Transactional
    public  FactionEntity changeRating(FactionEntity factionEntity, Integer rating){
    factionEntity.setRating(rating);
    factionRepository.save(factionEntity);
    return (factionEntity);
}
}
