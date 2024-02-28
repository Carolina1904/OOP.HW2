package OOP.HomeWork2;

public class Human extends Actor{
    public Human(String name) {
        super(name);
    }
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.makeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
       super.takeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return makeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return takeOrder;
    }
}
