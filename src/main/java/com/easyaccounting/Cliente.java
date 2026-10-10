/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyaccounting;

/**
 *
 * @author YORLEY
 */
public class Cliente {
    private int id;
private String nombre;
private String documento;
private String correo;
private String telefono;
public Cliente(int id, String nombre, String documento, String correo, String telefono) {
    this.id = id;
    this.nombre = nombre;
    this.documento = documento;
    this.correo = correo;
    this.telefono = telefono;
}
public int getId() {
    return id;
}

public String getNombre() {
    return nombre;
}

public String getDocumento() {
    return documento;
}

public String getCorreo() {
    return correo;
}

public String getTelefono() {
    return telefono;
}
}
