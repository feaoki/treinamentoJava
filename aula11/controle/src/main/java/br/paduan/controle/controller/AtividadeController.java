package br.paduan.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.paduan.controle.dao.AtividadeDAO;
import br.paduan.controle.model.Atividade;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
public class AtividadeController {
    
    @Autowired
    private AtividadeDAO dao;

    @GetMapping("/atividades")
    public List<Atividade> listarAtividades() {
        return (List<Atividade>) dao.findAll();
    }
    
    @GetMapping("/atividade/{id}")
    public ResponseEntity<Atividade> atividadePorId(@PathVariable int id) {
        Atividade atvFinded =  dao.findById(id).orElse(null);
        if(atvFinded != null){
            return ResponseEntity.ok(atvFinded);
        }
        return ResponseEntity.notFound().build();
        
    }

    @PostMapping("/atividade/nova")
    public ResponseEntity<Atividade> postMethodName(@RequestBody Atividade atividade) {
        Atividade novaAtividade = dao.save(atividade);
        if(novaAtividade != null){
            return ResponseEntity.ok(novaAtividade);
        }
        return ResponseEntity.badRequest().build();
    }
 
    
}
