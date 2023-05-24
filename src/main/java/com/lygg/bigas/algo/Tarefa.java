package com.lygg.bigas.algo;

import java.util.ArrayList;

public class Tarefa {
    private Integer id;
    private ArrayList<Tarefa> anteriores;
    private ArrayList<Tarefa> proximos;
    private Integer duracao;
    private Integer tChegada;


    public Tarefa(Integer id, ArrayList<Tarefa> anteriores, ArrayList<Tarefa> proximos, Integer duracao) {
        this.id = id;
        this.anteriores = anteriores;
        this.proximos = proximos;
        this.duracao = duracao;
        this.tChegada = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Tarefa> getAnteriores() {
        return anteriores;
    }

    public void setAnteriores(ArrayList<Tarefa> anteriores) {
        this.anteriores = anteriores;
    }

    public ArrayList<Tarefa> getProximos() {
        return proximos;
    }

    public void setProximos(ArrayList<Tarefa> proximos) {
        this.proximos = proximos;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
}
