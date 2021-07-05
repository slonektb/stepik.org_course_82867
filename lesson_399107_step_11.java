/*

Конь

Требуется определить, бьет ли конь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные

Вводятся четыре числа: координаты коня (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные

Требуется вывести слово YES, если конь сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input 1:

3 4 5 6

Sample Output 1:

NO

Sample Input 2:

7 3 5 4

Sample Output 2:

YES

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//
        int b = sc.nextInt();//
        int c = sc.nextInt();//
        int d = sc.nextInt();//

        if (Math.abs(a-c) * Math.abs(b-d) == 2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}