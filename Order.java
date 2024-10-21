package programs;

public class Order {
    private int orderId;
    private double totalPrice;
    private Food[] orderedFoods;
    private String status;

    public Order(Food[] orderedFoods) {
        this.orderedFoods = orderedFoods;
        this.status = "Pending"; // Initialize status
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Food[] getOrderedFoods() {
        return orderedFoods;
    }

    public void setOrderedFoods(Food[] orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void calculateTotalPrice(String paymentMethod) {
        // Example method: you can include logic for payment method handling here
        if ("cash".equalsIgnoreCase(paymentMethod)) {
            // Handle cash payment
        }
    }
}
