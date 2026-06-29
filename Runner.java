import java.util.regex.*;
import java.util.*;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(\\w+)\\s+(\\w+)[:,-]?\\s*((?:\\+61|0)4[-\\s]*\\d{2}[-\\s]*\\d{3}[-\\s]*\\d{3})");
        
        System.out.println("");
        System.out.println("Give a String of text that you want to find the phone numbers of (Australian phone numbers).");
        System.out.println("Captures the first two words before the number as well.");

        while(true){

            String input = sc.nextLine();
            int matchCount = 0;

            if(input.isEmpty()){
                break;
            }
            System.out.println("Input: [" + input + "].");
            System.out.println("");


            Matcher matcher = pattern.matcher(input);
            boolean found = false;

            while(matcher.find()){
                System.out.println("Match Found!");
                System.out.println("Match: " + matcher.group());            
                System.out.println("");

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

        sc.close();
    }
}