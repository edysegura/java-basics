package br.edu.java.notification;

public class SMSNotificationService implements NotificationService {

  @Override
  public void send(String message) {
    System.out.printf("Notification \"%s\" sent by SMS!\n", message);
  }

}
