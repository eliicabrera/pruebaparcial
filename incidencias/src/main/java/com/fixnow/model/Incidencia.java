package com.fixnow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Incidencia {
    private int id;
    private String descripcion;
    private String estado;
    private String nivelPrioridad;
    private String usuario;
    private int fechaRegistro;

}
