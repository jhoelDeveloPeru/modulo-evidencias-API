package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.TipoEvidenciaModel;
import com.example.demo.services.TipoEvidenciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tipoevidencia")
public class TipoEvidenciaController {
    @Autowired
    TipoEvidenciaService tipoEvidenciaService;

     @GetMapping()
     public ArrayList<TipoEvidenciaModel> obtenerTipoEvidencia(){
        return tipoEvidenciaService.obtenerTipoEvidencia();
     }
}
