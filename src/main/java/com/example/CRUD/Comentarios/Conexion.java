package com.example.CRUD.Comentarios;

import java.sql.*;

/**
 *
 * @author Fran
 * Clase encargada de conectar y desconectar de una base de datos
 */
public class Conexion {

    /* Declaramos 5 variables con el driver, la bbdd, usuario y contraseña
    y una para almacenar el error en caso de suceder*/

    private static final String bbdd="jdbc:mysql://mysql-jhoanaaucancela.alwaysdata.net:3306/jhoanaaucancela_foro";
    private static final String usuario ="22741";
    private static final String clave="jhoanasistemas";
    private static Connection conex = null;
    private static String error="";

    /**
     *
     * @return Devuelve la conexión a una base de datos
     */
    public static Connection getConexion(){
        try {
            conex = DriverManager.getConnection(bbdd, usuario, clave);
        } catch (Exception e) {
            error = e.getMessage();
            return null;
        }
        return conex;
    }

    /**
     *
     * @param conex Parámetro que contiene la conexión que deseamos cerrar
     */
    public static void getCerrarConexion(Connection conex){
        try{
            conex.close(); // Cerramos la conexión
        }catch(SQLException e){
            error = e.getMessage();
        }
    }

    /**
     *
     * @return Devuelve el error en caso de no poder conectar o desconectar
     * de la base de datos.
     */
    public String getError(){
        return error;
    }


    private Statement miStatement=null;
    public boolean insertarActualizarRegistros(String consultaSQL) {
        try {
            // Creamos el objeto Statement.
            miStatement=conex.createStatement();
            // Ejecutamos el objeto pasandole la consulta
            // que se le está pasando por parámetro.
            miStatement.executeUpdate(consultaSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }


    private ResultSet miResultSet = null;
    public ResultSet consultarDatos(String consultaSQL){
        try {
            // Creamos el objeto Statement.
            miStatement=conex.createStatement();
            // Asignamos la ejecución de la consulta al objeto ResultSet
            miResultSet=miStatement.executeQuery(consultaSQL);
        } catch (Exception e) {
            // Si hay errores no devolvemos nada
            System.out.println(e.getMessage());
            return null;
        }
        //Si todo va bien devolvemos el resultset
        return miResultSet;
    }

}
