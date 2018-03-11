/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1;

import javax.naming.spi.DirStateFactory;

/**
 *
 * @author leona
 */
public class NoLista {

    private NoLista proximo;
    private String palavra;
    private int posicao;

    public NoLista() {
        palavra = "";
        posicao = 0;
    }

    /**
     * @return the proximo
     */
    public NoLista getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the quant
     */
    public int getPosicao() {
        return posicao;
    }

    /**
     * @return the palavra
     */
    public String getPalavra() {
        return palavra;
    }

    /**
     * @param palavra the palavra to set
     */
    public void setPalavra(String prPalavra) {
        if (palavra.equals("")) {
            this.palavra = prPalavra;
        } else {
            if (!(palavra.equalsIgnoreCase(prPalavra))) {
                if (proximo == null){
                   proximo = new NoLista(); 
                }
                proximo.setPalavra(prPalavra);
                proximo.setPosicao(posicao+1);
            }
        }
    }

    public boolean EOF(){
        return proximo == null;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

}
