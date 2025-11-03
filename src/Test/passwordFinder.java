package Test;
import java.util.Scanner;

public class passwordFinder {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int cms = 279;
        int pass = 9064;

        int cms1 = 232;
        int pass1 = 27419;

        System.out.println("Enter last 3 digits of cms: ");
        int inpCms = scn.nextInt();

        int diff = (cms1 - inpCms)*35;

        int outPass = pass1 - diff;

        System.out.println("@@" + outPass);





    }
}
