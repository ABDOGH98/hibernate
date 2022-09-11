package com.data.datalearning;

import com.data.datalearning.Repo.UserRepo;
import com.data.datalearning.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataLearningApplication.class, args);
    }
    CommandLineRunner runner(UserRepo userRepo){
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return args -> {
            session.save(new User(null,"abdo",15));
        };
    }
}