package org.yuzarsif;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OrderService {

    public OrderService() {
        System.out.println("OderService created...");
    }

    public void placeOrder(){
        System.out.println("Order placed...");
    }
}
