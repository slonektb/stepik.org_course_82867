/*

Напишите программу, которая считывает три целых числа и выводит их произведение. 

Sample Input:

5 4 2

Sample Output:

40



*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new  Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a*b*c);
    }
}