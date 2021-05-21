package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
    }

    public ArrayList<UsuarioModel> obtenerPorNumeroDocumento(String NumeroDocumento,String clave){
        return (ArrayList<UsuarioModel>)usuarioRepository.findByNumeroDocumento(NumeroDocumento);
    }
}
