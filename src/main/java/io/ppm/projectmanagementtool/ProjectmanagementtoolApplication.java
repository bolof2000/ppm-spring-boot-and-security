package io.ppm.projectmanagementtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableMongoRepositories("io.ppm.projectmanagementtool.repository")
@ComponentScan("io.ppm.projectmanagementtool.*")
public class ProjectmanagementtoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectmanagementtoolApplication.class, args);
    }

}
