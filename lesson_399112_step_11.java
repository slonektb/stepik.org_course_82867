/*

Минимальный делитель

Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.

Sample Input:

15

Sample Output:

3

*/


import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int d = 2;
        while (a%d != 0) {
            d++;
        }
        System.out.println(""+d);
    }
}








