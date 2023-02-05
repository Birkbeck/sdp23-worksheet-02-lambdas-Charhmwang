public class StringUtils {
    public static int echecker(String s1, String s2) {
        if (s1.contains("e") & !s2.contains("e")) return -1;
        if (s2.contains("e") & !s1.contains("e")) return 1;
        return 0;
    }

    public static String betterString(String s1, String s2, TwoStringPredicate lambda) {
        return lambda.findBest(s1, s2) ? s1 : s2;
    }

    public static <T> T betterElement(T e1, T e2, TwoElementPredicate<T> lambda) { // Don't forget <T> after TwoElementPredicate
        return lambda.findBest(e1, e2) ? e1 : e2;
    }
}
