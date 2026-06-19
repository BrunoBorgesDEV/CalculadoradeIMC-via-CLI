import java.util.Scanner;

public class Main {

    public static double lerDouble(Scanner sc, String campo) {
        try {
            double valor = sc.nextDouble();
            if (valor <= 0) {
                throw new EntradaInvalidaException(campo + " deve ser positivo!");
            }
            return valor;
        } catch (java.util.InputMismatchException e) {
            sc.nextLine();
            throw new EntradaInvalidaException("Digite apenas números para " + campo);
        }
    }

    public static int lerInt(Scanner sc, String campo) {
        try {
            int valor = sc.nextInt();
            if (valor <= 0) {
                throw new EntradaInvalidaException(campo + " deve ser maior que zero!");
            }
            return valor;
        } catch (java.util.InputMismatchException e) {
            sc.nextLine();
            throw new EntradaInvalidaException("Digite apenas números inteiros para " + campo);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaIMC sistema = new SistemaIMC();
        int opcao = -1;

        do {
            try {
                System.out.println("\n=== MENU SISTEMA IMC ===");
                System.out.println("[1] Cadastrar Pessoa comum");
                System.out.println("[2] Cadastrar Atleta");
                System.out.println("[3] Calcular e exibir IMC da última pessoa cadastrada");
                System.out.println("[4] Exibir histórico de cálculos");
                System.out.println("[0] Encerrar o sistema");
                System.out.print("Escolha uma opção: ");

                if (!scanner.hasNextInt()) {
                    scanner.nextLine();
                    throw new EntradaInvalidaException("Opção inválida! Digite um dos números do menu.");
                }
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nomeP = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idadeP = lerInt(scanner, "idade");
                        System.out.print("Peso (kg): ");
                        double pesoP = lerDouble(scanner, "peso");
                        System.out.print("Altura (m): ");
                        double alturaP = lerDouble(scanner, "altura");

                        Pessoa novaPessoa = new Pessoa(nomeP, idadeP, pesoP, alturaP);

                        System.out.print("Resultado do processamento: ");
                        sistema.processar(novaPessoa);
                        break;

                    case 2:
                        System.out.print("Nome do Atleta: ");
                        String nomeA = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idadeA = lerInt(scanner, "idade");
                        System.out.print("Peso (kg): ");
                        double pesoA = lerDouble(scanner, "peso");
                        System.out.print("Altura (m): ");
                        double alturaA = lerDouble(scanner, "altura");
                        scanner.nextLine();
                        System.out.print("Modalidade: ");
                        String modalidade = scanner.nextLine();

                        Atleta novoAtleta = new Atleta(nomeA, idadeA, pesoA, alturaA, modalidade);


                        System.out.print("Resultado do processamento: ");
                        sistema.processar(novoAtleta);
                        break;

                    case 3:
                        sistema.calcularExibirUltimoIMC();
                        break;

                    case 4:
                        sistema.exibirHistorico();
                        break;

                    case 0:
                        System.out.println("Sistema encerrado. Bons treinos!");
                        break;

                    default:
                        throw new EntradaInvalidaException("Opção inválida no menu!");
                }

            } catch (EntradaInvalidaException e) {
                System.out.println("\n[ERRO] " + e.getMessage());
            }
        } while (opcao != 0);

        scanner.close();
    }
}