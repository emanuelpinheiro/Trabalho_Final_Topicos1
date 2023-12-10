package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.MetodoDePagamento;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MetodoPagamentoRepository implements PanacheRepository<MetodoDePagamento> {
    public List<MetodoDePagamento> findAll(String login) {
        return find("usuario.login =?1", login).list();

    }

}
