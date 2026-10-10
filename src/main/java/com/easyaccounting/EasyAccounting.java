/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.easyaccounting;

/**
 *
 * @author YORLEY
 */
public class EasyAccounting {

    public static void main(String[] args) {
   
ClienteDAO clienteDAO = new ClienteDAO();
clienteDAO.eliminar(2);
clienteDAO.consultar();
    }
}
