import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class QueryConversor {
    String apiKey = "b703e1926646b0c28e9b1659";
    URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(url).build();



}
