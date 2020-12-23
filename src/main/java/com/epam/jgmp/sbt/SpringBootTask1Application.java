package com.epam.jgmp.sbt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTask1Application implements CommandLineRunner {

  private static final Logger logger = LoggerFactory.getLogger(SpringBootTask1Application.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringBootTask1Application.class, args);
  }

  //Approach #1 for CommandLineRunner - implement interface ans override run()
  @Override
  public void run(String... args) throws Exception {
    logger.info("hello world");
  }

/*
   //Approach #2 for CommandLineRunner - create a bean of CommandLineRunner
  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext context) {
    return args -> {
      logger.info("hello world");
    };
  }
*/
}
