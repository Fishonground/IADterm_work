package serviseImpl;

import entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.MessagesRepository;

public class Messages {
    @Autowired
    MessagesRepository messagesRepository;

/* may be here will be better to use User twice? Not only prisoner*/
    @Transactional
    public void createNewPrisoner(Integer id, String message, PrisonerEntity prisonerEntity, UsersEntity usersEntity,VideosEntity videosEntity){
        MessagesEntity messagesEntity = new MessagesEntity();
        messagesEntity.setId(id);
        messagesEntity.setMassege(message);
        messagesEntity.setPrisonerByPrisoner(prisonerEntity);
        messagesEntity.setUsersByUser(usersEntity);
        messagesEntity.setVideosByVideo(videosEntity);
        messagesRepository.save(messagesEntity);
    }


}
