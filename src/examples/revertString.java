package examples;

import org.jetbrains.annotations.NotNull;

public class revertString {
    public static void main(String[] args) {
        String original = "abcd xyz 12345";
        System.out.println(reverseEverything(original));

    }

    @NotNull
    private static String reverseEverything(String s){

        return new StringBuffer(s).reverse().toString();
    }
}
