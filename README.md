# 📦 Sistema de Gerenciamento de Estoque

Este é um projeto simples em **Java** que implementa um **sistema de gerenciamento de estoque** via console.  
O programa permite ao usuário realizar operações **CRUD** (Criar, Ler, Atualizar e Remover) em uma lista de produtos.

---

## ⚙️ Funcionalidades

O sistema apresenta um menu interativo no console com as seguintes opções:

1. 🟢 **Adicionar Produto** — Permite cadastrar um novo produto no estoque.  
   O sistema solicita **ID**, **nome**, **quantidade** e **preço**, garantindo que o ID não seja duplicado.

2. 🔴 **Remover Produto** — Exclui um produto do estoque com base no **ID** informado.

3. 🟡 **Atualizar Produto** — Atualiza as informações de um produto existente (nome, quantidade ou preço) com base no **ID**.

4. 📋 **Listar Produtos** — Exibe todos os produtos atualmente cadastrados no estoque, mostrando seus detalhes formatados.

5. 🚪 **Sair** — Encerra a aplicação de forma segura.

---

## 🧱 Estrutura do Código

O projeto está contido em um único arquivo: `Exercicio10.java`, que inclui **duas classes principais**:

### 🔹 `Produto`
Classe modelo (**POJO**) responsável por armazenar os dados de cada produto:
- `id` — Identificador único do produto  
- `nome` — Nome do produto  
- `quantidade` — Quantidade em estoque  
- `preco` — Valor unitário do produto  

Inclui **métodos getters, setters** e o método `exibirProduto()` para mostrar as informações formatadas no console.

### 🔹 `Exercicio10`
Classe principal que contém:
- O método `main`, que executa o **loop do menu principal**.  
- Um `ArrayList<Produto>` estático chamado `estoque`, usado para armazenar os produtos em memória.  
- Métodos auxiliares para cada operação do sistema:  
  - `adicionarProduto()`  
  - `removerProduto()`  
  - `atualizarProduto()`  
  - `listarProdutos()`

---

## 🧰 Tecnologias Utilizadas

- ☕ **Java**
- 📚 **Java Standard Library:**
  - `java.util.ArrayList` — Estrutura dinâmica de armazenamento dos produtos.
  - `java.util.Scanner` — Captura de entrada do usuário via console.

---

## Como Executar

Para rodar este projeto, você precisa ter o **JDK (Java Development Kit)** instalado em sua máquina.

1.  **Clone o repositório** (ou salve o arquivo `Exercicio10.java` em um diretório).

2.  **Abra o seu terminal** ou prompt de comando.

3.  **Navegue até o diretório** onde o arquivo está salvo.
    ```bash
    cd /caminho/para/o/projeto
    ```

4.  **Compile o arquivo Java:**
    ```bash
    javac Exercicio10.java
    ```
    Isso criará um arquivo `Exercicio10.class` e `Produto.class`.

5.  **Execute o programa:**
    ```bash
    java Exercicio10
    ```

6.  O menu do sistema será exibido no console, e você poderá interagir com ele.
