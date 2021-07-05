/*

Римская система счисления

Дано число X. Требуется перевести это число в римскую систему счисления.
Входные данные

Дано число X в десятичной системе счисления (1  ≤  X  ≤  100).
Выходные данные

Выведите X в римской системе счисления.

Sample Input 1:

4

Sample Output 1:

IV

Sample Input 2:

13

Sample Output 2:

XIII

Sample Input 3:

54

Sample Output 3:

LIV

*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>0 && num<4000) //checking whether the number entered is within the range [1-3999]
        {

            /*Saving the Roman equivalent of the thousand, hundred, ten and units place of a decimal number*/
            String thou[]={"","M","MM","MMM"};
            String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
            String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
            String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};

            /*Finding the digits in the thousand, hundred, ten and units place*/
            int th=num/1000;
            int h=(num/100)%10;
            int t=(num/10)%10;
            int u=num%10;

            /*Displaying equivalent roman number*/
            System.out.println(thou[th]+hund[h]+ten[t]+unit[u]);
        }
    }
}