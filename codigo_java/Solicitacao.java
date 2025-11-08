package codigo_java;

import java.time.LocalDateTime;

public class Solicitacao {
    //Atributos
    private int id;
    private Empresa empresa;
    private Guia guia;
    private Estrangeiro estrangeiro;
    private String status;
    private LocalDateTime dataSolicitacao;

    //Construtor 
    public Solicitacao(int id, Empresa empresa, Guia guia, Estrangeiro estrangeiro){
        this.id = id;
        this.empresa = empresa;
        this.guia = guia;
        this.estrangeiro = estrangeiro;
        this.status = "pendente";
        this.dataSolicitacao = LocalDateTime.now();
    }

    
    //Getters e Setters

    public Empresa getEmpresa() {
        return empresa;
    }


    public Guia getGuia() {
        return guia;
    }


    public Estrangeiro getEstrangeiro() {
        return estrangeiro;
    }


    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public int getId(){
        return id;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    
}