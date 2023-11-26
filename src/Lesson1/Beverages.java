package Lesson1;

import java.util.ArrayList;

public abstract class Beverages {
    private String name;
    private int volume;


    public Beverages(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Beverages{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
