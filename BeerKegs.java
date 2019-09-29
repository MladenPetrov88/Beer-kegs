import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegsCount = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double biggestKegVolume = 0;

        while (kegsCount > 0) {
            String currentKegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            double kegHeight = Double.parseDouble(scanner.nextLine());

            double currentVolume = Math.PI * kegRadius * kegRadius * kegHeight;

            if (currentVolume > biggestKegVolume) {
                biggestKegVolume = currentVolume;
                biggestKeg = currentKegModel;
            }

            kegsCount--;
        }

        System.out.printf("%s", biggestKeg);
    }
}
