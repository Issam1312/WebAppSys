package edu.fra.uas.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

  private String message;

  private int counter = 0;

  public int getcounter() {
    return counter;
  }

  public void setcounter(int counter) {
    this.counter = counter;
  }

  public int increment() {
    counter++;
    return counter;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
