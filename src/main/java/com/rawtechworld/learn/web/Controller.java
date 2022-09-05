package com.rawtechworld.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long getSum() {
        return businessService.calculateSum();
    }

}

@Component
class BusinessService{

    @Autowired
    DataService dataService;

    public long calculateSum() {
        List<Integer> retrieveList = dataService.retrieveData();
        return retrieveList.stream().reduce(Integer::sum).get();
    }
}

@Component
class DataService{

    public List<Integer> retrieveData() {
        return Arrays.asList(14,23,10,50);
    }
}