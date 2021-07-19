/*

Животные 1

Опишите класс Animal. У класса Animal должны быть свойства:

    type - тип животного (String)
    name - имя животного (String)
    age - возраст животного (int)
    weight - вес животного (double)
    isFly - ответ на вопрос, умеет ли это животное летать? (boolean)
    isWalk - ответ на вопрос, умеет ли это животное ходить? (boolean)
    isSwim -  ответ на вопрос, умеет ли это животное плавать? (boolean)

У животного должны быть методы:

    display  - выводит информацию о животном в формате: "Тип: <Тип животного>, Имя: <Имя животного>, Возраст: <Возраст животного>, Вес: <Вес животного>, Умеет летать: <Да/Нет>, Умеет ходить: <Да/Нет>, Умеет плавать: <Да/Нет>."
    rename(String) - принимает новое имя животного
    holiday(int) - принимает на вход число праздничных дней. Увеличивает массу животного на 0.1 за каждый праздничный день.

 

Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.type = "тигр";
        tiger.name = "Артём";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();
        tiger.rename("Антон");
        tiger.display();

        Animal sparrow = new Animal();
        sparrow.type = "воробей";
        sparrow.name = "Капитан Джек";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();
        sparrow.holiday(2);
        sparrow.display();
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

