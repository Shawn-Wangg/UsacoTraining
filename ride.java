/*
ID: embermi1
LANG: JAVA
TASK: ride
*/
import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class ride {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter("ride.out","UTF-8");
        Scanner sc = new Scanner(new File("ride.in"));
        String first = sc.nextLine();
        String second = sc.nextLine();
        int F = 1;
        int S = 1;
        for (int i = 0; i <first.length() ; i++) {
            F = F * (first.charAt(i)-64);
        }
        for (int i = 0; i <second.length() ; i++) {
            S = S * (second.charAt(i)-64);
        }

        F = F % 47;
        S = S % 47;

        if (F == S){
            out.println("GO");
        } else {
            out.println("STAY");
        }
        out.close();
    }
}
