package codigo_java;

import java.util.List;
import java.util.ArrayList;

public class SistemaConecta {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    public void cadastrarUsuario(Usuario user){
        usuarios.add(user);
        System.out.println(user.getNome() + " cadastrado com sucesso!");
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario u : usuarios) {
                u.exibirInfo();
                System.out.println("--------------------");
            }
        }
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public void criarSolicitacao(Solicitacao s){
        solicitacoes.add(s);
        System.out.println("Solicitação criada com sucesso!");
    }

    public void listarSolicitacoes() {
        if (solicitacoes.isEmpty()) {
            System.out.println("Nenhuma solicitação cadastrada.");
        } else {
            for (Solicitacao s : solicitacoes) {
                System.out.println("ID: " + s.getId() + 
                                   " | Empresa: " + s.getEmpresa().getNome() +
                                   " | Guia: " + s.getGuia().getNome() +
                                   " | Estrangeiro: " + s.getEstrangeiro().getNome() +
                                   " | Status: " + s.getStatus());
            }
        }
    }

    public void aceitarSolicitacao(int id) {
        for (Solicitacao s : solicitacoes) {
            if (s.getId() == id) {
                s.setStatus("aceita");
                System.out.println("Solicitação ID " + id + " foi aceita!");
                return;
            }
        }
        System.out.println("Solicitação não encontrada!");
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public List<Guia> buscarGuiasPorIdioma(String idioma){
        List<Guia> encontrados = new ArrayList<>();
        for(Usuario u : usuarios){
            if(u instanceof Guia guia && guia.getIdiomaPrincipal().equalsIgnoreCase(idioma)){
                encontrados.add(guia);
            }
        }
        return encontrados;
    }

    
}
