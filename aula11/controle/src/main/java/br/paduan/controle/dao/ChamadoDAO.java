package br.paduan.controle.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.paduan.controle.model.Chamado;
import br.paduan.controle.model.Usuario;

public interface ChamadoDAO extends CrudRepository<Chamado, Integer> {
    public List<Chamado> findByStatus(int status);
    public List<Chamado> findByStatusAndUsuario(int status, Usuario usuario);
}
