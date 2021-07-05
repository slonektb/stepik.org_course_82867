/*

Кто больше?

С клавиатуры вводятся два числа. Выведите на экран большее из них.

Sample Input:

8 11

Sample Output:

11

*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        if (v>t) {
            System.out.println("" + v);
        } else {
            System.out.println("" + t);
        }
       
    }
}