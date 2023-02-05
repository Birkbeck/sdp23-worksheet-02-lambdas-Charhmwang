public class StringUtils {
    public static int echecker(String s1, String s2) {
        if (s1.contains("e") & !s2.contains("e")) return -1;
        if (s2.contains("e") & !s1.contains("e")) return 1;
        return 0;
    }

    public static String betterString(String s1, String s2, TwoStringPredicate lambda) {
        return lambda.findBest(s1, s2) ? s1 : s2;
    }
}
