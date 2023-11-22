import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        TextFileReader reader;

        reader = new TxtFileReader();
        reader.readFile("example.txt");

        PdfFileReader pdfReader = new PdfFileProcessor();
        reader = new PdfFileReaderAdapter(pdfReader);
        reader.readFile("example.pdf");

        // decorator
        Notification appNotification = new AppDecorator(new Message());
        Notification appEmailSMSNotification = new AppDecorator(new EmailDecorator(new SMSDecorator(new Message())));

        System.out.println(appNotification.send());
        System.out.println(appEmailSMSNotification.send());
        // decorator

        //observer
        NewsAgency newsAgency = new NewsAgency();
        EmailSubscriber emailSubscriber1 = new EmailSubscriber("@John");
        EmailSubscriber emailSubscriber2 = new EmailSubscriber("@Dana");
        OfflineSubscriber offlineSubscriber1 = new OfflineSubscriber("New York");
        OfflineSubscriber offlineSubscriber2 = new OfflineSubscriber("Astana");
        NumberSubscribers numberSubscriber1 = new NumberSubscribers("777");
        NumberSubscribers numberSubscriber2 = new NumberSubscribers("888");



        newsAgency.registerSubscriber(emailSubscriber1);
        newsAgency.registerSubscriber(emailSubscriber2);
        newsAgency.registerSubscriber(offlineSubscriber1);
        newsAgency.registerSubscriber(offlineSubscriber2);
        newsAgency.registerSubscriber(numberSubscriber1);
        newsAgency.registerSubscriber(numberSubscriber2);

        newsAgency.publishNews("New technology breakthrough!");
        newsAgency.publishNews("Weather update: Storm warning in coastal areas");

        newsAgency.removeSubscriber(offlineSubscriber1);

        newsAgency.publishNews("Local elections postponed");
       //Observer

        //singleton

                ResourceAccessData data = ResourceAccessData.getInstance();

                String apiKey = data.getApiKey();


                System.out.println("API KEY: " + apiKey);
        //singleton


        //strategy

                List<News> newsList = new ArrayList<>();
                newsList.add(new News("Title1", "Content1"));
                newsList.add(new News("Title2", "Content2"));

                NewsSortingStrategy relevanceStrategy = new DefaultNewsSortingStrategy();
                NewsSortingStrategy popularityStrategy = new PopularityNewsSortingStrategy();
                NewsSortingStrategy recencyStrategy = new RecencyNewsSortingStrategy();

                NewsSorter newsSorter = new NewsSorter(relevanceStrategy);

                System.out.println("Sorted by Relevance:");
                List<News> sortedNews = newsSorter.sortNews(newsList);
                displayNews(sortedNews);

                // Change sorting strategy dynamically
                newsSorter.setSortingStrategy(popularityStrategy);
                sortedNews = newsSorter.sortNews(newsList);
                System.out.println("\nSorted by Popularity:");
                displayNews(sortedNews);
            }

            private static void displayNews(List<News> newsList) {
                for (News news : newsList) {
                    System.out.println("Title: " + news.getTitle() + ", Content: " + news.getContent());
                }
            }


            //strategy
    //factory












}




