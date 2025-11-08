package codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Guia extends Usuario {
    //Atributos
    private List<String> idiomasExtras;
    private double avaliacao;

    //Construtor
    public Guia(int id, String nome, String email, String senha, String cidade, String pais, String idiomaPrincipal, List<String> idiomasExtras) {
        super(id, nome, email, senha, cidade, pais, idiomaPrincipal);
        this.idiomasExtras = idiomasExtras;
        this.avaliacao = 0.0;
    }

    public String getIdiomaPrincipal(){
        return super.getIdiomaPrincipal();
    }

    //Método para imprimir a avaliação do Guia.
    public void exibirAvaliacao() {
        System.out.println("Avaliação atual de " + getNome() + ": " + avaliacao);
    }

    //Método para aceitar uma solicitação
    public void aceitarSolicitacao(Solicitacao s){
        System.out.println("Guia " +super.getNome()+ " aceitou a solicitação ID: " +s.getId());
        s.setStatus("aceita");
    }

}
