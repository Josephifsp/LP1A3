package br.edu.ifsp.aluno.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
    private int id;
    private String title;
    private int readyInMinutes;
    private boolean vegetarian;
    private boolean vegan;
    private int healthScore;
    @JsonProperty("extendedIngridients")
    private List<Ingridient> ingridients;
    private String instructions;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getReadyInMinutes() {
        return readyInMinutes;
    }
    
    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
    
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    
    public boolean isVegan() {
        return vegan;
    }
    
    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
    
    public int getHealthScore() {
        return healthScore;
    }
    
    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }
    
    public List<Ingridient> getIngridients() {
        return ingridients;
    }
    
    public void setIngridients(List<Ingridient> ingridients) {
        this.ingridients = ingridients;
    }
    
    public String getInstructions() {
        return instructions;
    }
    
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe [id=" + id + ", title=" + title + ", readyInMinutes=" + readyInMinutes + ", vegetarian="
                + vegetarian + ", vegan=" + vegan + ", healthScore=" + healthScore + ", ingridients=" + ingridients
                + ", instructions=" + instructions + "]";
    }

}
