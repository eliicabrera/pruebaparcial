package com.fixnow.repository;

import org.springframework.stereotype.Repository;

import com.fixnow.model.Incidencia;

import java.util.List;
import java.util.ArrayList;

@Repository
public class IncidenciaRepository {
    private List<Incidencia> listaIncidencias = new ArrayList<>();
    
    //metodo que retorna todo de la lista
    public List<Incidencia> obtenerIncidencias(){
        return listaIncidencias;
    }
    //metodo que guarda la incidencia en el arreglo
    public Incidencia guardarIncidencia(Incidencia inci){
        listaIncidencias.add(inci);
        return inci;
    }
    //metodo encontrar por id
        public Incidencia buscarPorId(int id){
        for (Incidencia incidencia : listaIncidencias){
            if (incidencia.getId()== id){
                return incidencia;
            }
        }
        return null;
    }
    //metodo actualizar (por id)
    public Incidencia actualizarIncidencia(Incidencia inci){
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaIncidencias.size(); i++){
            if (listaIncidencias.get(i).getId() == inci.getId()){
                id = inci.getId();
                idPosicion = 1;
            }
        }

        Incidencia incidencia1 = new Incidencia();
        incidencia1.setId(id);
        incidencia1.setDescripcion(inci.getDescripcion());
        incidencia1.setEstado(inci.getEstado());
        incidencia1.setNivelPrioridad(inci.getNivelPrioridad());
        incidencia1.setUsuario(inci.getUsuario());
        incidencia1.setFechaRegistro(inci.getFechaRegistro());
        listaIncidencias.set(idPosicion, incidencia1);
        return incidencia1;
    }
    //metodo eliminar (por id)
    public void eliminarIncidencia(int id){
        listaIncidencias.removeIf(x -> x.getId() == id);
    }

    //
}
