package Lesson1;

import java.util.ArrayList;

public class HotBeverages extends Beverages{
    int  temperature;
    private static ArrayList<HotBeverages> addHotBeverages = new ArrayList<>();
    public HotBeverages(String name, int volume,int temperature) {
        super(name, volume);
        this.temperature = temperature;
        addHotBeverages.add(this);
    }


    public static ArrayList<HotBeverages> getAddHotBeverages() {
        return addHotBeverages;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotBeverages{" +

                "name='" + getName() + '\'' +
                ", volume=" + getVolume() +
                ", temperature=" + temperature +
                '}';
    }
}
