/*

Кубы

Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

Sample Input:

8
11

Sample Output:

512
1331

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cubs = new int[1001];
        for (int i = 0;i <= 1000;i++) {
            cubs[i] = i*i*i;
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(cubs[a]);
        System.out.println(cubs[b]);
    }
}







                       
                    
                       















