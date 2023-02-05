import javax.swing.text.Utilities;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
    System.out.println("1.2: " + Arrays.asList(words));
  }

  // Sort the array by comparing first character
  public static void question_1_3() {
    String[] words = getWords();
    Arrays.sort(words, Comparator.comparingInt(a -> a.charAt(0)));
    // Alternatively
    // Arrays.sort(words, (a, b) -> Integer.compare(a.charAt(0), b.charAt(0)));
    System.out.println("1.3: " + Arrays.asList(words));
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

  // Rewrite the final lambda sorting example,
  // but use a method reference in place of an explicit lambda.
  public static void question_2() {
    String[] words = getWords();
    Arrays.sort(words, StringUtils::echecker);
    System.out.println("2: " + Arrays.asList(words));
  }

  // Create a class with a static method called betterString which should take two Strings
  // and a lambda as its arguments;
  public static void question_3() {
    System.out.print("3: ");
    String test1 = "Software Design Programming";
    String test2 = "SDP";
    System.out.println(StringUtils.betterString(test1, test2, (s1, s2) -> (s1.length() < s2.length())));
    System.out.println(StringUtils.betterString(test1, test2, (s1, s2) -> true));
  }

  // Use generics to replace betterString with betterEntry and to
  // replace TwoStringPredicate with TwoElementPredicate.
  public static void question_4() {
    System.out.print("4: ");
    String test1 = "Software Design Programming";
    String test2 = "SDP";
    System.out.println(StringUtils.betterElement(test1, test2, (s1, s2) -> s1.length() < s2.length()));
    System.out.println(StringUtils.betterElement(test1, test2, (s1, s2) -> true));

    int i1 = 100;
    int i2 = 50;
    System.out.println(StringUtils.betterElement(i1, i2, (a, b) -> a < b));
    System.out.println(StringUtils.betterElement(i1, i2, (a, b) -> true));
  }

  // Create a static method called allMatches. It should take a List of Strings and a
  // Predicate<String>, and return a new List of all the values that passed the test.
  public static void question_5() {
    System.out.print("5: ");
    List<String> words = List.of(getWords());
    System.out.println(StringUtils.allMatches(words, s -> s.length() < 4));
    System.out.println(StringUtils.allMatches(words, s -> s.contains("b")));
    System.out.println(StringUtils.allMatches(words, s -> (s.length() % 2) == 0));
  }

  // Rewrite allMatches so that it works on any List and associated Predicate,
  // not just on Strings. Verify that the examples from the previous question still work.
  public static void question_6() {
    System.out.print("6: ");
    List<String> words = List.of(getWords());
    System.out.println(StringUtils.allTypeMatches(words, s -> s.length() < 4));
    System.out.println(StringUtils.allTypeMatches(words, s -> s.contains("b")));
    System.out.println(StringUtils.allTypeMatches(words, s -> (s.length() % 2) == 0));
  }

  public static void main(String...args) {

      question_1_1();
      question_1_2();
      question_1_3();
      question_1_4();
      question_2();
      question_3();
      question_4();
      question_5();
      question_6();
  }
}
