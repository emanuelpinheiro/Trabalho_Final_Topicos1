package br.unitins.topicos1.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
// import jakarta.persistence.EnumType;
// import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario extends DefaultEntity {

    private String nome;
    private String login;
    private String senha;
    private String email;
    private Perfil perfil;
    private String cpf;

    private String nomeImage;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "biblioteca_jogos", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_jogo"))
    private List<Jogo> meusJogos;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "usuario_telefone", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_telefone"))
    private List<Telefone> listaTelefone;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "usuario_endereco", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_endereco"))
    private List<Endereco> listaEndereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Telefone> getListaTelefone() {
        return listaTelefone;
    }

    public void setListaTelefone(List<Telefone> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }

    public List<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(List<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Jogo> getMeusJogos() {
        return meusJogos;
    }

    public void setMeusJogos(List<Jogo> meusJogos) {
        this.meusJogos = meusJogos;
    }

    public String getNomeImage() {
        return nomeImage;
    }

    public void setNomeImage(String nomeImage) {
        this.nomeImage = nomeImage;
    }

    public void setNomeImagem(String nomeImagem) {
    }

}
