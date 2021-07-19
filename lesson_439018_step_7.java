/*

Животные 3

Добавьте инкапсуляцию в класс Animal. Для каждого свойства в классе Animal должны быть свои методы get/set (для булевых значений не get, a is).

 Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.setAge(15);
        tiger.setWeight(300.6);
        tiger.setSwim(true);
        tiger.setWalk(true);
        tiger.setFly(false);
        tiger.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwimm());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());
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
    public void setType (String t) {
        this.type = t;
    }
    public String getType () {
        return this.type;
    }
    public void setName (String n) {
        this.name = n;
    }
    public String getName () {
        return this.name;
    }
    public void setAge (int a) {
        this.age = a;
    }
    public int getAge () {
        return this.age;
    }
    public void setWeight (double w) {
        this.weight = w;
    }
    public double getWeight () {
        return this.weight;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public boolean isSwimm() {
        return isSwim;
    }
}
