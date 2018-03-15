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
public class Letra implements Comparable<Letra>{
        
    private int numero;
    private char let;
    
    public Letra(int numero,char letra){
        this.numero = numero;
        this.let = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLet() {
        return let;
    }

    public void setLet(char let) {
        this.let = let;
    }
    
    public int compareTo(Letra outra) {
        if (this.numero < outra.numero) {
            return -1;
        }
        if (this.numero > outra.numero) {
            return 1;
        }
        return 0;
    }
}

