package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.OrdenModel;
import com.example.demo.repositories.OrdenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService {
    
    @Autowired
    OrdenRepository ordenRepository;

    public ArrayList<OrdenModel> obtenerPorOrdenServicio(String ordenServicio){
        return (ArrayList<OrdenModel>)ordenRepository.findByOrdenServicio(ordenServicio);
    }
}
