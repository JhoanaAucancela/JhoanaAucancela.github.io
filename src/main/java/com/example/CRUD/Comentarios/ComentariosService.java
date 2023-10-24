package com.example.CRUD.Comentarios;
import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ComentariosService {
    private JavaIOFileDescriptorAccess stmt;
    private static ResultSet resultSetConsulta=null;
    public ArrayList<Comentarios> GetComentarios() throws ClassNotFoundException {
        /*
        return  List.of( new  Comentarios(1,
                "Nuevo comentarios",
                "A",
                1));
    */
        ArrayList<Comentarios> listaComentarios = new ArrayList<Comentarios>(30);
        Conexion miConex = new Conexion();
        try {
            // Si se establece la conexión entonces...
            if(miConex.getConexion() != null){
                // Asignamos el resultado a un ResultSet
                resultSetConsulta=miConex.consultarDatos("SELECT * FROM Comentarios");
                // Mostramos los resultados
                while(resultSetConsulta.next()){
                    listaComentarios.add(new Comentarios(resultSetConsulta.getInt(1), resultSetConsulta.getString(2), resultSetConsulta.getString(3), resultSetConsulta.getInt(4)));
                }
            }
            else{
                System.out.println("No se ha podido conectar");
            }

        } catch (Exception e) {
            // Si surge algun error lo mostramos
            System.out.println(e.getMessage());
        }


        return listaComentarios;
    }

}