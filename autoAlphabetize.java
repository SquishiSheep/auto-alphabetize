import java.util.*;

public class autoAlphabetize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        System.out.println("Enter words (type 'end' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
            words.add(input);
        }

        Collections.sort(words);

        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
