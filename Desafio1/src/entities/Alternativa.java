package entities;

public class Alternativa {

    private char letra;
    private String resposta;
    private boolean correta;

    public Alternativa (char letra, String resposta, boolean correta){
        this.letra = letra;
        this.resposta = resposta;
        this.correta = correta;
    }

    public char getLetra(){
        return letra;
    }

    public void setLetra(char letra){
        this.letra = letra;
    }



}
