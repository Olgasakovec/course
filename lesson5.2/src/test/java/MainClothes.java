import clothes.*;
/*
      Создать перечисление (enum), содержащее размеры одежды (XXS, XS, S, M, L). Перечисление содержит метод getDescription,
      возвращающий строку "Взрослый размер". Переопределить метод getDescription - для константы XXS метод должен возвращать строку
      “Детский размер”.  Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому
      размеру. Создать конструктор, принимающий на вход euroSize.
      Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
      Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
      Создать классы наследники Одежды - Футболка (реализует интерфей сы "Мужская Одежда" и "Женская Одежда"), Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"), Галстук (реализует интерфейсы "Мужская Одежда").
      Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды. Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
      */
public class MainClothes {
    public static void main(String[] args) {
        SizeEnum coatSize = SizeEnum.XXS;

        System.out.println(coatSize.getDescription());
        int value = coatSize.getEuroSize();
        System.out.println(value);

        Skirt klesh = new Skirt(32, 50, "blue");
        Tshirt nike = new Tshirt(38, 40, "white");
        Trouthers puma = new Trouthers(36, 98, "red");
        Tie lop = new Tie(40, 10, "black");

        Clothe[] clothes = new Clothe[]{klesh, nike, puma, lop};

        Atelier atelier = new Atelier();
        atelier.menwear(clothes);
        atelier.womanwear(clothes);
    }
}






