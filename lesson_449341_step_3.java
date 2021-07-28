/*

Абстракция зданий

Создайте абстрактный класс Building. Определите у класса свойства:

    название,
    адрес,
    год постройки,
    имя архитектора, 
    является ли культурным памятником.

Унаследуйте у от него 6 классов: Library, House, PoliceDepartment, University, ShoppingCenter, HighRiseBuilding.

Добавьте каждому классу наследнику по 2-3 свойства и 2-3 метода, которые соответствовали бы тематике здания. Так же необходимо во всех классах сгенерировать метод toString()

Каждый класс должен быть инкапсулирован. Если хотите, то можете расширить список зданий (классов наследников).

*/

public abstract class Building {
    String name;
    String address;
    int yearOfConstruction;
    String architectName;
    boolean isCultural;

}

public class Library extends Building{
    private String type;
    private int countBooks;

    @Override
    public String toString () {
        return "Библиотека " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество книг: " + countBooks + ", для аудитории: " + type + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setCountBooks (int n) {
        this.countBooks = n;
    }
}

public class House extends Building{
    private int countApartment;
    private boolean concierge;

    @Override
    public String toString () {
        return "Жилой дом " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество квартир: " + countApartment + ", консъерж: " + ((concierge)?"есть":"отсутствует") + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setConcierge(boolean b) {
        concierge = b;
    }

    public void setCountApartment(int countApartment) {
        this.countApartment = countApartment;
    }
}

public class PoliceDepartment extends Building{
    private String district;
    private int countOfPolicement;

    @Override
    public String toString () {
        return "Полицейский участок " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество полицейских: " + countOfPolicement + ", район: " + district + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCountOfPolicement() {
        return countOfPolicement;
    }
}

public class University extends Building{
    private String type;
    private int countStudents;

    @Override
    public String toString () {
        return "Университет " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество студентов: " + countStudents + ", направленность: " + type + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
    }
}

public class ShoppingCenter extends Building{
    private int counOfBootik;
    private boolean cinema;

    @Override
    public String toString () {
        return "Торговый центр " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество магазинов: " + counOfBootik + ", кинотеатры: " + ((cinema)?"есть":"отсутствуют") + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setCinema(boolean cinema) {
        this.cinema = cinema;
    }

    public void setCounOfBootik(int counOfBootik) {
        this.counOfBootik = counOfBootik;
    }
}

public class HighRiseBuilding extends Building{
    private boolean restorans;
    private int countPenthouse;

    @Override
    public String toString () {
        return "Небоскреб " + name + ", по адресу: " + address + ", год постройки: " + yearOfConstruction + ", архитектор: " + architectName + ", количество пентхаусов: " + countPenthouse + ", рестораныы в здании: " + ((restorans)?"есть":"отсутствуют") + ((isCultural)? ", Является объектом культурного насления.":", не вляется объектом культурного насления.") + "\n-----------";
    }

    public void setCountPenthouse(int countPenthouse) {
        this.countPenthouse = countPenthouse;
    }

    public void setRestorans(boolean restorans) {
        this.restorans = restorans;
    }
}
