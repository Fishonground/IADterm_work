package serviseImpl;

import entities.VideosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import repository.VideosRepository;

import javax.transaction.Transactional;

public class Videos {
    @Autowired

    VideosRepository videosRepository;

    @Transactional
    public void createNewVideo(Integer id, Integer cam_id, String description){

        VideosEntity videosEntity = new VideosEntity();
        videosEntity.setId(id);
        videosEntity.setCamId(cam_id);
        videosEntity.setDescription(description);
        videosRepository.save(videosEntity);

    }

    @Transactional
    public VideosEntity changeDescription(VideosEntity videosEntity, String description){
        videosEntity.setDescription(description);
        videosRepository.save(videosEntity);
        return videosEntity;
    }

    @Transactional
    public VideosEntity changeCamId(VideosEntity videosEntity, Integer cam_id){
        videosEntity.setCamId(cam_id);
        videosRepository.save(videosEntity);
        return videosEntity;
    }

}
