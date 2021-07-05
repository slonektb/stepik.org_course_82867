/*


Давайте для разнообразия решим эту задачу с помощью while.
Количество

Вводится 2 целых числа a и b (a <= b). Необходимо вычислить количество всех чисел кратных 3, но не кратных 5 от а до b включительно.

Sample Input:

1 16

Sample Output:

4

*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//
        int b = sc.nextInt();//

        int d = 0;
        int i = a;
        while(i <= b) {
            if (((i % 3) == 0) && ((i % 5) != 0)){
                d++;}
            i++;

        }
        System.out.print(d);
    }
}




