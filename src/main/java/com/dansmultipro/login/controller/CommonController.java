package com.dansmultipro.login.controller;

import com.dansmultipro.login.controller.entity.CommonResponse;

public class CommonController {
    public CommonResponse generateCommonResponse(Object data){
        try {
            CommonResponse commonResponse = new CommonResponse();
            commonResponse.setSuccess(true);
            commonResponse.setData(data);
            return commonResponse;
        }catch (Exception e){
            CommonResponse commonResponse = new CommonResponse();
            commonResponse.setSuccess(false);
            commonResponse.setMessage(e.getMessage());
            return commonResponse;
        }
    }
}
