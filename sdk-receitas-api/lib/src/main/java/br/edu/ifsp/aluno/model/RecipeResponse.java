package br.edu.ifsp.aluno.model;

import java.util.List;

public class RecipeResponse {
    private List<Recipe> recipes;

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return "RecipeResponse [recipes=" + recipes + "]";
    }
    
}
