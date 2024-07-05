package com.thesis.taskflow.dtos;

import com.thesis.taskflow.entities.Notifications;
import lombok.Data;

@Data
public class NotificationsDto {
    private int id;
    private String text;
    private boolean isRead;

    public NotificationsDto() {

    }

    public NotificationsDto(Notifications notifications) {
        this.id = notifications.getId();
        this.text = notifications.getText();
        this.isRead = notifications.isRead();
    }
}
