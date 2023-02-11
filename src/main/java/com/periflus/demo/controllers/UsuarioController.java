package com.periflus.demo.controllers;

import com.periflus.demo.dao.UsuarioDao;
import com.periflus.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Pedro");
        usuario.setApellido("Diaz");
        usuario.setEmail("alumno.187277@ies-azarquiel.es");
        usuario.setTelefono("123123123");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value="editar")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pedro");
        usuario.setApellido("Diaz");
        usuario.setEmail("alumno.187277@ies-azarquiel.es");
        usuario.setTelefono("123123123");
        return usuario;
    }

    @RequestMapping(value="eliminar")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pedro");
        usuario.setApellido("Diaz");
        usuario.setEmail("alumno.187277@ies-azarquiel.es");
        usuario.setTelefono("123123123");
        return usuario;
    }
}
