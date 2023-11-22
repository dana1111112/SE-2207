class ConcreteNews implements NewsPresent {
    private String type;
    private String source;
    private String publicationDate;

    ConcreteNews(String type, String source, String publicationDate) {
        this.type = type;
        this.source = source;
        this.publicationDate = publicationDate;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getSource() {
        return source;
    }

    @Override
    public String getPublicationDate() {
        return publicationDate;
    }
}