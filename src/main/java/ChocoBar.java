public class ChocoBar extends Product {
    private double calories;
    private double darkness;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getDarkness() {
        return darkness;
    }

    public void setDarkness(double darkness) {
        this.darkness = darkness;
    }

    public ChocoBar(String name, double price, double calories, double darkness) {
        super(name, price);
        this.calories = calories;
        this.darkness = darkness;
    }
    @Override
    public String displayInfo() {
        return String.format(" %s; %.2f; Калории: %.2f; Яркость: %.2f",
                name, price, calories, darkness);
    }
}
