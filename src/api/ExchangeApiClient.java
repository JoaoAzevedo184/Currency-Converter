package api;

import com.google.gson.Gson;
import exception.ApiException;
import model.Currency;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeApiClient {
    //https://v6.exchangerate-api.com/v6/API_KEY/pair/BASE/TARGET
    private static final String API_KEY = "49022ed1be6feef29bf2218c";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";

    public Currency buscarMoedas(String baseCode, String targetCode){
        String url = BASE_URL + baseCode + "/" + targetCode;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try{
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (ApiException | IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar taxa de câmbio: " + e.getMessage());
        }
    }
}
