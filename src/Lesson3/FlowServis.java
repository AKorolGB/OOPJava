package Lesson3;

import java.util.Collections;
import java.util.List;

public class FlowServis {
    public void sortFlow(List<Flow> flows){
        StreamComparator comparator = new StreamComparator();
        Collections.sort(flows, comparator);
    }
}
