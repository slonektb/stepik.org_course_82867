/*

Другая система счисления

Вводятся целые неотрицательные числа n и k, причём 2 < k < 10.  Переведите число n из десятичной системы счисления в систему счисления с основанием k.

Sample Input:

6
2

Sample Output:

110

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String res = "";
        res = (n==0) ? "0":"";
        while (n>0) {
            res = n%k + res;
            n = n/k;
        }
        System.out.println(res);
    }
}









                       
                    
                       















