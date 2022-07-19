package entities;

public class Quiz {
    private int pergunta;
    private int alternativas;

    public Quiz() {

    }

    public Quiz (int pergunta, int alternativas){
        this.pergunta = (pergunta);
        this.alternativas = (alternativas);
    }

    public double question (){
        return (Math.random() * 10 + 1);
    }


    private void setPerguntas(int pergunta){
        this.pergunta = pergunta;
    }


    public String toString(){
        return "Bem vindo ao Quiz \n Esse quiz é composto por" + "Questoes.";
    }
}
