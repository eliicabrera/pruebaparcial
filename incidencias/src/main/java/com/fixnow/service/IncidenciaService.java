package com.fixnow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fixnow.model.Incidencia;
import com.fixnow.repository.IncidenciaRepository;

public class IncidenciaService {
@Autowired
private IncidenciaRepository incidenciaRepository;
public List<Incidencia> getAllIncidencias(){
     return incidenciaRepository.obtenerIncidencias();
}
public Incidencia saveIncidencia(Incidencia inci){
    return incidenciaRepository.guardarIncidencia(inci);
}
public Incidencia getIncidencia(int id){
    return incidenciaRepository.buscarPorId(id);
}
public Incidencia updateIncidencia(Incidencia inci){
    return incidenciaRepository.actualizarIncidencia(inci);
}
public String deleteIncidencia(int id){
    incidenciaRepository.eliminarIncidencia(id);
    return "Incidencia eliminada correctamente";
}
}
