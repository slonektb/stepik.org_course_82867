/*

Переопределённые животные

Переопределите у созданных вами классов наследников (Bird, Fish и Insect) метод display. Перед выводом стандартной информации добавьте в начало вывода фразу "I am <название класса>". Так же добавьте в метод display информацию о новых свойствах этого класса. 

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
    Bird () {

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
    @Override
    public void display () {
        System.out.println("I am Bird");
        super.display();
        System.out.println("Я обитаю " + getArea());
        System.out.println("Я улетаю зимовать? - " + ((winterFly)?"Да":"Нет"));
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

