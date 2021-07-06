/*

Кегельбан

N кеглей выставили в один ряд, занумеровав их слева направо числами от 1 до N. Затем по этому ряду бросили K шаров, при этом i-й шар сбил все кегли с номерами от a до b включительно. Определите, какие кегли остались стоять на месте.
Входные данные

Программа получает на вход количество кеглей N и количество бросков K. Далее идет K пар чисел a, b , при этом 1abN.
Выходные данные

Программа должна вывести последовательность из N символов, где j-й символ есть “I”, если j-я кегля осталась стоять, или “.”, если j-я кегля была сбита.

Sample Input:

10 
3
8 
10
2
5
3
6

Sample Output:

I.....I...

*/


import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] kegel = new int[n];
        Arrays.fill(kegel,1);

        int[] shots = new int[k*2];
        for (int i = 0; i < shots.length; i = i + 2) {
            shots[i] = sc.nextInt();
            shots[i+1] = sc.nextInt();
            for (int j = shots[i]; j <= shots[i+1];j++) {
                kegel[j-1] = 0;
            }
        }

        for (int i = 0; i < kegel.length; i++) {
            if (kegel[i] == 0) {
                System.out.print(".");
            } else {
                System.out.print("I");
            }
        }
    }
}

















                       
                    
                       















