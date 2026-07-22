// import java.util.Scanner;

// public class secondsem {

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print("ente the name :\t");
//         String name = input.nextLine();
//         System.out.println("hello" + name);
//         input.close();

//     }
// }

// import java.util.Scanner; 
// public class secondsem {
//     public static void main(String[]args) {

//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter the name :");
//         String name = scan.nextLine();
//         System.out.println("hello mr " + name );
//         scan.close();

//     }
// }

import java.util.Scanner;

public class secondsem {
    public static void main(String[] args) {
        // boolean isStudent = false;

        // if (isStudent) {
        // System.out.println("he is the student ");
        // } else {
        // System.out.println("he is not student");
        // }
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name :");
        String name2 = scan.nextLine();

        System.out.print("enter your age :");
        int age = scan.nextInt();
        System.out.println("are you student(true/false) : ");
        boolean isStudent = scan.nextBoolean();

        System.out
                .println("your name is  " + name2 + "you are " + age + "yrs old and your are student :  " + isStudent);

        scan.close();

    }
}