
public class AppDecorator extends NotificationDecorator{
    public AppDecorator(Notification notification) { super(notification); }

    @Override
    public String send() {
        String app = "Sending notification on Application";
        return super.send() + " " + app;
    }
}