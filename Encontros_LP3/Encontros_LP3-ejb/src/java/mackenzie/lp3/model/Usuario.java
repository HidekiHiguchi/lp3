/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author whoami
 */
@Entity
@Table(name="table_user")
public class Usuario implements Serializable{
    
    @Id
    @Column(name="id_user")
    @SequenceGenerator(name="user_gen", sequenceName="user_id",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_gen")
    private int userID;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataNascimento;
    @Column(nullable = false)
    private String sexo;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String rg;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private Login login;
    @ManyToMany(mappedBy = "usuarios")
    private List<Encontro> encontro;
    public Usuario() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<Encontro> getEncontro() {
        return encontro;
    }

    public void setEncontro(List<Encontro> encontro) {
        this.encontro = encontro;
    }
    
    
}
