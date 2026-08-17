import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options {

    private Scanner scnr;
    private Menu menu;
    private UrlGenerator generator;
    private List<ShortUrl> urls;

    public Options() {
        scnr = new Scanner(System.in);
        menu = new Menu();
        generator = new UrlGenerator();
        urls = new ArrayList<>();
    }

    public void userSelection() {

        while (true) {

            menu.menu();

            System.out.print("Select an option: ");

            if (!scnr.hasNextInt()) {
                System.out.println("Please enter a number.");
                scnr.nextLine();
                continue;
            }

            int selection = scnr.nextInt();
            scnr.nextLine();

            switch (selection) {

                case 1:
                    createShortUrl();
                    break;

                case 2:
                    viewUrls();
                    break;

                case 3:
                    accessUrl();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid selection.");
            }

            System.out.println();
        }
    }

    private void createShortUrl() {

        System.out.print("Enter the URL you want to shorten: ");
        String originalUrl = scnr.nextLine();

        String shortCode = generator.generateShortCode();

        ShortUrl shortUrl = new ShortUrl(originalUrl, shortCode);

        urls.add(shortUrl);

        System.out.println();
        System.out.println("URL shortened!");
        System.out.println("Original URL: " + originalUrl);
        System.out.println("Short URL: " + shortCode);
    }

    private void viewUrls() {

        if (urls.isEmpty()) {
            System.out.println("No shortened URLs found.");
            return;
        }

        System.out.println("\n--- SHORTENED URLS ---");

        for (int i = 0; i < urls.size(); i++) {

            System.out.println();
            System.out.println("URL #" + (i + 1));
            System.out.println(urls.get(i));
        }
    }

    private void accessUrl() {

        if (urls.isEmpty()) {
            System.out.println("No shortened URLs found.");
            return;
        }

        System.out.print("Enter the short code: ");
        String shortCode = scnr.nextLine();

        for (ShortUrl url : urls) {

            if (url.getShortCode().equalsIgnoreCase(shortCode)) {

                url.incrementClickCount();

                System.out.println();
                System.out.println("Redirecting to:");
                System.out.println(url.getOriginalUrl());
                System.out.println("Click count: " + url.getClickCount());

                return;
            }
        }

        System.out.println("Short code not found.");
    }
}