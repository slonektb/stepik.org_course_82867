/*

Делители

Вводится натуральное число n. Необходимо определить количество его делителей.

Sample Input:

100

Sample Output:

9

*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i=n; i>=1; i--){
            c = (n%i == 0) ? c+1 : c;
        }
        System.out.println(""+c);
    }
}









                       
                    
                       















