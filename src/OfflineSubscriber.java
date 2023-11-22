class OfflineSubscriber implements NewsSubscriber {
    private String subscriberLocation;

    public OfflineSubscriber(String location) {
        this.subscriberLocation = location;
    }

    @Override
    public void update(String news) {
        System.out.println("Offline Subscriber (" + subscriberLocation + ") - Received news: " + news);
    }
}