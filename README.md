# 🪙 Conversor de Moedas - Challenge ONE Back End

![Alura + Oracle](https://img.shields.io/badge/Alura%20%2B%20Oracle-Challenge%20Back%20End%20ONE-blue)
![Java](https://img.shields.io/badge/Java-21-orange)
![Status](https://img.shields.io/badge/Status-Concluído-success)

## 📋 Sobre o Projeto

Este é um conversor de moedas desenvolvido como parte do desafio **Oracle Next Education (ONE)** em parceria com a **Alura**. O projeto permite realizar conversões entre diferentes moedas utilizando taxas de câmbio em tempo real através da API ExchangeRate, visualizar o histórico das operações e exportar esse histórico para um arquivo JSON.

Um diferencial deste projeto é sua interface de console visualmente atraente, que utiliza caracteres Unicode para criar bordas estilizadas e emojis para melhorar a experiência do usuário, tornando a aplicação mais intuitiva e agradável de usar, mesmo sendo uma aplicação de terminal.

## ✨ Funcionalidades

### **Principais funcionalidades:**

1. **Múltiplas conversões entre moedas:**
   - Suporte para 6 moedas diferentes: Dólar (USD), Euro (EUR), Real (BRL), Libra (GBP), Iene (JPY) e Peso Argentino (ARS)
   - Possibilidade de converter entre quaisquer pares de moedas

2. **Histórico completo de conversões** <br>
3. **Exportação do histórico para arquivo JSON** <br>
4. **Interface de console intuitiva e amigável** <br>
   - Design visual com bordas estilizadas e elementos gráficos
   - Uso de emojis para melhorar a experiência do usuário
   - Mensagens claras e bem formatadas <br>
5. **Taxas de câmbio atualizadas em tempo real**

## 🛠️ Tecnologias Utilizadas

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white)
![API REST](https://img.shields.io/badge/API%20REST-0078D4?style=for-the-badge&logo=microsoftedge&logoColor=white)

</div>

- **Java 21** - Linguagem de programação principal
- **API ExchangeRate (v6)** - Fornecimento de taxas de câmbio atualizadas
- **Biblioteca Gson** - Manipulação de dados em formato JSON
- **HttpClient do Java** - Realização de requisições HTTP para API
- **Caracteres Unicode** - Criação de interfaces visuais com bordas e símbolos
- **Emojis Unicode** - Aprimoramento da experiência do usuário

## 📊 Exemplo de Uso

```
[************************************************]
                  MENU                       
[************************************************]
*  1. 💱 CONVERTER DINHEIRO                    *
*  2. 📋 HISTÓRICO DE CONVERSÕES               *
*  3. 🚪 FINALIZAR APLICAÇÃO                   *
[************************************************]

Digite sua opção: 1

[**********************************************]
          💱 CONVERSOR DE MOEDAS           
[**********************************************]

[**********************************************]
         1. SELECIONE A MOEDA BASE        
[**********************************************]
▷  1. 💵 Dólar (USD)    
▷  2. 💶 Euro (EUR)     
▷  3. 💰 Real (BRL)     
▷  4. 💷 Libra (GBP)    
▷  5. 💴 Iene (JPY)     
▷  6. 💸 Peso Argentino (ARS)       
[**********************************************]

Digite sua opção: 1

[**********************************************]
         2. SELECIONE A MOEDA ALVO        
[**********************************************]
▷  1. 💵 Dólar (USD)    
▷  2. 💶 Euro (EUR)     
▷  3. 💰 Real (BRL)     
▷  4. 💷 Libra (GBP)    
▷  5. 💴 Iene (JPY)     
▷  6. 💸 Peso Argentino (ARS)       
[**********************************************]

Digite sua opção: 3

[**********************************************]
  💲 Digite o valor a ser convertido:        
  $ 100

Consultando taxas de conversão...

[**********************************************]
           ✅ RESULTADO DA CONVERSÃO         
[**********************************************]
  100.00 USD = 557.32 BRL
[**********************************************]
```

## 🔄 API ExchangeRate

O projeto utiliza a API ExchangeRate (v6) para obter taxas de câmbio atualizadas em tempo real.

- **Documentação**: [https://www.exchangerate-api.com/docs/pair-conversion-requests](https://www.exchangerate-api.com/docs/pair-conversion-requests)
- **Endpoint utilizado**: `https://v6.exchangerate-api.com/v6/API_KEY/pair/BASE/TARGET`
- **Funcionalidades utilizadas**: Conversão direta entre pares de moedas

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/Currency-Converter.git
   cd Currency-Converter
   ```

2. Compile o projeto (certifique-se de ter o JDK 21 instalado):
   ```bash
   javac -d out src/**/*.java
   ```

3. Execute a aplicação:
   ```bash
   java -cp out Main
   ```

4. Siga as instruções na interface do console para realizar conversões de moedas.

> **Nota**: Para utilizar a API ExchangeRate, você precisará obter uma chave de API gratuita em [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/) e configurá-la no código.

## 📂 Estrutura do Projeto

```
src/
├── Main.java                           # Classe principal com o método main
├── api/
│   └── ExchangeApiClient.java          # Cliente para comunicação com a API ExchangeRate
├── exception/
│   └── ApiException.java               # Classe de exceção personalizada para erros da API
├── model/
│   └── Currency.java                   # Modelo de dados para armazenar informações de moeda e taxas
├── service/
│   └── CurrencyService.java            # Serviço para realizar cálculos de conversão
└── util/
    ├── ConsoleView.java                # Interface de usuário no console
    ├── CurrencyConversionHistory.java  # Gerenciamento do histórico de conversões
    └── FileGenerater.java              # Geração de arquivos para exportação do histórico
```

## 🙏 Agradecimentos

**Oracle e Alura** pelo programa ONE e pelo desafio proposto

## 👤 Autor
  
---  
Desenvolvido por João Azevedo. Para mais informações, entre em contato:
- **Gmail**: jonoffice37@gmail.com
- **Linkedin**: www.linkedin.com/in/joao-victor-azevedo-181-sena
- **Github**: https://github.com/JoaoAzevedo184