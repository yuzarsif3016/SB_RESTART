package org.yuzarsif.notification;

public class PopupNotificationService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("pop up notification send ...");
    }
}