package io.seata.samples.business.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import io.seata.samples.business.service.HystrixService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 雷霆 on 2020/6/9.
 * <p>
 * Description：
 */
@RequestMapping("/api/hystrix3")
@RestController
@Log
public class HystrixController3 {
    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/test1")
    public String test1(@RequestParam("id") Integer id) {
        hystrixService.test(id);

        return "test_" + id;
    }

}
