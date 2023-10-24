package com.example.CRUD.Usuarios;

public class Usuarios {
    private  int Usu_Codigo;
    private  String Usu_Nombre;
    private  String Usu_Url;
    private  String Usu_Estado;

    public Usuarios() {
    }

    public Usuarios(int usu_Codigo, String usu_Nombre, String usu_Url, String usu_Estado) {
        Usu_Codigo = usu_Codigo;
        Usu_Nombre = usu_Nombre;
        Usu_Url = usu_Url;
        Usu_Estado = usu_Estado;
    }

    public Usuarios(String usu_Nombre, String usu_Url, String usu_Estado) {
        Usu_Nombre = usu_Nombre;
        Usu_Url = usu_Url;
        Usu_Estado = usu_Estado;
    }

    public int getUsu_Codigo() {
        return Usu_Codigo;
    }

    public void setUsu_Codigo(int usu_Codigo) {
        Usu_Codigo = usu_Codigo;
    }

    public String getUsu_Nombre() {
        return Usu_Nombre;
    }

    public void setUsu_Nombre(String usu_Nombre) {
        Usu_Nombre = usu_Nombre;
    }

    public String getUsu_Url() {
        return Usu_Url;
    }

    public void setUsu_Url(String usu_Url) {
        Usu_Url = usu_Url;
    }

    public String getUsu_Estado() {
        return Usu_Estado;
    }

    public void setUsu_Estado(String usu_Estado) {
        Usu_Estado = usu_Estado;
    }
}
