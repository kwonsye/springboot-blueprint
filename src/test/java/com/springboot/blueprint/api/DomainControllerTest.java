package com.springboot.blueprint.api;

import com.springboot.blueprint.domain_name_pkg.domain.repository.DomainRepository;
import com.springboot.blueprint.domain_name_pkg.dto.request.ReqDto;
import com.springboot.blueprint.domain_name_pkg.dto.response.ResDto;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DomainControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate; //JPA test is possible

    @Autowired
    private DomainRepository domainRepository;

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void setup(){
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                //.apply(springSecurity())
                .build();
    }

    @After
    public void tearDown() throws Exception{
        domainRepository.deleteAll();
    }

    @Test
    public void post() throws Exception{
        //TODO given
        String url = "http://localhost:" + port + "/api/v1/basic";
        ReqDto reqDto = ReqDto.builder().request("test").build();

        //TODO when
        ResponseEntity<ResDto> responseEntity = restTemplate.postForEntity(url, reqDto, ResDto.class);

        //TODO then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
