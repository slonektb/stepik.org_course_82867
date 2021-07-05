/*

Ладья

Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные

Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные

Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input 1:

2 2 2 5

Sample Output 1:

YES

Sample Input 2:

1 4 5 7

Sample Output 2:

NO

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if ((x1 == x2) || (y1 == y2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}