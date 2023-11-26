package Lesson1;

import java.util.ArrayList;

public class HotVedingMachine implements VendingMachine{
    @Override
    public void GroceryList(ArrayList<HotBeverages> addHotBeverages) {
        for (HotBeverages item: HotBeverages.getAddHotBeverages()) {
            System.out.println(item);
        }
    }

    @Override
    public HotBeverages getProduktMachine(String name) {
        for (HotBeverages item : HotBeverages.getAddHotBeverages())
            if(item.getName().equals(name))
                return item;
        return null;
    }
}
