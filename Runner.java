import java.util.regex.*;
import java.util.*;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("((?:\\+61|0)4[-\\s]*\\d{2}[-\\s]*\\d{3}[-\\s]*\\d{3})");

        System.out.println("Give a String of text that you want to find the phone numbers of (Australian phone numbers)");

        while(true){

            String input = sc.nextLine();
            int matchCount = 0;

            if(input.isEmpty()){
                break;
            }
            System.out.println("Input: [" + input + "].");


            Matcher matcher = pattern.matcher(input);
            boolean found = false;

            while(matcher.find()){
                System.out.println("Match Found!");
                System.out.println(matcher.group());
                found = true;
                matchCount += 1;
            }

            System.out.println(matchCount + " matches found.");

            if(!found){
                System.out.println("No matches found!");
            }

            System.out.println("");
            System.out.println("Enter more text");

        }
        /*
        while (true) {

            if (input.isEmpty()) {
                break;
            }

            Matcher matcher = pattern.matcher(input);

            
            if (matcher.find()) {
                for (int i = 0; i < matcher.groupCount(); i++) {
                    System.out.println(matcher.group(i));
                    matcher.find();
                }

            }
            else {
                System.out.println("No matches found!");
            }
            

            System.out.println("Enter more text: ");
            input = sc.nextLine();
        }
        */

        sc.close();
    }
}