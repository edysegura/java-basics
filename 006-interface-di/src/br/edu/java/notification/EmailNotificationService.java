package br.edu.java.notification;

public class EmailNotificationService implements NotificationService {

  @Override
  public void send(String message) {
    System.out.printf("Notification \"%s\" sent by email!\n", message);
  }

}
