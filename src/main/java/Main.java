import config.PropertiesConfig;
import entities.PeopleEntity;
import serviseImpl.People;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.PeopleRepository;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(PropertiesConfig.class);

        People people = ctx.getBean(People.class);

        /*PeopleEntity peopleEntity= new PeopleEntity();
        peopleEntity.setId(4);
        peopleEntity.setGender("Smth");
        peopleEntity.setName("Dima");
        peopleEntity.setSurname("Nosikov");
        peopleEntity.setSecondName("Dont");
        peopleEntity.setDateOfBirth(new Date(new java.util.Date().getTime()));
        peopleEntity.setÔîòî("/photo");
        peopleRepository1.save(peopleEntity);*/
        //PeopleEntity peopleEntity1 = new PeopleEntity();

        PeopleEntity peopleEntity = people.createNewPeople(4, "Male", "Dima", "Nosikov", "Noname", "/photo1");
        //peopleRepository1.save(peopleEntity)    ;
    }
}
