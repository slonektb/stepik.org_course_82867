/*

Коровы

По данному числу n закончите фразу "На лугу пасется..." одним из возможных продолжений: "n коров", "n корова", "n коровы", правильно склоняя слово "корова".
Входные данные

Дано число n (n<100).
Выходные данные

Программа должна вывести введенное число n и одно из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров. Между числом и словом должен стоять ровно один пробел.

Sample Input:

3

Sample Output:

3 коровы

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ( ((n%10>=5) && (n%10<=9)) || (n%10==0) || (n/10==1) ) {
            System.out.println(n + " коров");
        } else if (n%10 == 1) {
            System.out.println(n + " корова");
        } else {
            System.out.println(n + " коровы");
        }
    }
}