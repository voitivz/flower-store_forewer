package ua.ucu.edu.apps.FlowerForever;

import java.util.LinkedList;

import ua.ucu.edu.apps.FlowerForever.delivery.Delivery;
import ua.ucu.edu.apps.FlowerForever.model.Item;
import ua.ucu.edu.apps.FlowerForever.payment.Payment;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items != null ? items : new LinkedList<>();
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public float calculateTotalPrice() {
        float total = 0;
        for(Item item : items) {
            total += item.price();
        }
        return total;
    }

    public String processOrder(){
        float price = calculateTotalPrice();
        String pay = ((payment==null)? "null":payment.toString());
        String del = ((delivery==null)? "null":delivery.toString());
        return "Your Order : " + "items : " + items.toString()
                + ", paymentStrategy : " + pay
                + ", deliveryStrategy : " + del
                + ", totalPrice : " + price;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
