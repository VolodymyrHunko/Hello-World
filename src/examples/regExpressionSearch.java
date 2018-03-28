package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExpressionSearch {

    public static void main(String args[]){
        String content = "SSN is 456-34-8778 of Hunko Volodymyr";

        String pattern = ".*(4\\d{2}-?.*)"; //start from anything-> 3 digits start from '4'-> maybe '-' or not-> finish with anything
        String pattern2 = "^(SsN is ).*"; //Start with 'SsN is '-> finish with anything

        System.out.println("\nMatching pattern");
        boolean isMatch = Pattern.matches(pattern, content); //Pattern is a compiled representation of a regular expression.
        System.out.println("The text matches to pattern? " + isMatch);

        System.out.println("\nfor comparing -> String.contains()");
        boolean isContain = content.contains("456-34-8778 "); //the same effect by using String.contains()
        System.out.println("The String contains SSN word? " + isContain);

        System.out.println("\nMatching case insensitive pattern");
        Pattern patternString = Pattern.compile(pattern2, Pattern.CASE_INSENSITIVE); //compile Pattern to case insensitive
        Matcher isMatcher = patternString.matcher(content);
        boolean isContainPattern = isMatcher.matches();
        System.out.println("The text matches pattern2'? " + isContainPattern);

        System.out.println("\nExtracting pattern");
        Pattern pt = Pattern.compile("(Hunko|Gunko|Volodymyr)"); //to select pattern from options as 'OR'
        Matcher mch = pt.matcher(content);
        while (mch.find()) {
            System.out.println("Name is: "+mch.group()); //find ALL matcher from group of options
        }

        System.out.println("\nSubstitution");
        Pattern ptr = Pattern.compile("((SSN is )(\\d+-?\\d+-?\\d+))"); //grouping the pattern by include in ()
        Matcher match = ptr.matcher(content);
        StringBuffer result = new StringBuffer();
        while(match.find()) {
            System.out.println("First group is: "+match.group(1));
            System.out.println("Second group is: "+match.group(2));
            System.out.println("Therd group is: "+match.group(3));
            match.appendReplacement(result, match.group(2)+"***-**-****");//replace group #2 with new pattern
            match.appendTail(result);
        }
        System.out.println(result);
    }


}
