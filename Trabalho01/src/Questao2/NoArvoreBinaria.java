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
public class NoArvoreBinaria<T> {
    private T info;
    private NoArvoreBinaria<T> esq;
    private NoArvoreBinaria<T> dir;
    public NoArvoreBinaria(T info){
        this.info = info;
        this.esq = null;
        this.info = null;
    }
    
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir){
        this.dir = dir;
        this.esq = esq;
        this.info = info;
    }
    
    public T getInfo(){
        return this.info;
    }
    
    public NoArvoreBinaria<T> getEsquerda(){
        return this.esq;
    }
    
    public NoArvoreBinaria<T> getDireita(){
        return this.dir;
    }
    
    
}
