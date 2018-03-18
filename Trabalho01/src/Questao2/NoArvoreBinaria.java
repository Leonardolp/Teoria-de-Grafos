/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author alexandre
 */
public class NoArvoreBinaria implements Comparable<NoArvoreBinaria> {
    private int info;
    private char letra;
    private NoArvoreBinaria esq;
    private NoArvoreBinaria dir;
    
    
    public NoArvoreBinaria(int info, char letra){
        this.info = info;
        this.letra = letra;
        this.esq = null;
        this.dir = null;
    }
    
    public NoArvoreBinaria(int info, NoArvoreBinaria esq, NoArvoreBinaria dir){
        this.dir = dir;
        this.esq = esq;
        this.info = info;
    }
    
    public int getInfo(){
        return this.info;
    }

    @Override
    public int compareTo(NoArvoreBinaria outro) {
        if (this.info < outro.info) {
            return -1;
        }
        if (this.info > outro.info) {
            return 1;
        }
        return 0;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /**
     * @return the esq
     */
    public NoArvoreBinaria getEsq() {
        return esq;
    }

    /**
     * @param esq the esq to set
     */
    public void setEsq(NoArvoreBinaria esq) {
        this.esq = esq;
    }

    /**
     * @return the dir
     */
    public NoArvoreBinaria getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(NoArvoreBinaria dir) {
        this.dir = dir;
    }
    
    
}
