class EmailSubscriber implements NewsSubscriber {
    private String subscriberEmail;

    public EmailSubscriber(String email) {
        this.subscriberEmail = email;
    }

    @Override
    public void update(String news) {
        System.out.println("Email Subscriber (" + subscriberEmail + ") - Received news: " + news);
    }
}