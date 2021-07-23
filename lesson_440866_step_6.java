/*

Животные наследники

Создайте три класса - наследника от класса Animal (из предыдущего урока): Bird, Fish и Insect.
Класс Bird:

По умолчанию будем считать, что все птицы умеют летать.

У птиц должны быть новые свойства: 

    area - зона обитания
    winterFly - ответ на вопрос, улетает ли она зимовать

Добавьте птицам метод chirik_chirik, который выводит на экран строку "Chirik-Chirik".
Класс Fish:

Все рыбы должны уметь плавать по умолчанию.

У рыб должны быть новые свойства: 

    squama - тип чешуи
    upStreamSwim - умеет ли плавать против течения

Добавьте рыбам метод bul_bul, который выводит на экран строку "Bul-bul".
Класс Insect:

Все насекомые должны уметь ходить по умолчанию.

У насекомых должны быть новые свойства: 

    wingCount - количество крыльев
    likeJesus - умеет ли ходить по воде

Добавьте насекомым метод ggggg, который выводит на экран строку "Ggggg".

Можете проверить свой класс, запустив его с этим кодом:

class Main{
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}

*/

public class Bird extends Animal{
    String area;
    boolean winterFly;


    public void chirik_chirik () {
        System.out.println("Chirik-Chirik");
    }

    public void chirick_chirick() {
        System.out.println("Chirik-Chirik");
    }

    public void setArea(String a) {
        this.area = a;
    }

    public void setWinterFly(boolean b) {
        this.winterFly = b;
    }

    public String getArea() {
        return this.area;
    }

    public boolean isWinterFly() {
        return this.winterFly;
    }
}

public class Fish extends Animal{
    String squama;
    boolean upStreamSwim;

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
}

public class Insect extends Animal{
    int wingCount;
    boolean likeJesus;

    public void ggggg  () {
        System.out.println("Ggggg");
    }

    public void setWingCount(int i) {
        wingCount = i;
    }

    public void setLikeJesus(boolean b) {
        likeJesus = b;
    }

    public int getWingCount() {
        return this.wingCount;
    }

    public boolean isLikeJesus() {
        return this.likeJesus;
    }
}
