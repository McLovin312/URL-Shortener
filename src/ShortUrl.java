public class ShortUrl {

    private String originalUrl;
    private String shortCode;
    private int clickCount;

    public ShortUrl(String originalUrl, String shortCode) {
        this.originalUrl = originalUrl;
        this.shortCode = shortCode;
        this.clickCount = 0;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortCode() {
        return shortCode;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void incrementClickCount() {
        clickCount++;
    }

    @Override
    public String toString() {
        return "Original URL: " + originalUrl +
                "\nShort Code: " + shortCode +
                "\nClicks: " + clickCount;
    }
}