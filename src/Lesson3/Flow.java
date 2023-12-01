package Lesson3;

import java.util.Iterator;
import java.util.List;



    class Flow implements Iterable<StudyGroup> {
        List<StudyGroup> trainingTroups;

        public Flow(List<StudyGroup> trainingTroups) {
            this.trainingTroups = trainingTroups;
        }

        @Override
        public Iterator<StudyGroup> iterator() {
            return trainingTroups.iterator();
        }
    }

