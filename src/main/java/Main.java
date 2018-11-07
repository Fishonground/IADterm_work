import config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;
import repository.ВещиRepository;

import javax.persistence.EntityManager;
import java.util.Properties;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(PropertiesConfig.class);
        ВещиRepository вещиRepository = (ВещиRepository) ctx.getBean("вещиRepsitory");

    }
}
