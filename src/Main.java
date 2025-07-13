import api.ExchangeApiClient;
import exception.ApiException;
import service.CurrencyService;
import util.ConsoleView;
import util.CurrencyConversionHistory;
import util.FileGenerater;
import model.Currency;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            CurrencyService currencyService = new CurrencyService();
            FileGenerater fileGenerater = new FileGenerater();
            ExchangeApiClient api = new ExchangeApiClient();
            CurrencyConversionHistory history = new CurrencyConversionHistory();
            int escolha;
            String base_target;

            while (true) {
                ConsoleView.mostrarMenu();
                escolha = scanner.nextInt();

                String base;
                String target;
                switch (escolha) {
                    case 1 -> {
                        base_target = ConsoleView.converterDinheiro();

                        String[] partes = base_target.split(" ");

                        base = partes[0];
                        target = partes[1];

                        ConsoleView.solicitarValor();
                        if (!scanner.hasNextDouble()) {
                            System.out.println("Por favor, digite um valor numérico válido");
                            scanner.next();
                            continue;
                        }

                        double amount = scanner.nextDouble();
                        System.out.println("\n▷ Consultando taxas de conversão...");
                        Currency response = api.buscarMoedas(base, target);
                        double rate = response.conversion_rate();
                        double convertedAmount = currencyService.convert(amount, rate);

                        ConsoleView.resultadoConversao(base, target, amount, convertedAmount);
                        history.addHistory(response);
                    }
                    case 2 -> ConsoleView.mostrarHistorico(history);
                    case 3 -> {
                        System.out.println("\n▷ Salvando histórico completo...");
                        fileGenerater.salvarArquivo(history.getAll());
                        ConsoleView.fimPrograma();
                    }
                    default -> System.out.println("\n❌ Entrada inválida. Digite um número de 1 a 3.");
                }
            }
        } catch (IOException e) {
            System.out.println("Opss... Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ApiException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}