public abstract class Notification {
    public abstract void notifyUser();
}

public class EmailNotification extends Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification.");
    }
}

public class SMSNotification extends Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification.");
    }
}

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equals("Email")) {
            return new EmailNotification();
        } else if (type.equals("SMS")) {
            return new SMSNotification();
        }
        return null;
    }
}
