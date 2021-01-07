package com.springboot.blueprint.domain_name_pkg.service;

import com.springboot.blueprint.domain_name_pkg.domain.repository.DomainRepository;
import com.springboot.blueprint.domain_name_pkg.dto.request.ReqDto;
import com.springboot.blueprint.domain_name_pkg.dto.response.ResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DomainService {

    private final DomainRepository domainRepository;

    public ResDto getBasic() {
        //TODO do something
        return null;
    }

    public ResDto getBasicPath() {
        //TODO do something
        return null;
    }

    public ResDto post(ReqDto requestDto) {
        //TODO do something
        return null;
    }
}
