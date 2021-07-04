/*

Сумма цифр

Дано трехзначное число. Найдите сумму его цифр.

Sample Input 1:

179

Sample Output 1:

17

Sample Input 2:

300

Sample Output 2:

3

*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        a = a1 / 100;
        b = (a1 % 100) / 10;
        c = (a1 % 100) % 10;
        int sum = a + b + c;

        System.out.println("" + sum);
    }
}