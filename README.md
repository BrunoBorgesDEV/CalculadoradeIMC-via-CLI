SISTEMATIZAÇÃO_CALCULADORADEIMC - BrunoBorgesDeSouza - 72601484

# Calculadora IMC

## Descrição

Projeto desenvolvido em Java para cálculo do Índice de Massa Corporal (IMC).
O sistema permite cadastrar pessoas comuns e atletas, calcular e classificar o IMC, armazenar o histórico de cálculos realizados e demonstrar conceitos de Programação Orientada a Objetos, como herança, polimorfismo, composição, tratamento de exceções e recursão.

---

## Pré-requisitos

Para executar o projeto é necessário possuir:

- Java JDK 17 ou superior
- Maven 3.8 ou superior

Verificar versões:

```bash
java -version
mvn -version
```

---

## Como Compilar

Na raiz do projeto execute:

```bash
mvn clean package
```

O Maven irá compilar o projeto e gerar o arquivo executável na pasta:

```text
target/
```

---

## Como Executar

Após a compilação:

```bash
java -jar target/calculadora-imc-1.0.0.jar
```

---

## Demonstração de Uso

Exemplo de execução:

```text
=== MENU SISTEMA IMC ===

[1] Cadastrar Pessoa comum
[2] Cadastrar Atleta
[3] Calcular e exibir IMC da última pessoa cadastrada
[4] Exibir histórico de cálculos
[0] Encerrar o sistema

Escolha uma opção: 2

Nome do Atleta: João
Idade: 25
Peso (kg): 80
Altura (m): 1.80
Modalidade: Futebol

Resultado do processamento:
João -> IMC: 24.69 (Ideal para um atleta)
```

---

## Estrutura do Projeto

### PessoaBase.java
Classe base contendo atributos e comportamentos comuns.

### Pessoa.java
Herda de PessoaBase e implementa o cálculo e classificação padrão do IMC.

### Atleta.java
Herda de Pessoa e sobrescreve métodos para classificação específica de atletas.

### Historico.java
Responsável por armazenar e exibir os registros de cálculos realizados.

### SistemaIMC.java
Coordena o funcionamento do sistema e utiliza composição com a classe Historico.

### CalculadoraRecursiva.java
Implementa métodos estáticos, incluindo cálculo de potência usando recursão.

### EntradaInvalidaException.java
Exceção personalizada utilizada para tratamento de entradas inválidas.

### Main.java
Ponto de entrada da aplicação e menu interativo.

### pom.xml
Configuração Maven e gerenciamento de dependências.

---

## Conceitos Aplicados

O projeto foi desenvolvido para praticar conceitos fundamentais de Programação Orientada a Objetos. A herança é utilizada através da hierarquia PessoaBase → Pessoa → Atleta. O polimorfismo é demonstrado pela sobrescrita do método de classificação do IMC na classe Atleta. A composição é aplicada na classe SistemaIMC, que possui um objeto Historico responsável pelo armazenamento dos registros. O tratamento de exceções é realizado por meio da exceção personalizada EntradaInvalidaException. Além disso, o projeto utiliza recursão na classe CalculadoraRecursiva para implementação do cálculo de potência utilizado na fórmula do IMC.
