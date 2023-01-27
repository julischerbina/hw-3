import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car.Key universalKey = new Car.Key(true, true);
        Car lada = new Car("", "Granta", 1.7, "желтый", 2015, "Россия", 150,
                "механическая", "седан", "ф555фф88", 4,
                2, new Car.Key(true, false));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "черный",
                2020, "Германия", 220, "автомат", "седан", "г564гг85",
                5,6, universalKey);
        Car bmw = new Car("BMW", "", -1, "черный", -5, "Германия", 220,
                "автомат","седан", "в555вв65", 5, 5, universalKey);
        Car kia = new Car("Kia", "Sportage 4-го поколения", -0.5, "красный", 2018,
                "", 150,"механическая", "седан", "а555аа55",
                4, 2, universalKey);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея",
                180,"механическая", "седан", "в555вв65", 5,
                5, universalKey);

        Bus first = new Bus("BMW", "первая", 2000, "Германия", "белый", 100);
        Bus second = new Bus("BMW", "вторая", 2010, "Германия", "белый", 150);
        Bus third = new Bus("BMW", "третья", 2005, "Германия", "белый", 160);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}