class car{
    int carID;
    String model;
    double price;

    car(int id, String m, double p){
        carID = id;
        model = m;
        price = p;
    }
    
    double totalPrice(double tax){
        price += price;
        return price;
    }

    void display(){
        System.out.println("Car ID: " + carID);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class midterm_code{
    public static void main(String[] args) {
       car c1 = new car(101, "Toyota", 20000);
       c1.display();
       double c1Price = c1.totalPrice(20000);

       System.out.println("------------------------------");

       car c2 = new car(102, "Honda", 22000);
       c2.display();
       double c2Price = c2.totalPrice(22000);

       System.out.println("------------------------------");


       car c3 = new car(103, "Ford", 25000);
       c3.display();
       double c3Price = c3.totalPrice(25000);

       System.out.println("------------------------------");


       double totalPrice = c1Price + c2Price + c3Price;
       System.out.println("Total price for all cars: " + totalPrice);
    }
}