/*

Max swap Min 

С клавиатуры вводится число n (n >= 2) за ним вводится n действительных чисел. Ваша задача - поменять местами максимальный и минимальный элементы. после чего выведите на экран массив через пробел. Гарантируется, что максимальный и минимальный элементы содержатся в единственном экземпляре.

Sample Input:

6
0.5 6.0 -7.0 3.0 -2.67 12.0

Sample Output:

0.5 6.0 12.0 3.0 -2.67 -7.0

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double min = 1000;
        int minI = 0;
        double max = 0;
        int maxI = 0;
        double[] num = new double[n];
        for (int i = 0;i < n; i++) {
            num[i] = sc.nextDouble();
            if (max < num[i]) {
                max = num[i];
                maxI = i;
            }
            if (min > num[i]) {
                min = num[i];
                minI = i;
            }
        }
        double buf = num[minI];
        num[minI] = num[maxI];
        num[maxI] = buf;
        String res = "";
        for (int i = 0;i < n;i++) {
            res = res + num[i] + " ";
        }
        System.out.println(res.trim());
    }
}