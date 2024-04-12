package com.au.example.springbootauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class SpringBootAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAuthServerApplication.class, args);
    }


    @Bean
    InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        var userOne = User.withDefaultPasswordEncoder()
                .username("one")
                .password("password")
                .roles("user","admin")
                .build();

        var userTwo = User.withDefaultPasswordEncoder()
                .username("two")
                .password("password")
                .roles("user")
                .build();
        return new InMemoryUserDetailsManager(userOne,userTwo);
    }

}
