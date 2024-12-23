# Validador de CPF

### 🚀 Descrição

Este projeto em **Java** valida CPF (Cadastro de Pessoa Física). Ele verifica se o CPF inserido está no formato correto e se a sequência de números corresponde a um CPF real, conforme os cálculos dos dois últimos dígitos de verificação.

---

## 📋 Funcionalidades

O programa oferece as seguintes funcionalidades:

- **Validação de CPF**: Verifica se o CPF está no formato correto e calcula os dois últimos dígitos de verificação com base nos primeiros 9 dígitos.
- **Remoção de caracteres não numéricos**: Ignora caracteres não numéricos, como pontos e traços.
- **Verificação de números repetidos**: Evita CPFs compostos por uma sequência repetitiva de números (exemplo: `111.111.111-11`).

---

## 🔧 Como Usar

### ✅ Pré-requisitos

Antes de rodar o programa, você precisa ter o **Java** instalado em seu computador. Verifique a versão do Java com o comando:

java -version


### 📥 Passos para Executar
Clone o repositório:

Clone o repositório para sua máquina local com o comando:
git clone https://github.com/DomenicoHorsay/ValidadorCPF.git

Navegue até o diretório do projeto:

Após clonar o repositório, entre no diretório do projeto:
cd ValidadorCPF

Compile o código:

Use o comando javac para compilar o código:
javac ValidadorCPF.java

Execute o programa:

Após compilar, execute o programa com:
java ValidadorCPF

O programa solicitará o CPF no formato XXX.XXX.XXX-XX e validará se o CPF inserido é válido ou inválido.

### 🖥️ Exemplo de Uso

Entrada: Digite o CPF (formato XXX.XXX.XXX-XX): 123.456.789-09

Saída: CPF inválido.

Se o CPF for válido, a saída será:

Entrada: Digite o CPF (formato XXX.XXX.XXX-XX): 123.456.789-00

Saída: CPF válido.

### 🔍 Explicação do Código

O código realiza a validação do CPF seguindo as etapas abaixo:

Formatação do CPF 
O CPF inserido é tratado para remover caracteres não numéricos usando a expressão regular:

cpf.replaceAll("[^0-9]", "");

Verificação do Comprimento

O CPF deve ter exatamente 11 caracteres. Se o comprimento for diferente, o CPF é considerado inválido.

Verificação de Sequência Repetitiva

Não são permitidos CPFs formados por sequências repetitivas de números, como 111.111.111-11.

Cálculos dos Dígitos de Verificação

Os dois últimos dígitos são calculados com base nos 9 primeiros dígitos e um conjunto de pesos predefinidos. A fórmula para o cálculo de cada dígito é a seguinte:

Primeiro dígito: A soma dos 9 primeiros dígitos multiplicados pelos pesos [10, 9, 8, 7, 6, 5, 4, 3, 2]. O resultado da soma é dividido por 11 e, dependendo do restante, o dígito será 0 ou 11 menos o restante.

Segundo dígito: A soma dos 9 primeiros dígitos multiplicados pelos pesos [11, 10, 9, 8, 7, 6, 5, 4, 3, 2], mais o primeiro dígito de verificação multiplicado por 2.

Se os dois últimos dígitos calculados coincidirem com os fornecidos no CPF, o CPF é válido.

Resultado Final
O programa retorna true se o CPF for válido e false caso contrário.

### 📬 Contato

Caso tenha dúvidas ou sugestões, entre em contato com o autor:

GitHub: @DomenicoHorsay
Email: domenicoerick@hotmail.com
Linkedin: DomenicoHorsay



