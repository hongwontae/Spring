package com.sam.springbegin.simpledemocontext;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Business {

    private DataService dataService;

    public Business(DataService dataService){
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
    
}
