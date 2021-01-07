package com.springboot.blueprint.domain_name_pkg.controller;

import com.springboot.blueprint.domain_name_pkg.dto.request.ReqDto;
import com.springboot.blueprint.domain_name_pkg.dto.response.ResDto;
import com.springboot.blueprint.domain_name_pkg.service.DomainService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "API tag")
@RequiredArgsConstructor
@RestController
public class DomainController {

    private final DomainService domainService;

    @ApiOperation(value = "",
            notes = "")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping("/api/v1/basic/{id:^[0-9]+$}")
    public ResponseEntity<ResDto> getBasicPath(
            @PathVariable(value = "id") Long pathId) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(domainService.getBasicPath());
    }

    @ApiOperation(value = "",
            notes = "")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @GetMapping("/api/v1/basic")
    public ResponseEntity<ResDto> getBasic(
            @ApiParam(value = "파라미터 이름", required = true, example = "param ex")
            @RequestParam(value = "param-name") String param) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(domainService.getBasic());
    }

    @ApiOperation(value = "",
            notes = "")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @PostMapping("/api/v1/basic")
    public ResponseEntity<ResDto> post(@RequestBody ReqDto requestDto){
        return ResponseEntity.status(HttpStatus.OK)
                .body(domainService.post(requestDto));
    }
}
