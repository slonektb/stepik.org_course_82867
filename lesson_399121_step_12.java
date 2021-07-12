/*

Я Занимала!

Напишите программу, которая будет формировать очередь оформления заявок в МФЦ. Сначала водится число n -  количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

    "Добавить <ИМЯ>" - Добавить человека с именем ИМЯ в конец очереди
    "Следующий!" - вызвали человека, следующего первым по очереди. При этом человек с именем ИМЯ уходит из очереди. 
    "<ИМЯ1> занимала за <ИМЯ2>" - человек с именем ИМЯ1 становится в очередь за человеком по имени ИМЯ2. гарантируется, что человек, за которым занимали очередь стоит в ней.

Гарантируется, что все люди имеют различные имена и при вызове следующего человека, очередь не пуста.

Выведите на экран через пробел очередь после совершения всех запросов. 

Sample Input:

5
Добавить Лена
Добавить Коля
Марина занимала за Лена
Следующий!
Добавить Игорь

Sample Output:

Марина Коля Игорь

*/

import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = "";
        String[] str1 = new String[4];
        ArrayList<String> intList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            str = sc.nextLine();
            str1 = str.split(" ");
            if (str1[0].equals("Добавить")) {
                intList.add(str1[1]);
            } else if (str1[0].equals("Следующий!")) {
                intList.remove(0);
            } else if (str1[1].equals("занимала")) {
                intList.add(intList.indexOf(str1[3])+1, str1[0]);
            }
        }
        for (String itm: intList) {
            System.out.print(itm + " ");
        }
    }
}