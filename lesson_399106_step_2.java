/*

Путь

Напишите программу, которая по введённым времени и скорости найдёт пройденный путь. Сначала вводится время движения, затем скорость.

Sample Input:

5
10

Sample Output:

50

*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println("" + (v * t));
    }
}