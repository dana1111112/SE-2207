import java.util.List;
import java.util.ArrayList;


class NewsAgency implements NewsPublisher {
    private List<NewsSubscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void publishNews(String news) {
        this.latestNews = news;
        notifySubscribers(news);
    }

    @Override
    public void registerSubscriber(NewsSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(NewsSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (NewsSubscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}





