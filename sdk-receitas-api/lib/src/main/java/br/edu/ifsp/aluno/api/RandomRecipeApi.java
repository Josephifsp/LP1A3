package br.edu.ifsp.aluno.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.ifsp.aluno.model.RecipeResponse;

public class RandomRecipeApi {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public RandomRecipeApi(String apiKey) {
        this.apiKey = apiKey;
        this.API_URL = "https://api.spoonacular.com/recipes/random?apiKey=" + this.apiKey;
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    public RecipeResponse listarReceitasAleatorias(int quantidadeReceitas) throws IOException, InterruptedException {
        URI uri = URI.create(API_URL + "&number=" + quantidadeReceitas);

        HttpRequest request = generateRequest(uri);

        HttpResponse<String> response = getResponse(request);

        return mapper.readValue(response.body(), RecipeResponse.class);
    }

    private HttpRequest generateRequest(URI uri) {
        return HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .header("Content-Type", "application/json")
        .build();
    }

    private HttpResponse<String> getResponse(HttpRequest request) throws IOException, InterruptedException {
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

}
