public class Phone {
    private String name;
    private double price;
    private int number;
    public Phone() {

    }
    public Phone(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }
     public String getName() {
        return name;
     }
     public void setName(String name) {
        this.name=name;
     }
     public double getPrice() {
        return price;
     }
     public void setPrice(double price) {
        this.price = price;
     }
     public int getNumber(){
        return number;
     }
     public void setNumber(int number) {
        this.number = number;
     }
     public String toString() {
        return "Phone {name: " + name + " , price: " + price + " , number: " + number + ".";
     }
}
