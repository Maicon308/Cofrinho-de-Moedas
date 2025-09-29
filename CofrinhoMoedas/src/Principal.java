import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;

        do {
            System.out.println("\nCOFRINHO:");
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Remover Moeda");
            System.out.println("3. Listar Moedas");
            System.out.println("4. Calcular Total convertido para Real");
            System.out.println("0. Encerrar");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Escolha o tipo de moeda \n1. Real: \n2. Dolar: \n3. Euro: \n");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();

                    switch (tipoMoeda) {
                        case 1:
                            cofrinho.adicionar(new Real(valor));
                            break;
                        case 2:
                            cofrinho.adicionar(new Dolar(valor));
                            break;
                        case 3:
                            cofrinho.adicionar(new Euro(valor));
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Escolha o tipo de moeda \n1. Real: \n2. Dolar: \n3. Euro: \n");
                    tipoMoeda = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    valor = scanner.nextDouble();

                    Moeda moedaParaRemover = null;
                    for (Moeda moeda : cofrinho.getListaMoedas()) {
                        if ((tipoMoeda == 1 && moeda instanceof Real && moeda.valor == valor) ||
                                (tipoMoeda == 2 && moeda instanceof Dolar && moeda.valor == valor) ||
                                (tipoMoeda == 3 && moeda instanceof Euro && moeda.valor == valor)) {
                            moedaParaRemover = moeda;
                            break;
                        }
                    }

                    if (moedaParaRemover != null) {
                        cofrinho.remover(moedaParaRemover);
                        System.out.println("Moeda removida com sucesso.");
                    } else {
                        System.out.println("Moeda não encontrada.");
                    }
                    break;
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    double totalEmReal = cofrinho.totalConvertido();
                    System.out.println("Total no cofrinho convertido para Real: R$ " + totalEmReal);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
