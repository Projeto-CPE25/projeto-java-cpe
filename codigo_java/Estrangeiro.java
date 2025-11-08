package codigo_java;

public class Estrangeiro extends Usuario {
    private String paisOrigem;

    public Estrangeiro(int id, String nome, String email, String senha, String cidade, String pais, String idiomaPrincipal, String paisOrigem){
        super(id, nome, email, senha, cidade, pais, idiomaPrincipal);
        this.paisOrigem = paisOrigem;
    }

    //Método para solicitar uma ajuda a uma empresa
    public void solicitarAjuda(Empresa empresa){
        System.out.println(super.getNome()+ " solicitou ajuda à empresa " +empresa.getNome());
    }
}