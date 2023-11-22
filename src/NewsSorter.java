import java.util.List;

class NewsSorter {
    private NewsSortingStrategy sortingStrategy;

    public NewsSorter(NewsSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(NewsSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public List<News> sortNews(List<News> newsList) {
        return sortingStrategy.sort(newsList);
    }
}