/*

Координатные четверти

Даны координаты двух точек на плоскости, требуется определить, лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).
Входные данные

Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).
Выходные данные

Программа должна вывести слово YES, если точки находятся в одной координатной четверти, в противном случае вывести слово NO.

Sample Input 1:

1 1 2 2

Sample Output 1:

YES

Sample Input 2:

-1 3 4 -5

Sample Output 2:

NO

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(((x1*x2>0) && (y1*y2>0)) ? "YES" : "NO");
    }
}