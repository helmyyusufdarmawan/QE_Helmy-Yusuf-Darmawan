import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[^aeiouy]*[aeiouy]+(?:[^aeiouy]*$|[^aeiouy](?=[^aeiouy]))?", Pattern.CASE_INSENSITIVE);
        String n = input.nextLine();
        Matcher matcher = pattern.matcher(n);
        while (matcher.find()) {
            if (matcher.group().contains("o")) {
                System.out.print("-");
            } else {
                System.out.print(".");
            }
        }
    }
}
