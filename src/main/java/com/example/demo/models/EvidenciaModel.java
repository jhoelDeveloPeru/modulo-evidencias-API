package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evidencia")
public class EvidenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private Long ordenId;
    private String nombreArchivo;
    private String ubicacionArchivo;
    private Long tipoEvidenciaId;
    private Long usuarioRegistroId;
    private Date fechaRegistro;
    private boolean activo;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrdenId() {
        return this.ordenId;
    }

    public void setOrdenId(Long ordenId) {
        this.ordenId = ordenId;
    }

    public String getNombreArchivo() {
        return this.nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getUbicacionArchivo() {
        return this.ubicacionArchivo;
    }

    public void setUbicacionArchivo(String ubicacionArchivo) {
        this.ubicacionArchivo = ubicacionArchivo;
    }

    public Long getTipoEvidenciaId() {
        return this.tipoEvidenciaId;
    }

    public void setTipoEvidenciaId(Long tipoEvidenciaId) {
        this.tipoEvidenciaId = tipoEvidenciaId;
    }

    public Long getUsuarioRegistroId() {
        return this.usuarioRegistroId;
    }

    public void setUsuarioRegistroId(Long usuarioRegistroId) {
        this.usuarioRegistroId = usuarioRegistroId;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


}
