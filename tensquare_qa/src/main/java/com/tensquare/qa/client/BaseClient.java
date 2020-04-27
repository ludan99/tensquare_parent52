package com.tensquare.qa.client;

import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Component
@FeignClient("tensquare-base")
public interface BaseClient {

    @RequestMapping(value="/label/{labelId}",method= RequestMethod.GET)
    public Result findById(@PathVariable("labelId") String labelId);
}