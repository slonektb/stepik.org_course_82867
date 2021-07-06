/*

Детский Сад

Для постановки Сказки красная шапочка в детском саду "Солнышко" было решено выбрать самого маленького по росту ребёнка на роль красной шапочки и самого большого на роль волка. 

На вход программе даётся число n, затем 2*n  строк. Каждая пара строк - Имя ребёнка и его рост. Выведите  на разных строках два имени: ребёнка, который будет играть красную шапочку и ребёнка, который будет играть волка. Если детей одного наименьшего или наибольшего роста несколько, то выберите первого из встретившихся. Гарантируется, что все имена различны и есть минимум 1 ребёнок.

В силу специфики работы Scanner для считывания строки используйте именно sc.next();

Sample Input 1:

3
Вася
130
Маша
110
Коля
140

Sample Output 1:

Маша
Коля

Sample Input 2:

4
Алина
120
Вася
140
Маша
110
Коля
140

Sample Output 2:

Маша
Вася

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nChilds = new String[n];
        int[] hChilds = new int [n];
        int hMin = 1000;
        int hMax = 0;
        int indxMin = 0;
        int indxMax = 0;

        for (int i = 0;i < n;i++) {
            nChilds[i] = sc.next();
            hChilds[i] = sc.nextInt();
            if (hMin > hChilds[i]) {
                hMin = hChilds[i];
                indxMin = i;
            }
            if (hMax < hChilds[i]) {
                hMax = hChilds[i];
                indxMax = i;
            }
        }
        System.out.println(nChilds[indxMin]);
        System.out.println(nChilds[indxMax]);
    }
}








                       
                    
                       















