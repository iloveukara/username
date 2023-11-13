/* 
Kara Caitlin Magno 
CPE 101 
PLD 
 */

import java.io.CharArrayReader;
import java.util.Scanner;
public class StringACT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three first names: ");
        String name1= scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        System.out.println("Possible names are: ");
        String s1 = name1 + " " + name2;
        String s2 = name1 + " " + name3;
        String s3 = name2 + " " + name1;
        String s4 = name2 + " " + name3;
        String s5 = name3 + " " + name1;
        String s6 = name3 + " " + name2;

        System.out.println("1 - " + s1);
        System.out.println("2 - " + s2);
        System.out.println("3 - " + s3);
        System.out.println("4 - " + s4);
        System.out.println("5 - " + s5);
        System.out.println("6 - " + s6);

        System.out.print("Enter 1-6 select a name: ");
        int iSelectName = scanner.nextInt();

        if(iSelectName == 1) { 
            System.out.println("Initials for " + s1 + " is " + name1.charAt(0) + name2.charAt(0)); 
            System.out.print("Suggested username: " + s1.toLowerCase().replace(" ", "_"));
        }
        else if (iSelectName == 2) {
            System.out.println("Initials for " + s2 + " is " + name1.charAt(0) + name3.charAt(0) ); 
            System.out.print("Suggested username: " + name1.toLowerCase() + "_" + name3.toLowerCase() );
        }
        else if (iSelectName == 3) {
            System.out.println("Initials for " + s3 + " is " + name2.charAt(0) + name1.charAt(0) ); 
            System.out.print("Suggested username: " + name2.toLowerCase() + "_" + name1.toLowerCase() );
        }
        else if (iSelectName == 4) {
            System.out.println("Initials for " + s4 + " is " + name2.charAt(0) + name3.charAt(0) ); 
            System.out.print("Suggested username: " + name2.toLowerCase() + "_" + name3.toLowerCase() );
        }
        else if (iSelectName == 5) {
            System.out.println("Initials for " + s5 + " is " + name3.charAt(0) + name1.charAt(0) ); 
            System.out.print("Suggested username: " + name3.toLowerCase() + "_" + name1.toLowerCase() );
        }
        else {
            System.out.println("Initials for " + s6 + " is " + name3.charAt(0) + name2.charAt(0) ); 
            System.out.print("Suggested username: " + name3.toLowerCase() + "_" + name2.toLowerCase() );
        }

        

       


    }
}