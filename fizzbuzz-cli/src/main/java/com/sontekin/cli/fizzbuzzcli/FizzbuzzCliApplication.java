package com.sontekin.cli.fizzbuzzcli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzbuzzCliApplication {

    private static final Logger LOG = LoggerFactory.getLogger(FizzbuzzCliApplication.class);

    @Bean
    public CommandLineRunner run() throws Exception{
        return args -> {
          LOG.info("Starting fizbuzz cli");
          for(int i = 1; i <= 100; i++){
              StringBuilder builder = new StringBuilder();
              if(i % 3 == 0){
                  builder.append("Fizz");
              }
              if (i % 5 == 0){
                  builder.append("Buzz");
              }
              if (builder.length() == 0){
                  builder.append(i);
              }
              LOG.info(builder.toString());
          }
          LOG.info("Stopping fizbuzz cli");
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(FizzbuzzCliApplication.class, args);
    }

}
