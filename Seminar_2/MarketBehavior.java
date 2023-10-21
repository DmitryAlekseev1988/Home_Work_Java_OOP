package Seminar_2;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void realaseFromMarket(List<Actor> actors);
    void update();
}
