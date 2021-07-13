/*

Кратные 3

Последовательность состоит из натуральных чисел и завершается числом 0. Определите максимальный элемент кратный 3. если такого элемента нет, то выведите на экран "404".

Числа, следующие за числом 0, считывать не нужно.

Sample Input:

1 2 3 4 5 6 7 6 5 9 4 3 2 4 5 6 8 10 0

Sample Output:

9

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max3 = 0;
        int a = -1;
        while (a != 0) {
            a = sc.nextInt();
            if (a%3 == 0 && a > max3) max3 = a;
        }
        System.out.println("" + ((max3 > 0)?max3:"404"));
    }
}