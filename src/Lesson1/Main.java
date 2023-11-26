package Lesson1;

public class Main {
    public static void main(String[] args) {
        HotBeverages hotBeverages = new HotBeverages("Black Tea", 250, 70);
        HotBeverages hotBeverages1 = new HotBeverages("Green Tea", 250, 70);
        HotBeverages hotBeverages2 = new HotBeverages("Сoffee", 250, 70);
        HotBeverages hotBeverages3 = new HotBeverages("Сoffee and milk", 250, 70);


        HotVedingMachine hotVedingMachine = new HotVedingMachine();
        hotVedingMachine.GroceryList(HotBeverages.getAddHotBeverages());

        System.out.println(hotVedingMachine.getProduktMachine("Black Tea"));

    }
}
