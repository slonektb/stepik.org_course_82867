/*

Выпуклый многоугольник

Вводится число n (n >= 3), затем даются координаты n точек построчно. Найдите периметр этого многоугольника и его площадь. Выведите ответ построчно. Округлите ваш ответ до сотых.

Sample Input:

4
0 0
4 0
4 4
0 4

Sample Output:

16.0
16.0


ЗАДАЧА НЕ ЗАВЕРШЕНА. 
НЕ ПРОХОДИТ ВСЕ ТЕСТЫ. 
СОХРАНЕНА, ЧТО БЫ ПОТОМ ВЕРНУТЬСЯ.

ЕСЛИ НАЙДЕТЕ В ЧЕМ ПРОБЛЕМА, ПРОСЬБЮА НАПИСАТЬ НА gb_alex@mail.ru
*/

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cX = new int[n];
        int[] cY = new int[n];
        for (int i = 0;i<n;i++) {
            cX[i] = sc.nextInt();
            cY[i] = sc.nextInt();
        }
        System.out.println(Math.round(perimeter(cX,cY) * 100) / 100.0);
        System.out.println(Math.round(area(cX,cY) * 100) / 100.0);

    }

    static double area(int[] x,int[] y) {
        double area = 0;
        for( int i = 1; i < x.length-1; i++ ) {
            area += x[i]*( y[i+1] - y[i-1] );
        }
        area = Math.abs(area /2);
        return area;
    }
    static double perimeter(int[] x,int[] y) {
        double p = 0;
        int n = x.length;
//        for (int i = 0; i < n-1; ++i)
//            p += Math.sqrt((x[i] - x[i+1])*(x[i] - x[i+1]) + (y[i] - y[i+1])*(y[i] - y[i+1]));
//        p += Math.sqrt((x[0] - x[n-1])*(x[0] - x[n-1]) + (y[0] - y[n-1])*(y[0] - y[n-1]));
        for (int i = 0; i < n; ++i) {
            int j = (i+1)%n;
            p += Math.sqrt((x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]));
        }
        return p;
    }

}