package Lesson3;

import java.util.ArrayList;
import java.util.List;

//— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//        — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//        — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный
//        StreamComparator;
public class Main {
    public static void main(String[] args) {
StudyGroup studyGroup1 = new StudyGroup(110121,30);
StudyGroup studyGroup2 = new StudyGroup(110131,25);
StudyGroup studyGroup3 = new StudyGroup(120141,30);
StudyGroup studyGroup4 = new StudyGroup(120151,31);
StudyGroup studyGroup5 = new StudyGroup(120121,28);
StudyGroup studyGroup6 = new StudyGroup(111101,26);
StudyGroup studyGroup7 = new StudyGroup(111131,30);

Flow flow1 = new Flow(List.of(studyGroup1,studyGroup2));
Flow flow2 = new Flow(List.of(studyGroup3,studyGroup4,studyGroup5));
Flow flow3 = new Flow(List.of(studyGroup6,studyGroup7));

List<Flow> flows = new ArrayList<>();
flows.add(flow1);
flows.add(flow2);
flows.add(flow3);

FlowServis flowServis = new FlowServis();
flowServis.sortFlow(flows);

        for (Flow flow:flows) {
            System.out.println(flow.trainingTroups.size());

            
        }
    }
}
