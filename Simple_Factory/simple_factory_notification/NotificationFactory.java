
public class NotificationFactory {
    public static Notification createNotification(String tipo) {

        switch (tipo.toLowerCase()) {
            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

            case "email":
                return new EmailNotification();

            default:
                return null;
        }
    }
}
