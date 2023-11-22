class NewsFactory {
    public static NewsPresent createNews(String type, String source, String publicationDate) {
        return new ConcreteNews(type, source, publicationDate);
    }
}