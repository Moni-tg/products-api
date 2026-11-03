package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSizeMB;
    private double discountPrice;

    public DigitalProduct(){}

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB){

        super(id,name,price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;

    }

    @Override
    public String getSummary() {
        return "Digital:" + getName() + " - Download - " + getDownloadUrl();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }


    @Override
    public void applyDiscount(double rate) {

        this.discountPrice = getPrice() * (1-rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountPrice;
    }
}
