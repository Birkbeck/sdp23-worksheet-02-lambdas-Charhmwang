import java.util.Arrays;
import java.util.Comparator;

public class Outline {

  public static String[] getWords() {
//    return new String[] {
//            "software design programming",
//            "computing systems",
//            "information systems",
//            "programming in java",
//            "data knowledge management",
//            "cloud computing"
//    };
    return new String[] {
            "fly",
            "ants",
            "bats",
            "piglets",
            "gorillas",
            "cat",
            "hamster",
            "emus",
            "tiger" };
  }

  // Create a words array
  // Sort the array by length (i.e., shortest to longest)
  public static void question_1_1() {
    String[] words = getWords();
    Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
    // Alternatively
    // Arrays.sort(words, Comparator.comparingInt(String::length));
    System.out.println("1.1: " + Arrays.asList(words));
  }

  // Sort the array by reverse length (i.e., longest to shortest)
  public static void question_1_2() {
    String[] words = getWords();
    Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
    // Alternatively
    // Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
    System.out.println("1.1: " + Arrays.asList(words));
  }

  // Sort the array by comparing first character
  public static void question_1_3() {
    String[] words = getWords();
    Arrays.sort(words, Comparator.comparingInt(a -> a.charAt(0)));
    // Alternatively
    // Arrays.sort(words, (a, b) -> Integer.compare(a.charAt(0), b.charAt(0)));
  }

  // Sort the array by Strings that contain `"e"` first, everything else second.
  public static void question_1_4() {
    String[] words = getWords();
    Arrays.sort(words, (a, b) -> {
      if ( a.contains("e") && !(b.contains("e")) ) return -1;
      if ( b.contains("e") && !(a.contains("e")) ) return 1;
      return 0;
    });
    System.out.println("1.4:" + Arrays.asList(words));
  }



  public static void main(String...args) {

      question_1_1();
      question_1_2();
      question_1_3();
      question_1_4();
  }
}
