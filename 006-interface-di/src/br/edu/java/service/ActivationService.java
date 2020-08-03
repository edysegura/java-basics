package br.edu.java.service;

import br.edu.java.notification.NotificationService;

public class ActivationService {
  private NotificationService notificationService;

  public ActivationService(NotificationService ns) {
    this.notificationService = ns;
  }

  public void activate() {
   notificationService.send("Service has been activated!");
  }
}
