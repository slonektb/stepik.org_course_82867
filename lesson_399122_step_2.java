/*

Много вставок

Создайте список, содержащий строковые представления первых n  натуральных чисел. Затем добавьте в список k элементов на нужные позиции.

Входные данные:

На первой строчке вводится число n, на второй число k. Затем вводится k пар чисел. В каждой паре первое число - объект, который надо вставить в список, а второе - индекс, куда его нужно вставить, гарантируется, что все индексы корректны.  

Выходные данные:

Выведите полученный список на экран через пробел.

Sample Input:

5
3
3 0
4 2
9 5

Sample Output:

3 1 4 2 3 9 4 5

*/

import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < n;i++) {
            myList.add(i+1);
        }
        int k = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < k;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            myList.add(b,a);
        }
        String outList = "";
        for (Integer itm : myList) {
            outList = outList + itm + " ";
        }
        System.out.println(outList.trim());
    }
}