package com.example.CRUD.Comentarios;
import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ComentariosService {
    private JavaIOFileDescriptorAccess stmt;

    public ArrayList<Comentarios> GetComentarios() throws ClassNotFoundException {
        /*
        return  List.of( new  Comentarios(1,
                "Nuevo comentarios",
                "A",
                1));
    */
        ArrayList<Comentarios> listaComentarios = new ArrayList<Comentarios>();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://mysql-jhoanaaucancela.alwaysdata.net:3306/jhoanaaucancela_foro", "22741", "jhoanasistemas");
            Statement stmt = con.createStatement(); //Usamos create... no prepare...
            ResultSet rs = stmt.executeQuery("SELECT * FROM Comentarios");
            while (rs.next()) {
                int Com_Codigo = rs.getInt(1); //Si codigo es del tipo numérico en la BD debes usar getInt
                String Com_Comentario = rs.getString(2);
                String Com_Estado = rs.getString(3);
                int Usu_Codigo = rs.getInt(4);
                Comentarios com = new Comentarios(Com_Codigo, Com_Comentario, Com_Estado, Usu_Codigo);
                listaComentarios.add(com);
            }
        } catch (SQLException ex) {
            // Logger.getLogger(Level.SEVERE, null, ex);

        } finally {
            //try {rs.close();  } catch (Exception e) {Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);}
            //try {stmt.close();} catch (Exception e) {Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);}
            //try {con.close(); } catch (Exception e) {Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);}
        }
        return listaComentarios;
    }

}