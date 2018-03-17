/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinaria;

/**
 *
 * @author leona
 */
public class NoArvoreBinaria<T> {

    private T info;
    private NoArvoreBinaria<T> esq;
    private NoArvoreBinaria<T> dir;

    public NoArvoreBinaria(T info) {
        this.info = info;
    }

    public void NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        this.info = info;
        this.dir = dir;
        this.esq = esq;
    }

    public T getInfo() {
        return info;
    }

    public NoArvoreBinaria getEsquerda() {
        return esq;
    }

    public NoArvoreBinaria getDireita() {
        return dir;
    }

}
