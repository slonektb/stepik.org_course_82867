/*

Только 7

Напишем программу, которая считывает целые числа с клавиатуры и находит их сумму, если они заканчиваются на 7. Если ввели число, кратное 7, то программа должна завершиться. Во время решения задачи воспользуемся break и continue.

Sample Input:

1
2
17
27
14
37
45
12

Sample Output:

44

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
        int s=0;
        for (int i=0; i<15; i++){
            int n = sc.nextInt();
            if(n%7==0){
            break;
            }
            if(n%10==7){
                s+=n;
                continue;
            }
        }
        System.out.println(s);
    }
}

























