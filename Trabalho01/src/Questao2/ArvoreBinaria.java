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
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;
    public ArvoreBinaria(){
        raiz = null;
    }
    
    public void setRaiz(NoArvoreBinaria<T> raiz){
        this.raiz = raiz;
    } 
    
    public boolean estaVazia(){
        if(this.raiz == null)
            return true;
        
        return false;
    }
    
    public boolean pertence(T info){
        return pertence(info, raiz);
    }
    
    private boolean pertence(T info, NoArvoreBinaria<T> no){
        if(no == null)
            return false;
        
        return no.getInfo() == info;
    }
    
    private String arvorePre(NoArvoreBinaria<T> no){
        
        return "";
    }
    
    public String toString(){
        return "";
    }
}
