import config.database.PropertiesConfig;
import entities.UsersEntity;
import repository.UsersRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(PropertiesConfig.class);

        //People people = ctx.getBean(People.class);

        //Users users = ctx.getBean(Users.class);
        /*Users users1 = ctx.getBean(Users.class);
        UsersStatus usersStatus = ctx.getBean(UsersStatus.class);
        UsersStatusRepository usersStatusRepository = null;
        usersStatus.createNewUsersStatus(1,"Trainer");
        UsersStatusEntity usersStatusEntity;
        UsersEntity usersEntity = users1.CreateNewUser("123","I've done it", people.searchbyId(3),
                usersStatus.searchById(1));*/
        UsersRepository usersRepository = ctx.getBean(UsersRepository.class);

        UsersEntity usersEntity = usersRepository.findUsersEntityByLogin("I've done it");
        System.out.println(usersEntity.getPassword());
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


        //PeopleEntity peopleEntity = people.createNewPeople(6, "Male", "Dimon", "Nosikov", "Noname", "/photo1");

        //peopleRepository1.save(peopleEntity)

    }
}
