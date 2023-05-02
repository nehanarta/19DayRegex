package Bridglabz;
import java.util.regex.*;

public class User {
    static Pattern pattern=Pattern.compile("^(\\+?\\+[0-9]{2})+[0-9]{10}$");
    public static void main(String[] args){
            System.out.println("welcome to regex program");
            String MoNO="+918765432165";
            Matcher matcher = pattern.matcher(MoNO);
            if (matcher.matches()) {
                System.out.println("valid");
                System.out.println(MoNO);
            } else {
                System.out.println("invalid");
            }
        }
    }

