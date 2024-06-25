import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public ConversionRate buscaMoeda (String baseCode, String targetCode) throws IOException, InterruptedException {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/4f8efb26d2ac1abd448e14d1/pair/" + baseCode + "/" + targetCode);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), ConversionRate.class);
    }
}
