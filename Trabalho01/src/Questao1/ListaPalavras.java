/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class ListaPalavras {
    
    private NoLista posicao;
    private NoLista primeiro;
    
    public void inserir(String palavra) {
        if (estaVazia()) {
            setPrimeiro(new NoLista());
        }
        
        getPrimeiro().setPalavra(palavra);
    }
    
    public int posicao() {
        return posicao.getPosicao();
    }
    
    public String GetValor() {
        return posicao.getPalavra();
    }
    
    public boolean estaVazia() {
        return getPrimeiro() == null;
    }
    
    public void InserirLinha(String prTexto) {
        String text = prTexto.replaceAll("[^a-zA-Z]", " ");
        if (!text.trim().equals("")) {
            String[] palavras = text.split(" ");
            for (int i = 0; i < palavras.length; i++) {
                inserir(palavras[i]);
            }
        }
    }

    /**
     * @return the primeiro
     */
    public NoLista getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(NoLista primeiro) {
        this.primeiro = primeiro;
    }
    
    public void First() {
        posicao = primeiro;
    }
    
    public void Next() {
        posicao = posicao.getProximo();
    }
    
    public boolean EOF() {
        return posicao.EOF();
    }
    
}
