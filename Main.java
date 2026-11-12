import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jogo> jogos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n========BIBLIOTECA DE JOGOS=========");
            System.out.println("1 - Cadastrar Jogo");
            System.out.println("2 - Listar todos os jogos");
            System.out.println("3 - Buscar jogo pelo nome");
            System.out.println("4 - Calcular valor total dos jogos");
            System.out.println("5 - Mostrar jogos gratuitos");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Nome do Jogo: ");
                    String nome = sc.nextLine();

                    System.out.println("Gênero do Jogo: ");
                    String genero = sc.nextLine();

                    System.out.println("Preço do Jogo: ");
                    double preco = sc.nextDouble();
                    jogos.add(new Jogo(nome, genero, preco));
                    System.out.println("Jogo cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.println("==========JOGOS CADASTRADOS==========");
                    for (Jogo j : jogos) {
                        System.out.println(j.exibirInformacoes());
                    }
                }
                case 3 -> {
                    System.out.println("Nome do Jogo: ");
                    String busca = sc.nextLine();
                    boolean encontrado = false;
                    for (Jogo j : jogos) {
                        if (j.getNome().equalsIgnoreCase(busca)) {
                            encontrado = true;
                            System.out.println(j.exibirInformacoes());
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Jogo não encontrado!");
                    }

                }
                case 4 -> {
                    double total = 0;

                    for (Jogo j : jogos) {
                        total += j.getPreco();
                    }
                    System.out.printf("Valor Total: R$ %.2f.", total);
                }
                case 5 -> {
                    System.out.println("==========JOGOS GRATUITOS==========");
                    boolean gratuito = false;
                    for (Jogo j : jogos) {
                        if (j.getPreco() == 0) {
                            System.out.println(j.exibirInformacoes());
                            gratuito = true;
                        }
                    }
                    if (!gratuito) {
                        System.out.println("Nenhum jogo gratuito!");
                    }

                }
                case 0 -> {
                    System.out.println("Encerrando o sistema...");
                }
                default ->
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

    }
}
