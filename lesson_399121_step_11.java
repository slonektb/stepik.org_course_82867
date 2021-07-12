/*

Очередь

Напишите программу, которая реализует структуру данных очередь, используя список.

Условие задачи таково: пользователь листает список музыкы и добавляет в плейлист понравившиеся ему композиции. Когда песня доигрывает, включается следующая. Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.

Сначала водится число n - количество запросов в вашей программе. Каждый из запросов будет иметь один следующих видов:

    push <Название трека> - добавляет трек в плейлист
    pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"

После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.

Sample Input:

4
push Трек1
push Трек3
pop
push ТрекТрек

Sample Output:

воспроизводится Трек1
Трек3 ТрекТрек

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
                System.out.println("воспроизводится " + intList.remove(0));
            }
        }
        for (String itm: intList) {
            System.out.print(itm + " ");
        }
    }
}