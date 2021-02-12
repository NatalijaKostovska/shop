package com.example.zadaca.Controller;
import com.example.zadaca.Model.Furniture;
import com.example.zadaca.Service.ServiceFurniture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/furniture")
public class RestControllerFurniture {
    //@RequestParam
    @Autowired
    public ServiceFurniture serviceFurniture;

    @GetMapping("/addition")
    public int addition(@RequestBody ArrayList<Furniture> furnitures) {
        return this.serviceFurniture.addition(furnitures);
    }

}
