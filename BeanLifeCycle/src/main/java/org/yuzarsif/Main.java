package org.yuzarsif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

                ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
                container.getBean(OrderService.class).placeOrder();
    }
}