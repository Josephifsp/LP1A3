package br.edu.ifsp.aluno.api;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.edu.ifsp.aluno.model.RecipeResponse;

public class RandomRecipeApiTest {
    
    @Test
    void criaUmObjetoRandomRecipeApi() {
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RandomRecipeApi(apiKey);
        Assertions.assertNotNull(api);
    }

    @Test
    void listaReceitasAleatorias() throws IOException, InterruptedException {
        var apiKey = "a0ea881b1e034e389c4ba04c9f852f51";
        var api = new RandomRecipeApi(apiKey);
        RecipeResponse response = api.listarReceitasAleatorias(5);

        Assertions.assertFalse(response.getRecipes().isEmpty());
    }
}
