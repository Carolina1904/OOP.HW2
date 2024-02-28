package OOP.HomeWork2;

public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder); //zdelati zakaz
    void setTakeOrder(boolean takeOrder);  //poluciti zakaz
    boolean isMakeOrder();  //proverka
    boolean isTakeOrder();

}
