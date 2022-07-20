package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    public Order(){
        //empty constructor
    }

    public Order(Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem){
        return
    }
}
