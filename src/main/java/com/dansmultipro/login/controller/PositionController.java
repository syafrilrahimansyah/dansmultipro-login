package com.dansmultipro.login.controller;

import com.dansmultipro.login.controller.entity.AuthRequest;
import com.dansmultipro.login.controller.entity.AuthResponse;
import com.dansmultipro.login.controller.entity.CommonResponse;
import com.dansmultipro.login.rest.entity.DansmultiproPosition;
import com.dansmultipro.login.service.PositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@EnableWebMvc
@CrossOrigin
@RestController
@RequestMapping(path = "/position")
public class PositionController extends CommonController{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PositionService positionService;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponse allPosition(){
        List<DansmultiproPosition> response = positionService.getAllPosition();
        return generateCommonResponse(response);
    }
    @GetMapping(path = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
    public CommonResponse positionById(@RequestParam(name = "id") String id){
        DansmultiproPosition response = positionService.getPositionById(id);
        return generateCommonResponse(response);
    }
}
