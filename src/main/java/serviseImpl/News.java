package serviseImpl;

import entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.NewsRepository;

public class News {
    @Autowired
    NewsRepository newsRepository;


    @Transactional
    public void CreateNewNews(String name, String text, VideosEntity videosEntity){
        NewsEntity newsEntity = new NewsEntity();
        newsEntity.setName(name);
        newsEntity.setText(text);
        newsEntity.setVideosByVideo(videosEntity);
        newsRepository.save(newsEntity);

    }

    @Transactional
    public  NewsEntity changeText(NewsEntity newsEntity, String text){
        newsEntity.setName(text);
        newsRepository.save(newsEntity);
        return (newsEntity);
    }

}
