package com.example.demo.repositories;

import java.util.ArrayList;
import com.example.demo.models.OrdenModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenRepository extends CrudRepository<OrdenModel,Long>{
    public abstract ArrayList<OrdenModel> findByOrdenServicio(String ordenServicio);
}
