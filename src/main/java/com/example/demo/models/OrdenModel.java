package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String ordenServicio;
    private String Tipo;
    private String cliente;
    private Date fechaRegistro;
    private Long usuarioRegistroId;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrdenServicio() {
        return this.ordenServicio;
    }

    public void setOrdenServicio(String ordenServicio) {
        this.ordenServicio = ordenServicio;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Long getUsuarioRegistroId() {
        return this.usuarioRegistroId;
    }

    public void setUsuarioRegistroId(Long usuarioRegistroId) {
        this.usuarioRegistroId = usuarioRegistroId;
    }

}
