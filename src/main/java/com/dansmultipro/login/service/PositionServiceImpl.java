package com.dansmultipro.login.service;

import com.dansmultipro.login.rest.DansmultiproRestService;
import com.dansmultipro.login.rest.entity.DansmultiproPosition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PositionServiceImpl implements PositionService{
    @Autowired
    private DansmultiproRestService dansmultiproRestService;
    @Override
    public List<DansmultiproPosition> getAllPosition() {
        return dansmultiproRestService.getAllPosition();
    }

    @Override
    public DansmultiproPosition getPositionById(String id) {
        return dansmultiproRestService.getPositionById(id);
    }
}
