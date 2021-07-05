/*

Ферзь

Требуется определить, бьет ли ферзь, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные

Вводятся четыре числа: координаты ферзь (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные

Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input:

1 1 3 3

Sample Output:

YES

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int dx = (x1>x2) ? x1-x2:x2-x1;
        int dy = (y1>y2) ? y1-y2:y2-y1;

        System.out.println( (dx==0 || dy==0 || dx==dy) ? "YES" : "NO");
    }
}