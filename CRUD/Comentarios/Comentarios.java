package com.example.CRUD.Comentarios;

public class Comentarios {

    private  int Com_Codigo;
    private  String Com_Comentario;
    private  String Com_Estado;
    private  int Usu_Codigo;

    public Comentarios() {
    }

    public Comentarios(int com_Codigo,String com_Comentario,String com_Estado, int usu_Codigo ) {
        Com_Codigo = com_Codigo;
        Com_Comentario = com_Comentario;
        Com_Estado = com_Estado;
        Usu_Codigo = usu_Codigo;
    }

    public Comentarios(String com_Comentario,String com_Estado, int usu_Codigo) {
        Com_Comentario = com_Comentario;
        Com_Estado = com_Estado;
        Usu_Codigo = usu_Codigo;
    }

    public String getCom_Comentario() {return Com_Comentario;}

    public void setCom_Comentario(int Com_Comentario) {
        Com_Comentario = Com_Comentario;
    }

    public String getCom_Estado() {
        return Com_Estado;
    }

    public void setCom_Estado(String com_Estado) {
        Com_Estado = com_Estado;
    }
    public int getUsu_Codigo() {
        return Usu_Codigo;
    }

    public void setUsu_Codigo(int usu_Codigo) {
        Usu_Codigo = usu_Codigo;
    }
}
