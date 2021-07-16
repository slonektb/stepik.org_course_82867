/*

Функция Аккермана

В теории вычислимости важную роль играет функция Аккермана A(m, n), определенная следующим образом:

Напишите рекурсивную функцию akkerman, которая принимает как аргумент два неотрицательных целых числа и возвращает значение этой функции.  Содержание функции main менять запрещено. 

Sample Input:

2
2

Sample Output:

7

*/

import java.util.Scanner;

class Programm{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(akkerman(m, n));
    }
    static int akkerman(int m,int n) {

        if (m > n && n == 0) return akkerman(m-1,1);
        if (m > 0 && n > 0) return  akkerman(m-1,akkerman(m,n-1));
        return n+1;
    }
}