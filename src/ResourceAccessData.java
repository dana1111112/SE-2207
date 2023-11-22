public class ResourceAccessData {

    private static final ResourceAccessData INSTANCE = new ResourceAccessData();

    private String apiKey;

    private ResourceAccessData() {
        // Инициализация данных о доступе к ресурсам
        apiKey = "YOUR_API_KEY";
    }

    public static ResourceAccessData getInstance() {
        return INSTANCE;
    }

    public String getApiKey() {
        return apiKey;
    }


}
