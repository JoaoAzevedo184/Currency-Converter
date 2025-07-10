package util;

import model.Currency;

import java.util.Scanner;

public class ConsoleView {
    private static final String MENU = """
            
            /*********************************************
                                MENU
            *********************************************/
                ➤ 1.CONVERTER DINHEIRO
                ➤ 2.HISTÓRICO DE CONVERSÕES
                ➤ 3.FINALIZAR APLICAÇÃO
            **********************************************
            
            """;
    private static final String CONVERSOR = """
            
            /*********************************************
                        💱 CONVERSOR DE DINHEIRO
            *********************************************/
            
            """;
    private static final String BASECODE = """
            
            /*********************************************
                        1. SELECIONE A MOEDA BASE
            *********************************************/
                ➤ 1.Dólar (USD)
                ➤ 2.Euro (EUR)
                ➤ 3.Real (BRL)
                ➤ 4.Libra (GBP)
                ➤ 5.Iene (JPY)
                ➤ 6.Peso Arg (ARS)
            
            """;
    private static final String TARGETCODE = """
            
            /*********************************************
                        2. SELECIONE A MOEDA ALVO
            *********************************************/
                ➤ 1.Dólar (USD)
                ➤ 2.Euro (EUR)
                ➤ 3.Real (BRL)
                ➤ 4.Libra (GBP)
                ➤ 5.Iene (JPY)
                ➤ 6.Peso Arg (ARS)
            
            """;
    private static final String HISTORICO = """
            
            /*********************************************
                         HISTÓRICO DE CONVERÇÕES
            *********************************************/
            
            """;
    private static final String RESULTADO = """
            
            /*********************************************
                         RESULTADO DA CONVERSÃO
            *********************************************/
            
            """;
    private static final String HISTORICO_SALVO = """
            
            /*********************************************
                   HISTÓRICO SALVO EM "history.json"
            *********************************************/
            
            """;
    private static final String FIM = """
            
            /*********************************************
                        OBRIGADO POR TER USADO
            *********************************************/
            
            """;

    public static void mostrarMenu() {
        System.out.print(MENU);
    }

    public static void solicitarValor() {
        System.out.println("\n➤ Digite o valor a ser convertido:");
        System.out.print("  $ ");
    }

    public static void salvarHistotico() {
        System.out.print(HISTORICO_SALVO);
    }

    public static void converterDinheiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(CONVERSOR);
        System.out.print(BASECODE);

        int escolha;
        String base = "";
        String target = "";

        while (base.isEmpty()) {
            escolha = scanner.nextInt();
            base = switch (escolha) {
                case 1 -> "USD";
                case 2 -> "EUR";
                case 3 -> "BRL";
                case 4 -> "GBP";
                case 5 -> "JPY";
                case 6 -> "ARS";
                default -> {
                    System.out.println("\n❌ Entrada inválida. Digite um número de 1 a 6.");
                    yield "";
                }
            };
        }

        System.out.print(TARGETCODE);

        while (target.isEmpty()) {
            escolha = scanner.nextInt();
            target = switch (escolha) {
                case 1 -> "USD";
                case 2 -> "EUR";
                case 3 -> "BRL";
                case 4 -> "GBP";
                case 5 -> "JPY";
                case 6 -> "ARS";
                default -> {
                    System.out.println("\n❌ Entrada inválida. Digite um número de 1 a 6.");
                    yield "";
                }
            };
        }
    }

    public static void resultadoConversao(String base, String target, double amount, double convertedAmount) {
        System.out.print(RESULTADO);
        System.out.printf("  %.2f %s = %.2f %s%n", amount, base, convertedAmount, target);
        System.out.println("\n**********************************************");
    }

    public static void fimPrograma() {
        System.out.print(FIM);
        System.exit(0);
    }

    public static void mostrarHistorico(CurrencyConversionHistory history) {
        if (history.getAll().isEmpty()) {
            System.out.println("\n>> Histórico vazio. Faça sua primeira conversão!");
        } else {
            System.out.print(HISTORICO);
            for (Currency item : history.getAll()) {
                System.out.printf(
                        " ⮞ %s → %s: %.4f%n", item.baseCode(), item.targetCode(), item.conversionRate());
            }
            System.out.println("\n**********************************************");
        }

    }
}
