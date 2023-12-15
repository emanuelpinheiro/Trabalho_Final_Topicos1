package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.Pix;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class PixRepository implements PanacheRepository<Pix> {
    public List<Pix> findAll(String login) {
        return find("usuario.login = ?1", login).list();
    }

    
}
