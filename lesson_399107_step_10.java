/*

Слон

Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
Входные данные

Вводятся четыре числа: координаты слон (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
Выходные данные

Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход и NO - в противном случае.

Sample Input:

1 1 3 3

Sample Output:

YES

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if ((((a - c) == (b - d)) || ((a - c) == (d - b))) || (((c - a) == (b - d)) || ((a - c) == (d - b))) || ((a == c) && (b == d))) {
             System.out.println("YES");
        }else{
             System.out.println("NO");
        }
    }
}