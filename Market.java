package OOP.HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " prishol v magazin");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " vishel iz magazina");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
         takeOrders();
         giveOrders();
         releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " vstal v oceredi");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " zdelal zakaz");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " polucil zakaz");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (!actor.isTakeOrder()) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " vishel iz oceredi");
            }
        }
        releaseFromMarket(releasedActors);
    }
}

