package entities;

public class ImportedProduct extends Product{
    protected Double
            customsFree;

    public ImportedProduct(){
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public Double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(Double customsFree) {
        this.customsFree = customsFree;
    }
    @Override
    public String priceTag(){
        return name
                + " $ "
                + String.format("%.2f", price)
                + " (Customs fee: $ "
                + String.format("%.2f", customsFree) + ")";
    }

    public Double totalPrice(){
        return super.price + customsFree;
    }
}
