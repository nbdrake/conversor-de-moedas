import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCotacao {
    public Moeda buscaCotacao(String base, String alvo){

        URI url = URI.create("https://v6.exchangerate-api.com/v6/047ae963ace0a9aa5ace6381/pair/" + base + "/" + alvo);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter a cotação da moeda informada!");
        }
    }
}
