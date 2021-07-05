/*

Количество элементов, больших предыдущего

Последовательность состоит из натуральных чисел и завершается числом 0. Определите, сколько элементов этой последовательности больше предыдущего элемента. Гарантируется ввод хотя бы двух ненулевых чисел.

Числа, следующие за числом 0, считывать не нужно.

Sample Input:

8
11
21
0

Sample Output:

2

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = 0;
        while(a != 0) {
            int b = sc.nextInt();
            if(a < b) {sum ++;}
            a = b;
        }
        System.out.println(sum);
    }
}

















