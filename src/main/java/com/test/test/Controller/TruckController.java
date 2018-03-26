package com.test.test.Controller;

import com.test.test.Model.PostTrucks;
import com.test.test.Service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trucks")
public class TruckController {

    @Autowired
    private TruckService truckService;

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping
    public List<PostTrucks>getTrucks(){
        return truckService.getList();
    }
}
