Projeto de API para Empresa de Brinquedos

Este projeto é uma API desenvolvida em Spring Boot para uma empresa de brinquedos de crianças até 12 anos. A API permite operações básicas de CRUD (Create, Read) em uma tabela de brinquedos em um banco de dados Oracle.

Pré-requisitos
Antes de executar o projeto, certifique-se de ter o seguinte instalado em sua máquina:

JDK (Java Development Kit) 8 ou superior
Maven
Banco de dados Oracle configurado e acessível
Configuração do Banco de Dados

Para configurar o acesso ao banco de dados Oracle, edite o arquivo application.properties localizado em src/main/resources e adicione as seguintes propriedades:

spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/SID
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.hibernate.ddl-auto=update

Substitua seu_usuario e sua_senha pelas credenciais do seu banco de dados Oracle e SID pelo nome do seu serviço Oracle.

Executando o Projeto
Você pode executar o projeto utilizando o Maven. Na linha de comando, navegue até o diretório raiz do projeto e execute o seguinte comando:

mvn spring-boot:run
Isso iniciará o servidor Tomcat embutido e implantará a aplicação.

Testando os Endpoints

Após iniciar a aplicação, você pode testar os endpoints utilizando o Postman ou qualquer outra ferramenta de teste de API. Aqui estão os endpoints disponíveis:

GET /brinquedos: Lista todos os brinquedos.
GET /brinquedos/{id}: Retorna um brinquedo específico pelo ID.
POST /brinquedos: Cria um novo brinquedo.

Contribuição

Sinta-se à vontade para contribuir com melhorias para este projeto. Basta fazer um fork do repositório, implementar as alterações e enviar um pull request.

Espero que isso ajude! Se tiver mais alguma dúvida ou precisar de mais alguma informação, estou à disposição para ajudar.