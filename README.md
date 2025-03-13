
![e5bd3a2f2cf2f6f4dad0f531b92564be-ezgif com-resize](https://github.com/user-attachments/assets/0804e1b3-108b-4f82-90b3-530fdad10da1)

# .・。.・゜Conexão com Banco de Dados com Padrão Singleton ・゜・。.

Este projeto implementa o **padrão Singleton** para gerenciar uma **conexão fictícia com um banco de dados**.
Ele simula o comportamento de uma conexão com o banco de dados, retornando uma mensagem `"Banco de dados conectado"` ao invés de estabelecer uma conexão real. 
O padrão Singleton é utilizado para garantir que haja apenas uma instância da conexão durante toda a execução do sistema.

꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷


## 📂 **Estrutura do Projeto**

```
src/main/java/
│── DatabaseConnection.java        # Classe para gerenciar a conexão fictícia com o banco
│── Empresa.java                   # Classe principal que simula o uso do banco e log
│── LogSistema.java                # Classe de log para armazenar e registrar resultados
│
src/test/java/
│── DatabaseConnectionTest.java    # Testes unitários para a classe DatabaseConnection
│── EmpresaTest.java               # Testes para a classe Empresa
│── LogSistemaTest.java            # Testes para a classe LogSistema
│
README.md                         # Documentação do projeto
```

꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷

## **Padrão Singleton no Projeto**

O **padrão Singleton** foi utilizado em **duas classes principais** do projeto:

1. **`DatabaseConnection`**: Gerencia a "conexão" fictícia com o banco de dados.
2. **`LogSistema`**: Registra e mantém os logs de resultados ou erros do sistema.

### 📝 **Como o Singleton foi aplicado:**

- **`DatabaseConnection`**: 
  - O método `getInstance()` é utilizado para garantir que a classe tenha apenas **uma instância** durante toda a execução do programa. A instância é **criada uma única vez** e reutilizada nas chamadas subsequentes.
  - O método `getConnection()` retorna uma mensagem que simula a conexão com o banco de dados, sem necessidade de utilizar um banco real.
  
- **`LogSistema`**: 
  - O método `getInstance()` assegura que os logs sejam mantidos em uma **única instância**, garantindo que os logs sejam centralizados e consistentes. 
  - O método `registrarErro()` permite o registro de mensagens de erro ou resultados, enquanto o `obterLogs()` permite acessar os logs registrados.

꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷

## **Funcionalidades do Sistema**

### **1. Classe `DatabaseConnection`**
- **Objetivo**: Simula a conexão com um banco de dados.
- **Métodos**:
  - **`getInstance()`**: Retorna a instância única da conexão, utilizando o padrão Singleton.
  - **`getConnection()`**: Retorna a mensagem `"Banco de dados conectado"`, simulando a resposta de uma conexão.

### **2. Classe `LogSistema`**
- **Objetivo**: Armazena logs de resultados ou erros.
- **Métodos**:
  - **`getInstance()`**: Retorna a instância única de `LogSistema` (Singleton).
  - **`registrarErro(String mensagem)`**: Registra uma mensagem de erro ou resultado no log.
  - **`obterLogs()`**: Retorna todos os logs registrados até o momento.

### **3. Classe `Empresa`**
- **Objetivo**: Simula o uso da conexão com o banco de dados e registra o resultado em logs.
- **Métodos**:
  - **`main(String[] args)`**: Executa a lógica do programa, onde duas instâncias de `DatabaseConnection` são verificadas, e o resultado da comparação é registrado no log.

꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷

## **Testes**

O projeto contém testes unitários para validar o comportamento das classes `DatabaseConnection`, `Empresa` e `LogSistema` utilizando o framework **JUnit 5**.

### **Testes para a Classe `DatabaseConnection`** (`DatabaseConnectionTest.java`)
Testes para garantir que o Singleton da `DatabaseConnection` funciona corretamente.

- **`testSingletonInstance()`**:
  - Verifica se **as instâncias de `DatabaseConnection`** são únicas. Ou seja, a mesma instância deve ser retornada sempre.
  - **Assertiva**: `assertSame()` para garantir que ambas as instâncias sejam a mesma.
  
- **`testConnectionStatus()`**:
  - Verifica se a **mensagem retornada pela conexão** é `"Banco de dados conectado"`.
  - **Assertiva**: `assertEquals()` para garantir que o status da conexão seja o esperado.

### **Testes para a Classe `Empresa`** (`EmpresaTest.java`)
Testes para garantir que a lógica da classe `Empresa` funciona corretamente.

- **`testMesmaConexao()`**:
  - Verifica se **as instâncias de `DatabaseConnection`** retornam a mesma conexão (fictícia).
  - **Assertiva**: `assertSame()` para garantir que a mesma string `"Banco de dados conectado"` seja retornada.
  
- **`testArmazenaResultadoNoLog()`**:
  - Verifica se o **resultado da comparação de conexões** é registrado corretamente no log.
  - **Assertiva**: `assertTrue()` para garantir que o log contenha o texto esperado.

### **Testes para a Classe `LogSistema`** (`LogSistemaTest.java`)
Testes para validar o funcionamento da classe `LogSistema`.

- **`testSingletonInstance()`**:
  - Verifica se a instância de `LogSistema` é única, assim como na classe `DatabaseConnection`.
  - **Assertiva**: `assertSame()` para garantir que todas as instâncias sejam iguais.
  
- **`testLogRegistro()`**:
  - Verifica se **mensagens de log** são corretamente registradas e podem ser recuperadas.
  - **Assertiva**: `assertTrue()` para garantir que as mensagens de log contêm o texto registrado.

꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷

## **Como Rodar o Projeto**

### Pré-requisitos
- Java 17 ou superior instalado
- Maven ou Gradle para gerenciar as dependências
- JUnit 5 para testes

### Passos

1. **Clone o repositório**:
    ```bash
    git clone https://seu-repositorio.git
    cd nome-do-projeto
    ```

2. **Compilar e Rodar o Projeto**:
    - Para compilar e rodar o projeto, basta executar o comando:
    ```bash
    mvn clean install
    mvn exec:java
    ```
    - Isso executará o método `main()` da classe `Empresa` e você verá a mensagem no log.

3. **Rodar os Testes**:
    - Para rodar os testes, execute o seguinte comando:
    ```bash
    mvn test
    ```

4. **Verificar os Resultados**:
    - Os resultados dos testes podem ser verificados no console. Caso algum teste falhe, ele será mostrado na saída.

꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷

## **Considerações Finais**

Este projeto demonstra a aplicação do padrão Singleton em um sistema simples e como ele pode ser utilizado para garantir a consistência da instância de objetos como conexões com banco de dados ou logs. O uso de testes unitários garante que o comportamento das classes esteja correto, validando a implementação de forma eficiente.

Sinta-se à vontade para modificar e expandir este projeto conforme necessário!

꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷꒦꒷꒦꒷꒦꒷꒦꒷꒦꒷꒷
