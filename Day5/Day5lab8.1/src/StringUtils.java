
public class StringUtils {

    public static String betterString(String s1, String s2, Better check) {
        return check.isBetter(s1, s2) ? s1 : s2;
    }

    @FunctionalInterface
    interface Better {
        boolean isBetter(String a, String b);
    }

}
