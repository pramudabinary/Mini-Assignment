package lk.example.test;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@SpringBootApplication
public class SpringBootAppInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppInitializer.class);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
