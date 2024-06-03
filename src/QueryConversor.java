import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class QueryConversor {
    ConversorMoney searchPair(String inPair, String outPair, double money) {
        String apiKey = "b703e1926646b0c28e9b1659";
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + inPair + "/" + outPair + "/" + money);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();

        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), ConversorMoney.class);
    }
}
