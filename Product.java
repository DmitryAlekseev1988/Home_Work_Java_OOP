package Seminar_1;

/**

 */
public abstract class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getCostNULL() {
        String str = " Такой бутылки нет";
        return str;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product [name = " + name + ", cost = " + cost + "]";
    }

}