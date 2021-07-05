/*

Котлеты

На сковородку одновременно можно положить k котлет. Каждую котлету нужно с каждой стороны обжаривать m минут непрерывно. За какое наименьшее время удастся поджарить с обеих сторон n котлет?
Входные данные

Вводятся 3 числа: k, m и n. Все числа не превосходят 32000.
Выходные данные

Вывести время, за которое все котлеты будут обжарены.

Sample Input 1:

1
5
1

Sample Output 1:

10

Sample Input 2:

2
4
3

Sample Output 2:

12

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (n<=k) {
            System.out.println("" + 2*m);
        } else if ((n*2%k)==0) {
            System.out.println("" + m*(n*2/k));
        } else {
            System.out.println("" + m*(1+(n*2/k)));
        }

    }
}