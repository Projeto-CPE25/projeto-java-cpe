package codigo_java;

public class Empresa extends Usuario{
    //Atributos específicos dessa classe
    private String cnpj;
    private String setor;


    //Construtor
    public Empresa(int id, String nome, String email, String senha, String cidade, String pais, String idiomaPrincipal, String cnpj, String setor){
        super(id, nome, email, senha, cidade, pais, idiomaPrincipal);
        this.cnpj = cnpj;
        this.setor = setor;
    }

    //Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    //Método para publicar uma solicitação
    public void publicarSolicitacao(Solicitacao s){
        System.out.println("Solicitação publicada pela empresa: " +super.getNome());
    }
}
