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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author whoami
 */
@Entity
@Table(name="encontro")
public class Encontro implements Serializable{
    
    @Id
    @Column(name="id_encontro")
    @SequenceGenerator(name="encontro_gen", sequenceName="encontro_id",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="encontro_gen")
    private int id_encontro;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataEncontro; // já iunclui hora;
    @OneToOne
    @JoinColumn(nullable = false)
    private Categoria categoria;
    @Column(nullable = false)
    private int idadeMin;
    @Column(nullable = false)
    private int idadeMax;
    @Column(nullable = false)
    private Local localEncontro;
    @OneToOne
    @JoinColumn(nullable = false)
    private Regiao regiao;
    @Column(nullable = false)
    private Participantes participantes;
    @Column(nullable = false)
    private boolean femenino;
    @Column(nullable = false)
    private boolean masculino;
  
    @ManyToMany
    private List<Usuario> usuarios;

    public Encontro() {
    }

    public int getId_encontro() {
        return id_encontro;
    }

    public void setId_encontro(int id_encontro) {
        this.id_encontro = id_encontro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getDataEncontro() {
        return dataEncontro;
    }

    public void setDataEncontro(Calendar dataEncontro) {
        this.dataEncontro = dataEncontro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    public void setIdadeMax(int idadeMax) {
        this.idadeMax = idadeMax;
    }

    public Local getLocalEncontro() {
        return localEncontro;
    }

    public void setLocalEncontro(Local localEncontro) {
        this.localEncontro = localEncontro;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public Participantes getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participantes participantes) {
        this.participantes = participantes;
    }

    public boolean isFemenino() {
        return femenino;
    }

    public void setFemenino(boolean femenino) {
        this.femenino = femenino;
    }

    public boolean isMasculino() {
        return masculino;
    }

    public void setMasculino(boolean masculino) {
        this.masculino = masculino;
    }

    
    
    
}
