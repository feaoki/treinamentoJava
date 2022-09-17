package br.paduan.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.controle.dao.ChamadoDAO;
import br.paduan.controle.model.Chamado;
import br.paduan.controle.model.Usuario;

@RestController
@CrossOrigin("*")
public class ChamadoController {

    @Autowired
    private ChamadoDAO dao;

    @GetMapping("/chamado/{id}")
    public Chamado buscarUm(@PathVariable int id) {
        Chamado chamado = dao.findById(id).orElse(null);
        return chamado;
    }

    @GetMapping("/chamado/pendentes")
    public List<Chamado> buscarPendentes() {
        List<Chamado> chamados = dao.findByStatus(0);
        return chamados;
    }

    @GetMapping("/chamado/pendentes/{id}")
    public List<Chamado> buscarPendentes(@PathVariable int id) {
        Usuario usuario = new Usuario(id);
        List<Chamado> chamados = dao.findByStatusAndUsuario(0, usuario);
        return chamados;
    }

    @GetMapping("/chamado/atendidos/{id}")
    public List<Chamado> buscarAtendidos(@PathVariable int id) {
        Usuario usuario = new Usuario(id);
        List<Chamado> chamados = dao.findByStatusAndUsuario(1, usuario);
        return chamados;
    }

    @GetMapping("/chamado/fechados")
    public List<Chamado> buscarFechados() {
        List<Chamado> chamados = dao.findByStatus(1);
        return chamados;
    }

    @PostMapping("/chamado/update")
    public ResponseEntity<Chamado> updateChamado(@RequestBody Chamado chamado) {
        Chamado novo = dao.save(chamado);

        return ResponseEntity.ok(novo);
    }

    /*
    No 'Postman' o chamado para esse método deve ser feito com um 'corpo' como formato JSON indicado abaixo.
    Observe que o id do usuáriod deve ser enviado conforme a estrutura do objeto da relação, e não
    pensando no campo da tabela.
    Observe também que no campo de hora o formato deve ser dois dígidos em cada HH:mm, assim como na data

        {
            "numChamado": 1,
            "descricao": "Chamado modificado",
            "dataAgendamento": "20/09/2020",
            "horasGastas": "01:30",
            "troca": 1,
            "status": 1,
            "usuario": {
                "id": 2
            },
            "atividade": {
                "id": 1
            }
        }
    */

}