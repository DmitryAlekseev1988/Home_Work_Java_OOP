package Seminar_2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human_1 = new Human("Dmitry");
        Human human_2 = new Human("Aleksey");
        market.acceptToMarket(human_1);
        market.update();
        market.acceptToMarket(human_2);
        market.update();

        
    }
}