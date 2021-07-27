/*

Пронумерованные животные

Добавьте автоматическую нумерацию создания всех животных и наследников. Используйте при этом статическое поле. Так же, для удобства, сгенерируйте классу Animal  метод toString(), который выводил бы подробную информацию о животном (данные по всем полям, включая номер). Вывод номера в метод display() не добавляйте.

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
    private int id;
    private static int counter = 1;

    {
        this.name = "NoName";
        this.type = "noType";
    }

    Animal(String t, String n) {
        type = t;
        name = n;
        id = counter++;
    }
    Animal(String t, int a) {
        type = t;
        name = "No Name";
        age = a;
        id = counter++;
    }
    Animal(String t, String n, int a, double w, boolean iF, boolean iW, boolean iS) {
        type = t;
        name = n;
        age = a;
        weight = w;
        isFly = iF;
        isWalk = iW;
        isSwim = iS;
        id = counter++;
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

    @Override
    public String toString() {
        return "id: " +id + ", Имя: " + name + ", Тип: " + type + ", возраст: " + age;
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
