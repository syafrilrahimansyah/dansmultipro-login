package com.dansmultipro.login.service;

import com.dansmultipro.login.rest.entity.DansmultiproPosition;

import java.util.List;

public interface PositionService {
    List<DansmultiproPosition> getAllPosition();
    DansmultiproPosition getPositionById(String id);
}
