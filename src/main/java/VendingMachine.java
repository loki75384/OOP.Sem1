import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(double volume){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk milk = (BottleOfMilk)product;
                if (milk.getVolume() == volume)
                    return milk;
            }
        }
        return null;
    }
    public ChocoBar getChocoBar(String name){
        for (Product product : products){
            if (product instanceof ChocoBar){
                ChocoBar chocoBar = (ChocoBar)product;
                if (chocoBar.getName().equals(name))
                    return chocoBar;
            }
        }
        return null;
    }

}
