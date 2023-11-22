class NumberSubscribers implements NewsSubscriber {
    private String subscriberNumber;

    public NumberSubscribers(String number) {
        this.subscriberNumber = number;
    }

    @Override
    public void update(String news) {
        System.out.println("App Subscriber (" + subscriberNumber + ") - Received news: " + news);
    }
}

