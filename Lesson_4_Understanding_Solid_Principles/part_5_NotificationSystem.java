public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService();
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}
public interface Notification {
    void send(String message);
}

public class EmailService implements Notification {
    public void send(String message) {
        // Send email logic
    }
}

public class SmsService implements Notification {
    public void send(String message) {
        // Send SMS logic
    }
}

public class NotificationService {
    private Notification notificationService;

    public NotificationService(Notification notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.send(message);
    }
}
