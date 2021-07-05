/*

Сколько элементов, равных максимуму?

Последовательность состоит из натуральных чисел и завершается числом 0. Всего вводится не более 10000 чисел (не считая завершающего числа 0). Определите, сколько элементов этой последовательности равны ее наибольшему элементу.

Числа, следующие за числом 0, считывать не нужно.

Sample Input:

1
2
4
5
2
5
3
0

Sample Output:

2

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int max = 0;
        int countMax = 0;
        int i = 0;
        while (true) {
            a = sc.nextInt();
            if (a == 0) {
                break;
            } else if (a > max) {
                max = a;
                countMax = 1;
            } else if (a == max) {
                countMax++;
            }
            i++;
            if (i == 10000 ) break;
        }

        System.out.println(countMax);
    }
}










                       
                    
                       















