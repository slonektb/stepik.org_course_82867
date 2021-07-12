/*

Замена элемента

Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n) и строку s. Замените строкой s элемент на позиции m. Выведите список на экран через пробел.  

Sample Input:

5
2
Строка

Sample Output:

0 1 Строка 3 4

*/

import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> intList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            intList.add(""+i);
        }
        int m = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        intList.set(m,str);
        for (String itm: intList) {
            System.out.print(itm + " ");
        }
    }
}