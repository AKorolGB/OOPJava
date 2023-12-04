package Lesson4;

import java.util.ArrayList;
import java.util.List;

//Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
//        — Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
//        — Создать класс УчительКонтроллер и реализовать возможность создания,
//        редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
public class Main {
    public static void main(String[] args) {
TeacherControler controler = new TeacherControler();
controler.create("adf","Sg","dbdnc");
controler.create("jhgj","dfdgdfg","ddfn");
controler.create("ffgh","nvn","nmhkr");
controler.create("ewr","cxvcx","eqwr");
controler.sendOnConsoleTeacher();

    }
}
