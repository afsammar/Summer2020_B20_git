package utility;
import java.util.Scanner;
public class ReverseAstring {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    String [] words=sentence.split(" ");

    for(int i =words.length-1; i>=0; i--){
        System.out.println(words[i]);
    }
}}
