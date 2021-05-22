package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.OrdenModel;
import com.example.demo.services.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/orden")
public class OrdenController {
    @Autowired
    OrdenService ordenService;

     @GetMapping()
     public ArrayList<OrdenModel> obtenerPorOrdenServicio(String ordenServicio){
        return ordenService.obtenerPorOrdenServicio(ordenServicio);
     }
}
