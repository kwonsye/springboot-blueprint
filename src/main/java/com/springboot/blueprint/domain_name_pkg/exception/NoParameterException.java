package com.springboot.blueprint.domain_name_pkg.exception;

import com.springboot.blueprint.exception.BaseException;
import com.springboot.blueprint.exception.ErrorModel;
import org.springframework.http.HttpStatus;

public class NoParameterException extends BaseException {

    public NoParameterException() {
        this(HttpStatus.BAD_REQUEST);
    }

    private NoParameterException(HttpStatus status) {
        super(ErrorModel.builder()
                .httpStatus(status)
                .message("request parameter 를 모두 요청해주세요.")
                .build());
    }
}
