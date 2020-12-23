/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

/**
 *
 * @author Thiago
 */
public class Impressora {

    private static Impressora impressoraUnica;
    private Boolean papel;
    private Boolean magenta;
    private Boolean ciano;
    private Boolean black;
    private Boolean yellow;

    private Impressora() {
        papel = false;
        magenta = false;
        ciano = false;
        black = false;
        yellow = false;
    }

    public void setPapel(Boolean papel) {
        this.papel = papel;
    }

    public void setMagenta(Boolean magenta) {
        this.magenta = magenta;
    }

    public void setCiano(Boolean ciano) {
        this.ciano = ciano;
    }

    public void setBlack(Boolean black) {
        this.black = black;
    }

    public void setYellow(Boolean yellow) {
        this.yellow = yellow;
    }

    public boolean isMagenta() {
        return magenta;
    }

    public boolean isYellow() {
        return yellow;
    }

    public boolean isBlack() {
        return black;
    }

    public boolean isCiano() {
        return ciano;
    }

    public boolean isPaper() {
        return papel;
    }

    public static Impressora getInstance() {
        if (impressoraUnica == null) {
            System.out.println("Criando uma instância de impressora...");
            System.out.println("Retornando uma instância de impressora...");
            impressoraUnica = new Impressora();
        } else {
            System.out.println("Já existe uma instancia de impressora. nao posso criar outra!");
            System.out.println("Retornando uma instância existente de impressora...");
        }
        return impressoraUnica;
    }

    public void imprimir(String texto) {
        if (isPaper() && isCiano() && isBlack() && isMagenta() && isYellow()) {
            System.out.println("Imprimindo...");
            System.out.println(texto);
        } else {
            System.out.println("\nErro ao tentar imprimir! Verifique sua impressora.\n");
            verificarPapel();
            verificarTintas();
        }
    }

    public void verificarTintas() {
        if (isYellow()) {
            System.out.println("Tinta Yellow: ok");
        } else {
            System.out.println("Tinta Yellow: sem tinta");
        }

        if (isMagenta()) {
            System.out.println("Tinta Magenta: ok");
        } else {
            System.out.println("Tinta Magenta: sem tinta");
        }

        if (isBlack()) {
            System.out.println("Tinta Black: ok");
        } else {
            System.out.println("Tinta Black: sem tinta");
        }

        if (isCiano()) {
            System.out.println("Tinta Ciano: ok");
        } else {
            System.out.println("Tinta Ciano: sem tinta");
        }
    }

    public void verificarPapel() {
        if (isPaper()) {
            System.out.println("Papel: ok");
        } else {
            System.out.println("Papel: sem papel");
        }
    }

}
