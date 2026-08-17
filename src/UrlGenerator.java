import java.util.Random;

public class UrlGenerator {

    private static final String LETTERS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final String NUMBERS =
            "0123456789";

    private Random random = new Random();

    public String generateShortCode() {

        StringBuilder code = new StringBuilder();

        // Generate 3 random letters
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(LETTERS.length());
            code.append(LETTERS.charAt(index));
        }

        // Generate 3 random numbers
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(NUMBERS.length());
            code.append(NUMBERS.charAt(index));
        }

        return code.toString();
    }

    public ShortUrl createShortUrl(String originalUrl) {

        String shortCode = generateShortCode();

        return new ShortUrl(originalUrl, shortCode);
    }
}