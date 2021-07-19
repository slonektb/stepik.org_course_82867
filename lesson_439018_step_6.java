/*

Животные 2

Дополните класс Animal. У класса Animal должны быть следующие конструкторы:

    Позволяющий создать животное с его типом и именем
    Позволяющий создать животное с его типом и возрастом. При этом в имени окажется значение "No Name"
    Позволяющий создать животное со всеми его свойствами в том же порядке, который указан на предыдущем слайде.

 Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();

        Animal sparrow = new Animal("воробей", 5);
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
    }
}

*/

public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    Animal(String t, String n) {
        type = t;
        name = n;
    }
    Animal(String t, int a) {
        type = t;
        name = "No Nam";
        age = a;
    }
    Animal(String t, String n, int a, double w, boolean iF, boolean iW, boolean iS) {
        type = t;
        name = n;
        age = a;
        weight = w;
        isFly = iF;
        isWalk = iW;
        isSwim = iS;
    }

    void display (){
        System.out.println("Тип: " + type);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Умеет летать: " + ((isFly)?"Да":"Нет"));
        System.out.println("Умеет ходить: " + ((isWalk)?"Да":"Нет"));
        System.out.println("Умеет плавать: " + ((isSwim)?"Да":"Нет"));
    }

    void rename (String n) {
        name = n;
    }

    void holiday(int i) {
        weight = weight + (i*0.1);
    }
}


