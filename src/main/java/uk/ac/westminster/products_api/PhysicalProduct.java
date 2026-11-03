package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{

    private double weightKg;
    private String dimensions;
    private double discountPrice;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){

        super(id,name,price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;

    }

    @Override
    public String getSummary(){

        return "Product" + getName() + "weight" + getWeightKg() + "kg";
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public void applyDiscount(double rate) {

        this.discountPrice = getPrice() + (1- rate);

    }

    @Override
    public double getDiscountedPrice() {
        return discountPrice;
    }
}
