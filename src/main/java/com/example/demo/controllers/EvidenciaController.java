package com.example.demo.controllers;

import java.io.File;
import java.io.FileOutputStream;

import com.example.demo.models.EvidenciaModel;
import com.example.demo.services.EvidenciaService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/evidencia")
public class EvidenciaController {
    
    @Autowired
    EvidenciaService evidenciaService;

     @PostMapping()
     public EvidenciaModel guardarEvidencia(@RequestBody EvidenciaModel evidencia){
        return evidenciaService.guardarEvidencia(evidencia);
     }

     @Value("${file.upload-dir}")
     String FILE_DIRECTORY;
     @PostMapping("/archivo")
     public ResponseEntity<Object> guardarArchivo(@RequestParam("file") MultipartFile file){
        try {
         File myFile = new File(FILE_DIRECTORY+file.getOriginalFilename());
         myFile.createNewFile();
         FileOutputStream fos = new FileOutputStream(myFile);
         fos.write(file.getBytes());
         fos.close();
        } catch (Exception e) {
         return new ResponseEntity<Object>("Algo salió mal",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Object>("El archivo fue cargado",HttpStatus.OK);
     }
}
