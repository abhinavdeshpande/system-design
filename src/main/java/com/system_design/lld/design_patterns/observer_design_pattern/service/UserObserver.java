package com.system_design.lld.design_patterns.observer_design_pattern.service;

import com.system_design.lld.design_patterns.observer_design_pattern.dto.UserDto;
import com.system_design.lld.design_patterns.observer_design_pattern.util.NotificationMode;

import java.util.List;

public interface UserObserver {
    public List<NotificationMode> notify(UserDto user);
}
