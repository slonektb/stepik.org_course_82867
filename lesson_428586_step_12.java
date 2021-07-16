/*

Король

Требуется определить, бьет ли король, стоящий на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке. Напишите функцию king_step, которая принимает 4 целых числа  - сначала координаты клетки, в которой стоит король, а потом координаты клетки, в которой стоит фигура, которую он хочет побить. Ваша функция должна вывести на экран:

    1, если координаты короля некорректны;
    2, если координаты фигуры некорректны;
    3, если координаты совпадают;
    "YES"/"NO" - ответ на задачу, если всё в порядке.

Содержание функции main менять запрещено.

Sample Input 1:

2
3
2
4

Sample Output 1:

YES

Sample Input 2:

2
1
2
4

Sample Output 2:

NO

Sample Input 3:

-1
3
2
4

Sample Output 3:

1

Sample Input 4:

2
3
12
4

Sample Output 4:

2

Sample Input 5:

1
3
1
3

Sample Output 5:

3

*/

import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        king_step(x1, y1, x2, y2);
    }
    static void king_step(int x1,int y1,int x2, int y2) {
        if (x1 > 8 || x1 < 1 || y1 > 8 || y1 < 1) {
            System.out.println("1");
            return;
        }
        if (x2 > 8 || x2 < 1 || y2 > 8 || y2 < 1) {
            System.out.println("2");
            return;
        }
        if (x1 == x2 && y1 == y2) {
            System.out.println("3");
            return;
        }
        if (Math.abs(x1-x2) <= 1 && Math.abs(y1-y2) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}