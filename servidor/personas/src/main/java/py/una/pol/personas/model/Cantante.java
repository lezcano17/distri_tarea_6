package py.una.pol.personas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Cantante extends Persona  implements Serializable {

    List<String> asignaturas;

    public Cantante(){
        asignaturas = new ArrayList<String>();
    }

    public Cantante(Long pcedula, String pnombre, String papellido){
        this.cedula = pcedula;
        this.nombre = pnombre;
        this.apellido = papellido;

        asignaturas = new ArrayList<String>();
    }

    public Long getCedula() {
        return super.cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return super.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return super.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<String> getAsignaturas() {
        return super.asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
