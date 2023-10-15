package Seminar_1;

public class BottelOfWater extends Product  {
    private double volume;
    
    public BottelOfWater(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return "BottelOfWater [" + "name: " + super.getName() + " | volume: " + volume + " | cost: " + super.getCost() + "]";
    }

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return 0;
    }
    
    
}
