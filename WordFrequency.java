import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String input;
        HashMap<String, Integer> wordsFrequency = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the sentence to count word frequency.");
        input = in.nextLine();
        for (String word : input.split(" ")) {
            wordsFrequency.put(word, wordsFrequency.getOrDefault(word, 0) + 1);
        }

        wordsFrequency.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(w -> System.out.println(w.getValue() + " " + w.getKey()));
    }
}
