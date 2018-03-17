/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinaria;

/**
 *
 * @author leonardo
 */
public class PrincArvore {
    
    public static void main(String[] args) {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
        
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        no1.NoArvoreBinaria(00, no2, no3);
        no2.NoArvoreBinaria(1, no4, no6);
        no3.NoArvoreBinaria(3, no5, no7);
        
        if (arvore.pertence(3)) {
            System.out.println("pertence");            
        }
        System.out.println(arvore.toString());
        System.out.println(arvore.quantNos(no1));
        System.out.println(arvore.quantNosDir(no1));
        System.out.println(arvore.quantNosEsq(no1));
        
    }
}
