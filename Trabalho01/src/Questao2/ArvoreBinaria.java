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
    
     private boolean pertence(int info, NoArvoreBinaria no) {
        if (no == null) {
            return false;
        }
        return (no.getInfo() == info || pertence(info, no.getDireita())
                || pertence(info, no.getEsquerda()));
    }

    public String toString() {
        return arvorePre(this.raiz);
    }

    private String arvorePre(NoArvoreBinaria no) {
        if (no == null) {
            return "<>";
        } else {
            return "<" + no.getInfo() + arvorePre(no.getDireita()) + arvorePre(no.getEsquerda());
        }
    }

    public int quantNos(NoArvoreBinaria raiz) {
        if (raiz != null) {
            return 1 + quantNos(raiz.getEsquerda()) + quantNos(raiz.getDireita());
        }
        return 0;
    }

    public int quantNosDir(NoArvoreBinaria raiz) {
        if (raiz != null) {
            return 1 + quantNosDir(raiz.getDireita());
        }
        return 0;
    }
    public int quantNosEsq(NoArvoreBinaria raiz) {
        if (raiz != null) {
            return 1 + quantNosEsq(raiz.getEsquerda());
        }
        return 0;
    }
}
