package com.dansmultipro.login.rest;

import com.dansmultipro.login.rest.entity.DansmultiproPosition;

import java.util.List;

public interface DansmultiproRestService {
    List<DansmultiproPosition> getAllPosition();
    DansmultiproPosition getPositionById(String id);
}
