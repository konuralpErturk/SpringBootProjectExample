package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student konuralp = new Student("Konuralp","konuralp.erturk01@gmail.com", LocalDate.of(1994, Month.JANUARY,17));
            Student alex = new Student("alex","alex.erturk01@gmail.com", LocalDate.of(2000, Month.JANUARY,17));
            repository.saveAll(List.of(konuralp,alex));
        };
    }
}
