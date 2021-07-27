/*

Статичные животные

Добавьте классу Animal статичный метод на ваш вкус и статичное свойство String description, в котором будет храниться описание класса. Убедитесь, что его нельзя вызвать у объекта, но можно вызвать у класса. 


*/


public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    static String description = "Описание класса Животные";

    {
        this.name = "NoName";
        this.type = "noType";
    }

    Animal(String t, String n) {
        type = t;
        name = n;
    }
    Animal(String t, int a) {
        type = t;
        name = "No Name";
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

    static void printDesctiption () {System.out.println(description);}

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

    void holiday() {
        weight = weight + 0.1;
    }
    void holiday(double m) {
        weight = weight + m;
    }
    void holiday(double m, int n) {
        weight = weight + (n*m);
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
