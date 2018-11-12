import config.PropertiesConfig;
import entities.PeopleEntity;
import entities.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;
import repository.PeopleRepository;
import repository.UsersRepository;

import javax.persistence.EntityManager;
import java.sql.Date;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(PropertiesConfig.class);
        PeopleRepository peopleRepository = (PeopleRepository) ctx.getBean("peopleRepository");

        PeopleEntity peopleEntity= new PeopleEntity();
        peopleEntity.setId(1);
        peopleEntity.setGender("Hydro");
        peopleEntity.setName("Danya");
        peopleEntity.setSurname("Yyyy");
        peopleEntity.setDateOfBirth(new Date(new java.util.Date().getTime()));
        peopleRepository.save(peopleEntity);


    }
}
