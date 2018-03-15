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
public class NoArvoreBinaria {
    private int info;
    private char letra;
    private NoArvoreBinaria esq;
    private NoArvoreBinaria dir;
    
    
    public NoArvoreBinaria(int info, char letra){
        this.info = info;
        this.esq = null;
        this.dir = null;
    }
    
    public NoArvoreBinaria(int info, char letra, NoArvoreBinaria esq, NoArvoreBinaria dir){
        this.dir = dir;
        this.esq = esq;
        this.info = info;
    }
    
    public int getInfo(){
        return this.info;
    }
    
    public NoArvoreBinaria getEsquerda(){
        return this.esq;
    }
    
    public NoArvoreBinaria getDireita(){
        return this.dir;
    }
    
    
}
