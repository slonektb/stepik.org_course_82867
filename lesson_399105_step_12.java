/*

Стоимость покупки

Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.

Программа получает на вход три числа: a, b, n.

Программа должна вывести два числа: стоимость покупки в рублях и копейках.

Sample Input:

10 15 2

Sample Output:

20 30

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = (a * 100 + b) * n;

        System.out.println("" + (sum/100) + " " + (sum%100));
    }
}