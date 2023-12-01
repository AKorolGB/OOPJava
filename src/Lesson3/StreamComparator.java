package Lesson3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow flow1, Flow flow2) {
        int numberGroups1 = flow1.trainingTroups.size();
        int numberGroups2 = flow2.trainingTroups.size();

        return Integer.compare(numberGroups1, numberGroups2);
    }




}
