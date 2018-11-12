package repository;

import entities.VideosEntity;
import org.springframework.data.repository.CrudRepository;

public interface VideosRepository extends CrudRepository<VideosEntity, Integer> {
}
