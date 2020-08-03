import br.edu.java.notification.EmailNotificationService;
import br.edu.java.notification.NotificationService;
import br.edu.java.notification.SMSNotificationService;
import br.edu.java.service.ActivationService;

public class App {
  public static void main(String[] args) {
    final String notificationMethod = "sms";

    NotificationService ns = notificationMethod.equals("sms")
      ? new SMSNotificationService()
      : new EmailNotificationService();

    ActivationService ac = new ActivationService(ns);
    ac.activate();
  }
}
