package com.dansmultipro.login.controller.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonResponse {
    private boolean success;
    private String message;
    private Object data;
}
