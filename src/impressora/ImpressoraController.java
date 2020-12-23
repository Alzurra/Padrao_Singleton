/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

public class ImpressoraController {

    public static void main(String[] args) {
        // criando um obj de impressora pra poder imprimir
        Impressora impressora1 = Impressora.getInstance();

        System.out.println("\n**** IMPRIMINDO SEM TINTA E PAPEL ****");
        impressora1.imprimir("FATEC MOGI DAS CRUZES");

        // colocando tinta
        impressora1.setBlack(true);
        impressora1.setCiano(true);
        impressora1.setMagenta(true);
        impressora1.setYellow(true);

        // colocando papel
        impressora1.setPapel(true);

        // imprimindo
        System.out.println("\n**** IMPRIMINDO APOS COLOCAR AS TINTAS E PAPEL ****\n");
        impressora1.imprimir("Mogi das Cruzes");

        System.out.println("\n**** TENTANDO CRIAR UMA NOVA INSTÂNCIA DE IMPRESSORA ****\n");

        // tentando criando outra instancia de impressora
        Impressora impressora2 = Impressora.getInstance();

        System.out.println();
        impressora2.imprimir("FATEC ADS");

    }
}
