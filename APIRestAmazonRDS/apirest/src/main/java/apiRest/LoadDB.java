package apiRest;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(LoadDB.class);
    @Bean
    CommandLineRunner applicationRunner(EmployeeRepository employeerepository){
        return args -> {
            log.info( "Log of event save user 1: " + employeerepository.save(new Employee("Maria Silva","Chef",
                    "avenida silveira dutra 1002")));
            log.info("log of event save user 2:" + employeerepository.save(new Employee("John Dutra","Mecanico",
                    "rua joao freire 231")));
        };
    }

}
