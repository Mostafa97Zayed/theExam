package com.enteroware.Exam.dao;

import com.enteroware.Exam.model.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class RestTempateCaller {

    private RestTemplate restTemplate;
    private PhoneDao phoneDao;


    @Autowired
    public RestTempateCaller(RestTemplate restTemplate,PhoneDao phoneDao) {
        this.restTemplate = restTemplate;
        this.phoneDao= phoneDao;
    }


    public PhoneNumber getProductList(String telephoneNumber) {
String url = "http://apilayer.net/api/validate?access_key=ca5a82a61e8cc18afe28db0bdc5404c3&number=" + telephoneNumber;

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        

        return restTemplate.exchange(url, HttpMethod.GET,entity,PhoneNumber.class).getBody();
    }
}

