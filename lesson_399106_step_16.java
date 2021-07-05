/*

Яша плавает в бассейне

Яша плавал в бассейне размером N×M метров и устал. В этот момент он обнаружил, что находится на расстоянии x метров от одного из длинных бортиков (не обязательно от ближайшего) и y метров от одного из коротких бортиков. Какое минимальное расстояние должен проплыть Яша, чтобы выбраться из бассейна на бортик?
Входные данные

Программа получает на вход числа N, M, x, y.
Выходные данные

Программа должна вывести число метров, которое нужно проплыть Яше до бортика.

Sample Input 1:

23
52
8
43

Sample Output 1:

8

Sample Input 2:

18
90
3
63

Sample Output 2:

3

*/
import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int buf = 0;
        if (n > m) {
            buf = n;
            n = m;
            m = buf;
        }
        if (x > n/2) x = n - x;
        if (y > m/2) y = m - y;

        System.out.println(Math.min(x,y));

    }
}