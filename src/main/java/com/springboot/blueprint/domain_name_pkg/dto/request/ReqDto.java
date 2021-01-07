package com.springboot.blueprint.domain_name_pkg.dto.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReqDto {
    @ApiModelProperty("")
    private String request;

    @Builder
    private ReqDto(String request){
        this.request = request;
    }
}
