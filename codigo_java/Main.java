package codigo_java;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        SistemaConecta sistema = new SistemaConecta();
        int opcao = 0;

        do{
            System.out.println("============MENU============");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Listar Usuários");
            System.out.println("3 - Buscar Guias por Idioma");
            System.out.println("4 - Criar Solicitação");
            System.out.println("5 - Listar Solicitações");
            System.out.println("6 - Aceitar Solicitação");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scn.nextInt();
            scn.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Qual tipo de usuário deseja cadastrar?");
                    System.out.println("1 - Empresa");
                    System.out.println("2 - Guia");
                    System.out.println("3 - Estrangeiro");
                    int tipo = scn.nextInt();
                    scn.nextLine();

                    System.out.print("Nome: ");
                    String nome = scn.nextLine();
                    System.out.print("Email: ");
                    String email = scn.nextLine();
                    System.out.print("Senha: ");
                    String senha = scn.nextLine();
                    System.out.print("Cidade: ");
                    String cidade = scn.nextLine();
                    System.out.print("País: ");
                    String pais = scn.nextLine();
                    System.out.print("Idioma principal: ");
                    String idioma = scn.nextLine();

                    if(tipo == 1){
                        System.out.print("CNPJ: ");
                        String cnpj = scn.nextLine();
                        System.out.print("Setor: ");
                        String setor = scn.nextLine();
                        Empresa emp = new Empresa(sistema.getUsuarios().size() + 1, nome, email, senha, cidade, pais, idioma, cnpj, setor);
                        sistema.cadastrarUsuario(emp);
                    } else if(tipo == 2){
                        System.out.print("Quantos idiomas extras o guia fala? ");
                        int qtd = scn.nextInt();
                        scn.nextLine();

                        List<String> idiomasExtras = new ArrayList<>();
                        for (int i = 0; i < qtd; i++) {
                            System.out.print("Idioma extra " + (i + 1) + ": ");
                            idiomasExtras.add(scn.nextLine());
                        }

                        Guia guia = new Guia(sistema.getUsuarios().size() + 1, nome, email, senha, cidade, pais, idioma, idiomasExtras);
                        sistema.cadastrarUsuario(guia);
                    } else if(tipo == 3){
                        System.out.print("País de origem: ");
                        String origem = scn.nextLine();
                        Estrangeiro est = new Estrangeiro(sistema.getUsuarios().size() + 1, nome, email, senha, cidade, pais, idioma, origem);
                        sistema.cadastrarUsuario(est);
                    }
                break;
                case 2:
                    sistema.listarUsuarios();
                break;
                case 3:
                    System.out.print("Digite o idioma para buscar: ");
                    String idiomaBuscar = scn.nextLine();
                    List<Guia> guias = sistema.buscarGuiasPorIdioma(idiomaBuscar);
                    if (guias.isEmpty()) {
                        System.out.println("Nenhum guia encontrado para o idioma: " + idiomaBuscar);
                    } else{
                        for (Guia g : guias) {
                            g.exibirInfo();
                        }
                    }
                break;
                case 4:
                    // Criar solicitação (exemplo simples)
                    System.out.println("ID da Empresa: ");
                    int idEmp = scn.nextInt();
                    System.out.println("ID do Guia: ");
                    int idGuia = scn.nextInt();
                    System.out.println("ID do Estrangeiro: ");
                    int idEst = scn.nextInt();
                    scn.nextLine();

                    Empresa emp = (Empresa) sistema.buscarUsuarioPorId(idEmp);
                    Guia guia = (Guia) sistema.buscarUsuarioPorId(idGuia);
                    Estrangeiro est = (Estrangeiro) sistema.buscarUsuarioPorId(idEst);

                    if (emp != null && guia != null && est != null) {
                        Solicitacao s = new Solicitacao(sistema.getSolicitacoes().size() + 1, emp, guia, est);
                        sistema.criarSolicitacao(s);
                    }  else {
                        System.out.println("IDs inválidos!");
                    }
                break;
                case 5:
                   sistema.listarSolicitacoes();
                break;
                case 6:
                    System.out.print("Digite o ID da solicitação a aceitar: ");
                    int idSol = scn.nextInt();
                    scn.nextLine();
                    sistema.aceitarSolicitacao(idSol);
                break;
                case 7:
                    System.out.println("Encerrando o sistema...");
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }while(opcao != 7);


        scn.close();
    }
}
