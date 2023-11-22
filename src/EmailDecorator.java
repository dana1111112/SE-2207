public class EmailDecorator extends NotificationDecorator{
    public EmailDecorator(Notification notification) { super(notification); }

    @Override
    public String send() {
        String email = "Sending notification with email";
        return super.send() + " " + email;
    }
}