/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trensabana;


public class Familia {
    private int integrantes;
    private String nombre;

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Familia(int integrantes, String nombre) {
        this.integrantes = integrantes;
        this.nombre = nombre;
    }
    
}
