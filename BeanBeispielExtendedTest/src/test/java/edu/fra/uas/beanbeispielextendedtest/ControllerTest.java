package edu.fra.uas.beanbeispielextendedtest;

import static org.assertj.core.api.Assertions.assertThat;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;
import org.apache.logging.log4j.message.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllerTest {

  @Autowired
  private BeanController beanController;

  @Autowired
  private MessageService messageService;

  @Test
  void testController() {
    assertThat(beanController.putMessage("Das ist ein Test"))
      .isEqualTo(" put message: Das ist ein Test");
  }

  @Test
  void testService() {
    assertThat(messageService.increment()).isEqualTo(1);
  }
}
