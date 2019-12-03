package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import project.beans.Person;
import project.repositories.PersonRepo;

@ComponentScan({"project"})
@SpringBootApplication
public class MongoDbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MongoDbApplication.class, args);
		System.out.println("Started MongoDB application");
		PersonRepo personRepository = ctx.getBean(PersonRepo.class);
		Person p1 = new Person(1, "matan", "ofri");
		personRepository.save(p1);
		System.out.println("End of application");
	}

}
