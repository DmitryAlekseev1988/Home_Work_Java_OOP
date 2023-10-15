package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class BottelOfWaterVendingMachine implements IVendingMachine {

    private List<BottelOfWater> bottleOfWatersList;

    public BottelOfWaterVendingMachine(List<BottelOfWater> bottelOfWatersList){
        this.bottleOfWatersList = bottelOfWatersList;
    }
    

    public BottelOfWaterVendingMachine() {
        this.bottleOfWatersList = new ArrayList<>();
    }



    @Override
    public Product getProductByName(String name) {
        for (BottelOfWater bottle : bottleOfWatersList) {
            if (bottle.getName().equals(name))
                return bottle;
        }
        return null;
    }

    @Override
    public Product getProductByCost(double cost) {
        for (BottelOfWater bottle : bottleOfWatersList) {
            if (bottle.getCost() == cost)
                return bottle;
        }
        return null;
    }

    public BottelOfWater getProduct(String name, double volume, int temperature){
        for (BottelOfWater bottle : bottleOfWatersList) {
            if (bottle.getName().equals(name) && bottle.getVolume() == volume && bottle.getTemperature() == temperature)
                return bottle;
        }
        return null;
    }

    public List<BottelOfWater> getBottleOfWatersList() {
        return bottleOfWatersList;
    }

    public void setBottleOfWatersList(List<BottelOfWater> bottelOfWatersList) {
        this.bottleOfWatersList = bottelOfWatersList;
    }

    public void addBottleOfWaterList(BottelOfWater bottelofWater){
        this.bottleOfWatersList.add(bottelofWater);
    }

    

}
