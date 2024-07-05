package com.thesis.taskflow.services;

import com.thesis.taskflow.entities.Notifications;
import com.thesis.taskflow.entities.User;
import com.thesis.taskflow.reponsitories.NotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NotificationsService {
    @Autowired
    private NotificationsRepository notificationsRepository;

    public List<Notifications> getNotificationsByUserId(int userId) {
        return notificationsRepository.findByUserId(userId);
    }

    public void createNotification(User user, String text) {
        Notifications notification = new Notifications();
        notification.setUser(user);
        notification.setText(text);
        notification.setRead(false);
        notificationsRepository.save(notification);
    }

    @Transactional
    public void markAllNotificationsAsReadByUserId(int userId) {
        notificationsRepository.markAllAsReadByUserId(userId);
    }

    public void deleteNotification(int noticeId) {
        notificationsRepository.deleteById(noticeId);
    }
}
