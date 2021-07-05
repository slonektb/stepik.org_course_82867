/*

Квадраты

Пользователь вводит натуральное число. Необходимо вывести все полные квадраты натуральных чисел, не превосходящие этого числа.

Sample Input:

17

Sample Output:

1
4
9
16

*/

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (n >= i*i) {
            System.out.println(i*i);
            i++;
        }
    }
}


