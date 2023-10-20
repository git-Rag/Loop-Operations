import java.util.*;

public class Loops {
    public static void main(String[]args ){
//        for (int counter = 0; counter < 100; counter = counter + 1){
//            System.out.println("Hello world!");
//
//
//
//        }

        // i++ is the same as counter = counter + 1 (i is a variable)

//        for (int i = 0; i < 11; i++){
//            System.out.println("Testing java");
//        }

//        for (int count = 0; count <13; count++){
//            System.out.println(count);
//        }


//        int i = 0;
//        while (i < 13){
//            System.out.println(i);
//            i = i + 1;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i = i + 1;
//        } while (i < 11);

        // Printing the sum of first n natural numbers

//        System.out.println("Write the number until which you want to create a loop: ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i = 0; i <= n; i++){
//            sum = sum + i;
//
//        }
//        System.out.println(sum);

        // Table of 2

//        System.out.println("Enter the number of which you want the table (only 2): ");
//        Scanner sc = new Scanner(System.in);
//        int table = sc.nextInt();
//        int tab = 2;
//        for (int counter = 1; counter < 11; counter++){
//            int mul = counter * tab;
//            System.out.println(mul);
//
//        }

        // In a less complex way for all the number tables

        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(table*i);
        }

    }
}
