package com.omma.wecare.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->  {
            Student mariam = new Student(
                    "Mariam",
                    "email.com",
                    LocalDate.of(1992, Month.JANUARY, 12),
                    23
            );
            Student amine = new Student(
                    "Amine",
                    "email.com",
                    LocalDate.of(1993, Month.JANUARY, 12),
                    24
            );
            studentRepository.saveAll( List.of(mariam, amine) );
        };
    }
}
