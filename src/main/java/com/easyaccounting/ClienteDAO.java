package com.easyaccounting;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ClienteDAO {

    public void insertar(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombre, documento, correo, telefono) VALUES (?, ?, ?, ?)";

        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getDocumento());
            sentencia.setString(3, cliente.getCorreo());
            sentencia.setString(4, cliente.getTelefono());

            sentencia.executeUpdate();
            System.out.println("Cliente insertado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
        }
    }
    
    public void consultar() {
    String sql = "SELECT * FROM clientes";

    try (Connection conexion = ConexionBD.conectar();
         PreparedStatement sentencia = conexion.prepareStatement(sql);
         ResultSet resultado = sentencia.executeQuery()) {

        while (resultado.next()) {
            System.out.println(
                resultado.getInt("id") + " - " +
                resultado.getString("nombre") + " - " +
                resultado.getString("documento") + " - " +
                resultado.getString("correo") + " - " +
                resultado.getString("telefono")
            );
        }

    } catch (SQLException e) {
        System.out.println("Error al consultar clientes: " + e.getMessage());
    }
}
    
    public void actualizar(int id, String nombre, String documento, String correo, String telefono) {
    String sql = "UPDATE clientes SET nombre = ?, documento = ?, correo = ?, telefono = ? WHERE id = ?";

    try (Connection conexion = ConexionBD.conectar();
         PreparedStatement sentencia = conexion.prepareStatement(sql)) {

        sentencia.setString(1, nombre);
        sentencia.setString(2, documento);
        sentencia.setString(3, correo);
        sentencia.setString(4, telefono);
        sentencia.setInt(5, id);

        sentencia.executeUpdate();
        System.out.println("Cliente actualizado correctamente.");

    } catch (SQLException e) {
        System.out.println("Error al actualizar cliente: " + e.getMessage());
    }
}
    
    public void eliminar(int id) {
    String sql = "DELETE FROM clientes WHERE id = ?";

    try (Connection conexion = ConexionBD.conectar();
         PreparedStatement sentencia = conexion.prepareStatement(sql)) {

        sentencia.setInt(1, id);

        sentencia.executeUpdate();
        System.out.println("Cliente eliminado correctamente.");

    } catch (SQLException e) {
        System.out.println("Error al eliminar cliente: " + e.getMessage());
    }
}
}