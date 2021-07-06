/*
В обратном порядке через одного

Вводятся два целых числа: a и b (a <=b ). Выведите на экран все числа от b до а через одно на разных строчках. 

Sample Input:

3 11

Sample Output:

11
9
7
5
3

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = b;i >= a;i = i -2) {
            System.out.println("" + i);
        }

    }
}










                       
                    
                       















