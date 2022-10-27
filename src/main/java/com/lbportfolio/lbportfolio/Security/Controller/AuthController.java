package com.lbportfolio.lbportfolio.Security.Controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbportfolio.lbportfolio.Security.Entity.Rol;
import com.lbportfolio.lbportfolio.Security.Entity.Usuario;
import com.lbportfolio.lbportfolio.Security.Enums.RolNombre;
import com.lbportfolio.lbportfolio.Security.Service.RolService;
import com.lbportfolio.lbportfolio.Security.Service.UsuarioService;
import com.lbportfolio.lbportfolio.Security.jwt.JwtProvider;

import lombok.Value;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    RolService rolService;
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ResponseEntity(new Mensaje ("Campos mal cargados o email inválido"), HttpStatus.BAD_REQUEST);
        }
        if(usuarioService.existByNombreUSuario(nombreUsuario.getNombreUsuario())){
            return new ResponseEntity(new Mensaje("Este nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(usuarioService.existByEmail(nombreUsuario.getEmail())){
            return new ResponseEntity(new Mensaje("El mail ingresado ya esta siendo usado"), HttpStatus.BAD_REQUEST);
        }
        Usuario usuario = new Usuario(nuevoUsuario.getNombre(), nuevoUsuario.getNombreUsuario(), nuevoUsuario.getEmail(), passwordEncoder.encode(nuevoUsuario.getPassword()));

        Set<Rol> roles = HashSet<>();
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());

        if(nuevoUsuario.getRoles().contains("admin")) {
            roles.add(RolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        }
        usuario.setRoles(roles);
        usuarioService.save(usuario);

        return new ResponseEntity(new Mensaje("Usuario creado exitosamente"),HttpStatus.CREATED);
    }
}
