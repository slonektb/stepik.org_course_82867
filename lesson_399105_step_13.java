/*

Последняя цифра

Дано произвольное положительное целое число. Найдите его последнюю цифру.

Sample Input:

345

Sample Output:

5

*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a%10);
    }
}