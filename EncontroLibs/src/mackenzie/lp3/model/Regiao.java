/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mackenzie.lp3.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author whoami
 */
@Entity
@Table(name="regiao")
public class Regiao implements Serializable{
    
    @Id
    @Column(name="id_regiao")
    @SequenceGenerator(name="regiao_gen", sequenceName="regiao_id",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="regiao_gen")
    private int id_regiao;
    @OneToMany
    private List<Categoria> categorias;
    @OneToMany
    private List<Encontro> encontros;
    private String UF;
    private String cidade;

    public Regiao() {
    }

    public int getIdRegiao() {
        return id_regiao;
    }

    public void setIdRegiao(int idRegiao) {
        this.id_regiao = idRegiao;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Encontro> getEncontros() {
        return encontros;
    }

    public void setEncontros(List<Encontro> encontros) {
        this.encontros = encontros;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
    
    
}
