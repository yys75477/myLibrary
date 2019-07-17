package com.joker.library.utils;

import com.joker.library.model.HttpClientResult;
import lombok.Data;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;


/**
 * The type Http utils test.
 */
public class HttpUtilsTest
{
    /**
     * The type Eureka client request.
     */
    @Data
    public static class EurekaClientRequest implements Serializable
    {


        private String hostName;

        private boolean needRegister;   // 是否需要注册到server上


        private String clientUrl;


    }
    @org.junit.Test
    public void doPost() throws Exception
    {
        EurekaClientRequest eurekaClientRequest=new EurekaClientRequest();
        eurekaClientRequest.clientUrl="qwe";
        eurekaClientRequest.hostName="joker";
        eurekaClientRequest.needRegister=true;
        HttpClientResult httpClientResult = HttpUtils.doGet("http://127.0.0.1:8088/test");
        System.out.println(httpClientResult);
    }

    /**
     * Test do get.
     */
    @Test
    public void testDoGet()
    {
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8088/test", String.class);
        System.out.println(entity.getBody());
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws InterruptedException the interrupted exception
     */
    public static void main(String[] args) throws InterruptedException
    {
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8088/test", String.class);
        System.out.println(entity.getBody());

        TimeUnit.SECONDS.sleep(1000);
    }
}