package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.EvidenciaModel;
import com.example.demo.repositories.EvidenciaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvidenciaService {

    @Autowired
    EvidenciaRepository evidenciaRepository;
    
    public EvidenciaModel guardarEvidencia(EvidenciaModel evidencia){
        return (EvidenciaModel)evidenciaRepository.save(evidencia);
    }
}
