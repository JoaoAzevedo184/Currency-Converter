package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Currency;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileGenerater {
    public void salvarArquivo(List<Currency> currency) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter("history.json");
        fileWriter.write(gson.toJson(currency));
        fileWriter.close();
    }
}
