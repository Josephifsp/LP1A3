Uma API desenvolvida para o fornecimento de dados sobre comidas e receitas.
Projeto de SDK:
O projeto contém a manipulação de um endpoint: a obtenção de receitas aleatórias a cada
requisição.
O endpoint manipulado engloba: Os modelos de objetos (models), a requisição para a API
e a classe de teste (Test)
Arquivos importantes do SDK:

"RandomRecipeApi.java": classe que faz a requisição para a API (caminho: "spoonacular-
sdk/lib/src/main/java/br/edu/ifsp/aluno/api")

"Ingridient.java": classe de modelo de dados para ingredientes (caminho: "spoonacular-
sdk/lib/src/main/java/br/edu/ifsp/aluno/model")

"Recipe.java": classe de modelo de dados para receitas (caminho: "spoonacular-
sdk/lib/src/main/java/br/edu/ifsp/aluno/model")

"RecipeResponse.java": classe de modelo de dados para o objeto tipo lista de Recipe
(caminho: "spoonacular-sdk/lib/src/main/java/br/edu/ifsp/aluno/model")
"RandoRecipeApiTest.java": classe que faz o teste dos métodos em

"RandomRecipeApi.java" (caminho: "spoonacular-
sdk/lib/src/test/java/br/edu/ifsp/aluno/api")

build.gradle
Esse arquivo possui as duas dependências adicionadas no projeto para a manipulação da API:
implementation 'com.fasterxml.jackson.core:jackson-core:2.13.0'
implementation 'com.fasterxml.jackson.core:jackson-databind:2.13.0'
