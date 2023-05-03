package Bridglabz;
import java.util.regex.*;

public class User {
    static Pattern pattern = Pattern.compile("^[A-Za-z0-9.,@#$_%+-]{8}+$");
    public static void main(String[] args){
            System.out.println("welcome to regex program");
            String pass="Deep95@p";
            Matcher matcher = pattern.matcher(pass);
            if (matcher.matches()) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
            System.out.println(pass);
        }
    }

