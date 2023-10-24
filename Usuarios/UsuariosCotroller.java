package com.example.CRUD.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Usuarios")
public class UsuariosCotroller {
    private  final UsuariosService usuariosService;

    @Autowired
    public  UsuariosCotroller(UsuariosService usuariosService){
        this.usuariosService= usuariosService;
    }


@GetMapping
  public  List<Usuarios> GetUsuarios(){
        return this.usuariosService.GetUsuarios();
}


}
