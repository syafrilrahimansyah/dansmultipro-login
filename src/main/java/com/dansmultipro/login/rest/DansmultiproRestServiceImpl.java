package com.dansmultipro.login.rest;

import com.dansmultipro.login.rest.entity.DansmultiproPosition;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class DansmultiproRestServiceImpl implements DansmultiproRestService{
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<DansmultiproPosition> getAllPosition() {
        String url = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
        List<DansmultiproPosition> response= restTemplate.getForObject(url, ArrayList.class);
        return response;
    }

    @Override
    public DansmultiproPosition getPositionById(String id) {
        return null;
    }
}
