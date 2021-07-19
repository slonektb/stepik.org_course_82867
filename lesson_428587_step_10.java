/*

Генератор

Даны два натуральных числа N и K. Требуется вывести  все цепочки x1, x2, ..., xN такие, что xi - натуральное и 1 ≤ xi ≤ K.
Входные данные

Вводятся два натуральных числа N и K (N, K ≤ 6).
Выходные данные

Выведите все требуемые цепочки в произвольном порядке – по одной на строке. Никакая цепочка не должна встречаться более одного раза.

Sample Input:

2 3

Sample Output:

1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3


*/

import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

}

/*
Решение на java пока нет.
Ниже предоставлен алгоритм подобной задачи но на Питоне

def nxt(chain,n,k):
    print(*chain)
    p=0
    while(chain[p]==k):
        chain[p]=1
        p+=1
        if p==n: break
    if p==n:
        return
    chain[p]=chain[p]+1
    nxt(chain,n,k)
    
def start():
    [n,k]=list(map(int,input().split()))
    chain=[1]*n
    nxt(chain,n,k)
    
start()


*/
