package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.Pedido;
import br.unitins.topicos1.model.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.NoResultException;

@ApplicationScoped
public class PedidoRepository implements PanacheRepository<Pedido> {
    public List<Pedido> findAll(String login) {
        return find("usuario.login = ?1", login).list();
    }

    public Pedido findByIdLogado(String login, Long id) {
        return find("usuario.login = ?1 AND id = ?2", login, id).singleResult();
    }

}
