package entities;

public class OrderItem {
    private int quantity;
    private double price;

    private Product product; //composição entre um item e outro item
    //ordemItem tem uma associação ao produto - permite navegar entre os itens
    public OrderItem(){
        //empty constructor
    }

    public OrderItem(int quantity, double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return price * quantity;
    }
    @Override
    public String toString(){
        return getProduct().getName() //navego no objeto do produto e pego o nome dele
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
