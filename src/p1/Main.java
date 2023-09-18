package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "TEST test test ttt tttttttttt";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }

        String input = "+12sads345678921";
        boolean result = input.matches("(\\+*)\\d{11}");
        if (result){
            System.out.println("Yes, it is phone number");
        }else {
            System.out.println("No");
        }

        String inp = "Hello666";
        boolean found = Pattern.matches("Hello", inp);
        if (found){
            System.out.println("Good");
        }else{
            System.out.println("Not found");
        }

        String s = "Hello";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(s);
        boolean f = matcher.matches();
        if (f){
            System.out.println("Found");
        }else{
            System.out.println("No");
        }

        String s1 = "Hello Java! Hello JavaScript! Hello JavaSE 8.";
        Pattern pattern1 = Pattern.compile("Java(\\w*)");
        Matcher matcher1 = pattern1.matcher(s1);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }
        String nStr = matcher1.replaceAll("HTML");
        System.out.println(nStr);

        String s2 = s1.replaceAll("Java(\\w*)", "HTML");
        System.out.println(s2);

        Pattern pattern2 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] w = pattern2.split(s1);
        for(String sw: w){
            System.out.println(sw);
        }






    }
}