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

    /**
     * @return the raiz
     */
    public NoArvoreBinaria getRaiz() {
        return raiz;
    }

    private NoArvoreBinaria raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        if (this.getRaiz() == null) {
            return true;
        }

        return false;
    }

    public boolean pertence(int info) {
        return pertence(info, getRaiz());
    }

    private boolean pertence(int info, NoArvoreBinaria no) {
        if (no == null) {
            return false;
        }
        return (no.getInfo() == info || pertence(info, no.getDir())
                || pertence(info, no.getEsq()));
    }

    public String toString() {
        return arvorePre(this.getRaiz());
    }

    private String codigoLetras(NoArvoreBinaria no, String i) {
        String cod = "";
        if (no.getDir() != null) {
            //esquerda para direita
            cod = cod + codigoLetras(no.getEsq(), i + " " + "0");
            cod = cod + codigoLetras(no.getDir(), i + " " + "1");

            return cod;
        } else {
            return "Letra = " + no.getLetra() + " Codigo = " + i + " Frequência = " + no.getInfo() + "\n ";
        }

    }

    private String getCaracter(NoArvoreBinaria no, char i, String cod) {
        String retorno = "";

        if (no.getLetra() != i) {
            //Esquerad para direita
            if (no.getEsq() != null) {
                retorno = getCaracter(no.getEsq(), i, cod + "" + "0");
                if (retorno.equals(""))
                retorno = getCaracter(no.getDir(), i, cod + "" + "1");
                if (retorno.equals(""))
                    return "";
                
                return retorno;
            }else
             return retorno;
        } else {
            return cod;
        }
    }

    public String getCaracter(char caracter) {
        return getCaracter(getRaiz(), caracter, "");
    }

    public String codigoLetras() {
        return codigoLetras(this.getRaiz(), "");
    }

    private String arvorePre(NoArvoreBinaria no) {
        if (no == null) {
            return "<>";
        } else {
            return "<" + no.getInfo() + no.getLetra() + arvorePre(no.getDir()) + arvorePre(no.getEsq());
        }
    }

    public int quantNos(NoArvoreBinaria raiz) {
        if (raiz != null) {
            return 1 + quantNos(raiz.getEsq()) + quantNos(raiz.getDir());
        }
        return 0;
    }

    public int quantNosDir(NoArvoreBinaria raiz) {
        if (raiz != null) {
            return 1 + quantNosDir(raiz.getDir());
        }
        return 0;
    }

    public int quantNosEsq(NoArvoreBinaria raiz) {
        if (raiz != null) {
            return 1 + quantNosEsq(raiz.getEsq());
        }
        return 0;
    }
}
