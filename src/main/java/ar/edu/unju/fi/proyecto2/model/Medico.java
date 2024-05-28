/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unju.fi.proyecto2.model;

import java.time.LocalDate;

/**
 *
 * @author 54381
 */
public class Medico {
    private int dni;
    private String nombre;
    private int matricula;
    private LocalDate fechaIngreso;
    private String especialidad;
    
    public Medico(){
        
    }

    public Medico(int dni, String nombre, int matricula, LocalDate fechaIngreso, String especialidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.matricula = matricula;
        this.fechaIngreso = fechaIngreso;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "dni=" + dni + ", nombre=" + nombre + ", matricula=" + matricula + ", fechaIngreso=" + fechaIngreso + ", especialidad=" + especialidad + '}';
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
