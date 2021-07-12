/*

Стек

Напишите программу, которая реализует структуру данных стек, используя список.

Условие задачи таково: мальчик Петя использует свой стул в качестве многоместной вешалки. А именно: накидывает на него вещи. Иногда он забирает верхнюю вещь. Нужно вывести на экран порядок его вещей от спинку стула.

Сначала водится число n - количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

    push <одежда> - Петя вешает на стул элемент одежды
    pop - снимает одежду со стула. При этом на экран выводится запись вида "Петя взял <одежда>"

После выполнения всех запросов выведите оставшиеся на стуле вещи. Гарантируется, что название вещи состоит из одного слова.

Sample Input:

4
push Футболка
push Рубашка
pop
push Джинсы

Sample Output:

Петя взял Рубашка
Футболка Джинсы

*/

import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = "";
        String[] str1 = new String[2];
        ArrayList<String> intList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
            str1 = str.split(" ");
            if (str1[0].equals("push")) {
                intList.add(str1[1]);
            } else if (str1[0].equals("pop")) {
                System.out.println("Петя взял " + intList.remove(intList.size()-1));
            }
        }
        for (String itm: intList) {
            System.out.print(itm + " ");
        }
    }
}