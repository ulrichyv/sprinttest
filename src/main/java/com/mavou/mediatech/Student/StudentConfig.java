package com.mavou.mediatech.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;

@Configuration
public class StudentConfig {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mariam = new Student( null,"Mariam", "mariam@gmail.com", LocalDate.now());
           // studentRepository.save(mariam);
        };
    }
}