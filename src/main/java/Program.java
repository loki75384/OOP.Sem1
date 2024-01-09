import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {



        Product bottleOfWater1 =
                new BottleOfWater("Вода #1", "ООО Источник", 250, 0.5);


        Product bottleOfMilk1 =
                new BottleOfMilk("Молоко #1", "ООО Источник", 250, 0.5, 25);

        Product bottleOfMilk2 =
                new BottleOfMilk("Молоко #2", "ООО Источник", 280, 1.5, 1);

        Product bottleOfMilk3 =
                new BottleOfMilk("Молоко #3", "ООО Источник", 150, 1.5, 5);

        Product bottleOfMilk4 =
                new BottleOfMilk("Молоко #4", "ООО Источник", 290, 2, 25);

        Product chocoBar = new ChocoBar("Чоколадка", 100, 100, 55);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(bottleOfMilk4);
        products.add(chocoBar);

        VendingMachine machine = new VendingMachine(products);

        BottleOfMilk bottleOfMilkResult =  machine.getBottleOfMilk(2);
        if (bottleOfMilkResult != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilkResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }
        ChocoBar chocoBarResult = machine.getChocoBar("Чоколадка");
        if (chocoBarResult != null) {
            System.out.println("Вы купили:");
            System.out.println(chocoBarResult.displayInfo());
        } else {
            System.out.println("Такой чоколадки нет в автомате.");
        }
    }
}
