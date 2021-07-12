/*

Создание списка

Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.  

Sample Input:

3

Sample Output:

1 0 0 0 1

*/

import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        for (int i = 1; i <= n; i++) {
            intList.add(0);
        }
        intList.add(1);
        for (Integer itm: intList) {
            System.out.print(itm + " ");
        }
    }
}