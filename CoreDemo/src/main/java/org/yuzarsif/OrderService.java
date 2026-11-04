package org.yuzarsif;

import org.yuzarsif.notification.EmailService;
import org.yuzarsif.notification.NotificationService;
import org.yuzarsif.notification.PopupNotificationService;
import org.yuzarsif.notification.SmsService;

public class OrderService {

//    NotificationService notification = new SmsService();
//    NotificationService notification1 = new EmailService();
//    NotificationService notification2= new PopupNotificationService();

    NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder(){
        System.out.println("Order Placed....");
        notificationService.sendNotification();
    }
}
