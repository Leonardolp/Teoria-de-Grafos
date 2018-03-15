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
public class ArvoreBinaria {
    private NoArvoreBinaria raiz;
    public ArvoreBinaria(){
        raiz = null;
    }
    
    public void setRaiz(NoArvoreBinaria raiz){
        this.raiz = raiz;
    } 
    
    public boolean estaVazia(){
        if(this.raiz == null)
            return true;
        
        return false;
    }
    
    public boolean pertence(int info){
        return pertence(info, raiz);
    }
    
    private boolean pertence(int info, NoArvoreBinaria no){
        if(no == null)
            return false;
        
        return no.getInfo() == info;
    }
    
    private String arvorePre(NoArvoreBinaria no){
        
        return "";
    }
    
    public String toString(){
        return "";
    }
}
