package com.system_design.lld.design_patterns.observer_design_pattern.service_impl;

import com.system_design.lld.design_patterns.observer_design_pattern.entity.UserEntity;
import com.system_design.lld.design_patterns.observer_design_pattern.service.NotificationStrategy;
import com.system_design.lld.design_patterns.observer_design_pattern.util.NotificationMode;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationImpl implements NotificationStrategy {
    @Override
    public NotificationMode notifyUser(UserEntity user) {
        System.out.println("Email Notification triggered for user: " + user);
        // Logic to send email notification
        return NotificationMode.EMAIL;
    }
}
