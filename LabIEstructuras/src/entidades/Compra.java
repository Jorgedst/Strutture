/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Dtapiaj
 */
public class Compra {
    int idecompra;
    int idecliente;
    int idepelicula;
    LocalDate fechacompra;

    public Compra(int idecompra, int idecliente, int idepelicula, LocalDate fechacompra) {
        this.idecompra = idecompra;
        this.idecliente = idecliente;
        this.idepelicula = idepelicula;
        this.fechacompra = fechacompra;
    }

    public int getIdecompra() {
        return idecompra;
    }

    public void setIdecompra(int idecompra) {
        this.idecompra = idecompra;
    }

    public int getIdecliente() {
        return idecliente;
    }

    public void setIdecliente(int idecliente) {
        this.idecliente = idecliente;
    }

    public int getIdepelicula() {
        return idepelicula;
    }

    public void setIdepelicula(int idepelicula) {
        this.idepelicula = idepelicula;
    }

    public LocalDate getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(LocalDate fechacompra) {
        this.fechacompra = fechacompra;
    }
    
    
    
    @Override
    public String toString(){
        return idecompra+","+idecliente+","+idepelicula+","+fechacompra;
    }
}
