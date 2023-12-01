package Lesson2;
//Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour
//        – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина
//        (принимает и отдаёт заказы)


public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Pavel");
        Human human2 = new Human("Alexandr");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
    }

