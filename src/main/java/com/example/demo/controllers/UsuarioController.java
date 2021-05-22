package com.example.demo.controllers;

import com.example.demo.services.UsuarioService;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

     @GetMapping()
     public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
     }

     @PostMapping()
     public ArrayList<UsuarioModel> obtenerPorNumeroDocumento(@RequestBody Credenciales credenciales){
        return usuarioService.obtenerPorNumeroDocumento(credenciales.getUsuario(),credenciales.getClave());
     }
     
}

 class Credenciales{
   private String usuario;
   private String clave;

   public String getUsuario() {
      return this.usuario;
   }

   public void setUsuario(String usuario) {
      this.usuario = usuario;
   }

   public String getClave() {
      return this.clave;
   }

   public void setClave(String clave) {
      this.clave = clave;
   }

}