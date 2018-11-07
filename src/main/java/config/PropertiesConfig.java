package config;


import com.jcraft.jsch.JSch;
//import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

//import com.jcraft.jsch.jcraft.*;

@Configuration
@EnableJpaRepositories("repository")
@ComponentScan("repository")
public class PropertiesConfig {


    private String username = "s209617";

    private String password = "vvx757";

    private String url = "jdbc:postgresql://localhost:63333/studs";

    private String driver = "org.postgresql.Driver";

    private String dialect = "org.hibernate.dialect.PostgreSQL95Dialect";

    private String ddl = "update";

    private String packageToScan = "entities";

    private String sshUser = "s209617";

    private String sshHost = "helios.cs.ifmo.ru";

    private String sshPassword = "vvx757";


    @PostConstruct
    public void init(){
        try {
            JSch jSch = new JSch();
            Session session = jSch.getSession(sshUser, sshHost, 2222);
            session.setPassword(sshPassword);
            Properties properties = new Properties();
            properties.put("StrictHostKeyChecking", "no");
            session.setConfig(properties);
            session.connect();
            session.setPortForwardingL(63333, "pg", 5432);
        }catch (JSchException e){
            e.printStackTrace();
        }
    }


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("db.hibernate.dialect", dialect);
        properties.setProperty("db.hibernate.hbm2ddl.auto", ddl);
        return properties;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws JSchException {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan(packageToScan);
        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
        return entityManagerFactoryBean;
    }

    @Bean
    @Lazy
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}
