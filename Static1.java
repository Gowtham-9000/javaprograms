package programs;

public class Static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food pizza = new Food("pizza",10.99);
		Food burger = new Food("burger",8.49);
		Food fries = new Food("fries",3.49);
		
		Food[] orderedFoods = {pizza, burger, fries};
		Order order = new Order(orderedFoods);
		
		order.setOrderId(1);
		double totalPrice=0;
		for(Food food: orderedFoods) {
			totalPrice+=food.getPrice();
		}
		order.setTotalPrice(totalPrice);
		order.calculateTotalPrice("cash");
		System.out.println("OrderId: "+order.getOrderId());
        System.out.println("Ordered Foods");
        if (order.getOrderedFoods() != null) {
            for(Food food: order.getOrderedFoods()) {
                System.out.println(food.getName() + "-" + food.getPrice());
            }
        } else {
            System.out.println("No foods have been ordered.");
        }

        System.out.println("Total Price:" +order.getTotalPrice());
        System.out.println("Status "+order.getStatus());
	}

}
