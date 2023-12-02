package edu.fra.uas;

import edu.fra.uas.service.CompleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCompleteBeanLifeCycleApplication {

  @Autowired
  private CompleteService smallService;

  public static void main(String[] args) {
    SpringApplication.run(SpringCompleteBeanLifeCycleApplication.class, args);
  }

  @Bean
  CommandLineRunner init() {
    CommandLineRunner action = new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
        smallService.setBeanName("Issam");
        smallService.doSomething();
      }
    };
    return action;
  }
}
