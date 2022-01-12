package co.pragra.learninf.springbootaop;

import co.pragra.learninf.springbootaop.model.Car;
import co.pragra.learninf.springbootaop.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootAopApplication {
    private Car car;

    @Autowired
    public SpringbootAopApplication(Car car) {
        this.car = car; // Constructor Injection
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAopApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println(car);
        };
    }

}
