import java.util.*;

public class labEx1_2 {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer(
            "ITI develops people and ITI house of developers and ITI for people", " "
        );

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
