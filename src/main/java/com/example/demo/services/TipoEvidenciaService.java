package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.TipoEvidenciaModel;
import com.example.demo.repositories.TipoEvidenciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEvidenciaService {
    @Autowired
    TipoEvidenciaRepository tipoEvidenciaRepository;

    public ArrayList<TipoEvidenciaModel> obtenerTipoEvidencia(){
        return (ArrayList<TipoEvidenciaModel>)tipoEvidenciaRepository.findAll();
    }
}
