package repository;

import entities.NewsEntity;
import entities.VideosEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository extends CrudRepository<NewsEntity, String> {
    NewsEntity findNewsEntityByNameEquals(String name);
    List<NewsEntity> findNewsEntitiesByVideosByVideo(VideosEntity videosEntity);
    List<NewsEntity> findNewsEntitiesByTextIsStartingWith(String text);
}