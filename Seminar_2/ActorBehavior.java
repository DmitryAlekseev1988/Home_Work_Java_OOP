package Seminar_2;

public interface ActorBehavior {
    //сделать заказ
    void setMakeOrder(boolean makeOrder);
    //получить заказ
    void setTakeOrder(boolean takeOrder);
    // методы проверяющие получили или сделали заказ или нет
    boolean isMakeOrder();
    boolean isTakeOrder();
}
