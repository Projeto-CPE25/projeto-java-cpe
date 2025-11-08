package codigo_java;

public class Usuario {
    //Atributos
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cidade;
    private String pais;
    private String idiomaPrincipal;
    

    //Construtor 
    public Usuario(int id, String nome, String email, String senha, String cidade, String pais, String idiomaPrincipal){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
        this.pais = pais;
        this.idiomaPrincipal = idiomaPrincipal;
    }


    //Getters e Setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdiomaPrincipal() {
        return idiomaPrincipal;
    }


    public void setIdiomaPrincipal(String idiomaPrincipal) {
        this.idiomaPrincipal = idiomaPrincipal;
    }  

    //metodo de exibir informações
    public void exibirInfo(){
        System.out.println("ID: " +id);
        System.out.println("Nome: " +nome);
        System.out.println("Email: " +email);
        System.out.println("Idioma " +idiomaPrincipal);
        System.out.println("Cidade: " +cidade);
    }
}
