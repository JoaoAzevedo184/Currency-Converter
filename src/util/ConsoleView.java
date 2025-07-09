package util;

import model.Currency;

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
                        CONVERSOR DE DINHEIRO
            *********************************************/
            
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
    public static void mostrarMenu(){
        System.out.print(MENU);
    }
    public static void solicitarValor(){
        System.out.println("\n➤ Digite o valor a ser convertido:");
        System.out.print("  $ ");
    }
    public static void salvarHistotico(){
        System.out.print(HISTORICO_SALVO);
        System.out.println("\n➤ Deseja finalizar o programa? ");
        System.out.println("  $ SIM ");
        System.out.println("  $ NÃO ");

    }
    public static void resultadoConversao(String base, String target, double amount, double convertedAmount){
        System.out.print(RESULTADO);
        System.out.printf("  %.2f %s = %.2f %s%n", amount, base, convertedAmount, target);
        System.out.println("\n**********************************************");
    }
    public static void fimPrograma(){
        System.out.print(FIM);
    }

    public static void mostrarHistorico(CurrencyConversionHistory history){
        if(history.getAll().isEmpty()){
            System.out.println("\n>> Histórico vazio. Faça sua primeira conversão!");
        }else {
            System.out.print(HISTORICO);
            for (Currency item : history.getAll()){
                System.out.printf(
                        " ⮞ %s → %s: %.4f%n", item.baseCode(), item.targetCode(), item.conversionRate());
            }
            System.out.println("\n**********************************************");
        }

    }
}
