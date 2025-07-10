import api.ExchangeApiClient;
import util.ConsoleView;
import util.CurrencyConversionHistory;
import util.FileGenerater;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            FileGenerater fileGenerater = new FileGenerater();
            ExchangeApiClient api = new ExchangeApiClient();
            CurrencyConversionHistory history = new CurrencyConversionHistory();
            int escolha;

            while (true) {
                ConsoleView.mostrarMenu();
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1 -> ConsoleView.converterDinheiro();
                    case 2 -> ConsoleView.mostrarHistorico(history);
                    case 3 -> {
                        System.out.println("\n▷ Salvando histórico completo...");
                        fileGenerater.salvarArquivo(history.getAll());
                        ConsoleView.fimPrograma();
                    }
                    default -> {
                        System.out.println("\n❌ Entrada inválida. Digite um número de 1 a 3.";
                    }
                }
                ConsoleView.solicitarValor();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}