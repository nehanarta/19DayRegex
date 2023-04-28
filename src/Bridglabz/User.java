package Bridglabz;
import java.util.regex.*;

public class User {
    static Pattern pattern=Pattern.compile("^(.+)@(.+)$");
    public static void main(String[] args){
            System.out.println("welcome to regex program");
            String lastName="neha1.xyz@bl.co.in";
            Matcher matcher = pattern.matcher(lastName);
            if (matcher.matches()) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
            System.out.println(lastName);
        }
    }

