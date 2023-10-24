package com.example.CRUD.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    public List<Usuarios> GetUsuarios(){
        return  List.of( new  Usuarios(1,
                "Juan123",
                "https://image.png",
                "A"));
    }

}
