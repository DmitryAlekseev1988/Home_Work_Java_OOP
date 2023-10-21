package Seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavior{
    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        // добавляем нашего человека в очередь
        takeInQueue(actor);
    }

    @Override
    public void realaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.println(actor.getName() +" вышел из магазина");
        }

    }
    // главный метод
    @Override
    public void update() {
        takeOrders();
        giveOrders();
        realaseFromQueue();
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void realaseFromQueue() {
        List<Actor> actorList = new ArrayList<>();
        for (Actor actor : queue) {
            if(actor.isTakeOrder()){
                actorList.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        realaseFromMarket(actorList);

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);

    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if(!actor.isMakeOrder())  
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");   
           }

        }
    
}
