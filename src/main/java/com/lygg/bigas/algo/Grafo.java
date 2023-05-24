package com.lygg.bigas.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Grafo {

    private final ArrayList<Tarefa> vertices;

    public Grafo() {
        this.vertices = new ArrayList<>();
    }

    public void addVertice(Tarefa tarefa) {
        vertices.add(tarefa);
    }

    public void addAresta(Tarefa t1, Tarefa t2) {
        t1.getProximos().add(t2);
        t2.getAnteriores().add(t1);
    }

    public ArrayList<Tarefa> topologicalSort() {
        final HashSet<Tarefa> visitados = new HashSet<>();
        final ArrayList<Tarefa> pilha = new ArrayList<>();

        this.vertices.forEach(vertice -> {
            if (!visitados.contains(vertice)) {
                this.dfs(vertice, visitados, pilha);
            }
        });

        return Collections.reverse(pilha);
    }

    private void dfs(Tarefa vertice, HashSet<Tarefa> visitados, ArrayList<Tarefa> pilha) {
        visitados.add(vertice);

        vertice.getProximos().forEach(proximo -> {
            if (!visitados.contains(proximo)) {
                this.dfs(proximo, visitados, pilha);
            }
        });

        pilha.add(vertice);
    }
}
