package br.paduan.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.controle.dao.UsuarioDAO;
import br.paduan.controle.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
public class UsuarioController {
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuarios")
    public List<Usuario> buscarTodos(){
        List<Usuario> lista = (List<Usuario>)dao.findAll();
        return lista;
    }

    //Fazer um end point do tipo POST para efeturar o login no sistema
    //em caso de falha retornar o código indicando não autorizado
    //em caso de sucesso retornar os dados do usuário

    @PostMapping("/usuario/login/email")
    public ResponseEntity<Usuario> fazerLoginPorEmail(@RequestBody Usuario user) {
        Usuario usuario = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());
        
        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.status(403).build();
        }
    }
    
    @PostMapping("/usuario/login")
    public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario user) {
        Usuario userEncontrado = dao.findByEmailOrCpf(user.getEmail(), user.getCpf());
        
        if(userEncontrado != null){
            if(userEncontrado.getSenha().equals( user.getSenha() )){
                userEncontrado.setChamados(null);
                userEncontrado.setSenha("*****");
                return ResponseEntity.ok(userEncontrado);
            }
        }

        return ResponseEntity.status(403).build();
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id) {
        Usuario usuario = dao.buscarUsuarioPorId(id);
        
        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.status(404).build();
        }
    }
    

    @GetMapping("/usuario/nativo/{id}")
    public ResponseEntity<Object[]> buscarPorIdNativo(@PathVariable int id) {
        Object[] usuario = dao.buscarUsuarioPorIdNativo(id);
        
        if(usuario != null){
            return ResponseEntity.ok(usuario);
        }else{
            return ResponseEntity.status(404).build();
        }
    }
}
