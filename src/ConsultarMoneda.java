import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaTarget){
        URI direccion = URI.create("http://v6.exchangerate-api.com/v6/a519b45e35b5a17a8b95bec2/pair/"+monedaBase+"/"+monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpClient request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .sent(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body, Monedas.class);
        }catch (Exception e){
            throw new RuntimeException("No se encontro la moneda");
        }
    }
}
