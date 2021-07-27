/*

Животные по умолчанию

Добавьте классу Animal инициализатор. Задайте в нём для каждого животного имя и тип по умолчанию. Добавьте инициализаторы и в наследников вашего класса. 

*/



public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

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

public class Bird extends Animal{
    String area;
    boolean winterFly;

    {
        type = "Птица";
        name = "NoName";
    }

    Bird () {
        super("Птица","No Name");
    }

    public void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }

    public void setArea(String a) {
        area = a;
    }

    public void setWinterFly(boolean b) {
        winterFly = b;
    }

    public String getArea() {
        return area;
    }

    public boolean isWinterFly() {
        return this.winterFly;
    }
    @Override
    public void display () {
        System.out.println("I am Bird");
        super.display();
        System.out.println("Я обитаю " + area);
        System.out.println("Я улетаю зимовать? - " + ((winterFly)?"Да":"Нет"));
    }
}

public class Fish extends Animal{
    String squama;
    boolean upStreamSwim;

    {
        type = "Рыба";
        name = "NoName";
    }

    Fish() {
        super("Рыба", "No Name");
    }

    public void bul_bul () {
        System.out.println("Bul-bul");
    }

    public void setSquama(String s) {
        squama = s;
    }

    public void setUpStreamSwim(boolean b) {
        upStreamSwim = b;
    }

    public String getSquama() {
        return this.squama;
    }

    public boolean isUpStreamSwim() {
        return this.upStreamSwim;
    }
    @Override
    public void display () {
        System.out.println("I am Fish");
        super.display();
        System.out.println("У меня чешуя " + this.squama);
        System.out.println("Я плаваю против течения? - " + ((upStreamSwim)?"Да":"Нет"));
    }

}

public class Insect extends Animal{
    int wingCount;
    boolean likeJesus;

    {
        type = "Насемомое";
        name = "NoName";
    }

    Insect() {
        super("Насекомыш", "No Name");
    }

    public void ggggg  () {
        System.out.println("Ggggg");
    }

    public void setWingCount(int i) {
        this.wingCount = i;
    }

    public void setLikeJesus(boolean b) {
        this.likeJesus = b;
    }

    public int getWingCount() {
        return this.wingCount;
    }

    public boolean isLikeJesus() {
        return this.likeJesus;
    }
    @Override
    public void display () {
        System.out.println("I am Insect");
        super.display();
        System.out.println("У меня клыльев " + this.wingCount);
        System.out.println("Я умею ходить по воде? - " + ((likeJesus)?"Да":"Нет"));
    }
}

