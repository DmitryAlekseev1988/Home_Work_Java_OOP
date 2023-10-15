package Seminar_1;

public class Main {
    public static void main(String[] args) {
        // создаем сами продукты
        BottelOfWater bonAqua = new BottelOfWater("BonAqua", 150.50, 1.5);
        BottelOfWater hotKey = new BottelOfWater("HotKey", 120.36, 2.5);
        BottelOfWater nizneivkino = new BottelOfWater("Nizneivkino", 100.99, 1.2);
        BottelOfWater volzanka = new BottelOfWater("Volzanka", 200.18, 1.9);
        BottelOfWater evian = new BottelOfWater("Evian", 300.56, 1.7);
        HotDrink americano = new HotDrink("Americano" , 100 , 0.2 , 80);
        HotDrink espresso = new HotDrink("Espresso" , 200 , 0.4 , 75);
        HotDrink cappuccino  = new HotDrink("Cappuccino" , 300 , 0.5 , 60);

       
        // создаем список наших продуктов
        BottelOfWaterVendingMachine vendingMachine = new BottelOfWaterVendingMachine();
        
        // добавляем наши бутылки с водой в наш список "vendingMachine"
        vendingMachine.addBottleOfWaterList(bonAqua);
        vendingMachine.addBottleOfWaterList(hotKey);
        vendingMachine.addBottleOfWaterList(nizneivkino);
        vendingMachine.addBottleOfWaterList(volzanka);
        vendingMachine.addBottleOfWaterList(evian);
        vendingMachine.addBottleOfWaterList(americano);
        vendingMachine.addBottleOfWaterList(espresso);
        vendingMachine.addBottleOfWaterList(cappuccino);
        

        // находим нашу бутылку на имени или цене и выводим на экран
        System.out.println(vendingMachine.getProductByName("Nizneivkino"));
        System.out.println(vendingMachine.getProductByName("Evian"));
        System.out.println(vendingMachine.getProductByCost(120.36));
        System.out.println(vendingMachine.getProductByName("Americano"));
        System.out.println(vendingMachine.getProductByName("Espresso"));
        System.out.println(vendingMachine.getProductByName("Cappuccino"));
        
        // выводим весь список наших продуктов

        // for (BottelOfWater i  : vendingMachine.getBottleOfWatersList()) {
        //     System.out.println(i);
        // }

        
    
    
    
    }
}
