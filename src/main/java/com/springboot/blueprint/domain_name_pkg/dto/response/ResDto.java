package com.springboot.blueprint.domain_name_pkg.dto.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonPropertyOrder({"response"})
public class ResDto {
    @ApiModelProperty("프로퍼티 이름")
    private String response;
}
