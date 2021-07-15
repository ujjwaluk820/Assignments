package Capg;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.function.Consumer;

    public class FirstLetter {
    public static void main(String[] args) {
  
    List<String> wordList = new ArrayList<>();
    wordList.add("dog");
    wordList.add("cat");
    wordList.add("lion");
    wordList.add("animal");
    wordList.add("bird");
    wordList.add("snake");
    wordList.add("fish");
    wordList.add("dragon");
    wordList.add("No");
    Consumer<List<String>> firstLetter = a -> {
        StringBuilder s = new StringBuilder();

        a.forEach(firs -> s.append(firs.charAt(0)));
        System.out.println(s);
    };
    firstLetter.accept(wordList);
 }
}

