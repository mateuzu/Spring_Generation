# Spring_Generation
Conceitos de API Rest utilizando Spring desenvolvido no Bloco 2 do Bootcamp Generation 


# Introdução ao Spring



Apesar de mais abstrato, o conceito de Back-end também é simples de entender: os dados publicados em uma rede social, como fotos e vídeos, por meio da interface do usuário precisam ser armazenados (persistidos) em algum local para poderem ser acessados posteriormente. Esse envio não é feito diretamente do Front-end para o Banco de dados da rede social. Ao invés disso, existe uma parte da aplicação que é responsável por receber essas informações, fazer operações específicas — postagens, filtros, exclusões, verificações de segurança e validações e somente após isso, armazenar no Banco de dados. Esse é o Back-end. Para isso utiliza linguagens de programação como o Java e o Framework Spring. Abaixo vemos uma imagem da Documentação de um Backend contendo todos os seus Recursos e respectivos Endpoints (funcionalidades).

O Spring Boot é um framework que simplifica o desenvolvimento de aplicativos Java, reduzindo a quantidade de código necessário e fornecendo uma configuração inicial padrão. Ele é uma ótima escolha para desenvolvedores que desejam criar aplicativos eficientes, escaláveis e fáceis de manter.

Na ilustração abaixo vemos o Front-end e o Back-end da aplicação funcionando de forma independente, se comunicando através da Internet, via requisições HTTP.

![](https://camo.githubusercontent.com/92dedb498ac3083b22148f790f32d783753c2713351539a4625c3dfe425d3635/68747470733a2f2f692e696d6775722e636f6d2f536e70694651722e706e67)

# SOFEA
Em termos simples, o SOFEA significa que as partes visual e funcional do aplicativo são mantidas separadas. O front-end é a parte que os usuários veem e interagem, como a interface gráfica, botões e formulários. Já o back-end é responsável pelo processamento das solicitações, manipulação de dados, lógica de negócios e comunicação com bancos de dados e outros sistemas.

A ideia por trás do SOFEA é permitir que o front-end e o back-end sejam desenvolvidos de forma independente um do outro. Isso significa que as equipes de desenvolvimento podem trabalhar em paralelo, concentrando-se em suas áreas de especialização.

Essa abordagem traz benefícios como a reutilização do back-end em diferentes interfaces de usuário (por exemplo, um aplicativo web e um aplicativo móvel), flexibilidade para atualizar ou modificar a interface sem afetar o back-end e melhor escalabilidade, pois o front-end pode ser distribuído em diferentes dispositivos e plataformas.

![](https://camo.githubusercontent.com/2d5422de021e586c70325c557d8a06830078b20792acfce493f1617e8b61280e/68747470733a2f2f692e696d6775722e636f6d2f37467a486c61652e706e67)

A arquitetura SOFEA é desenvolvida com o auxílio do SPA (Single Page Application). Na Primeira solicitação, todo o HTML , CSS e JavaScript é baixado e, em seguida, cada página solicitada é ligada com os dados que vêm com a ajuda de Requisições HTTP.

## Benefícios da Arquitetura SOFEA
- A camada de apresentação é desacoplada da camada de negócios, o que ajuda o aplicativo a obter uma resposta mais rápida.
- Executa em uma variedade de dispositivos.
- Muito bem suportado em ambiente de nuvem.
- Escalabilidade - o servidor tem menos trabalho a fazer; chega de geração de apresentação, apenas fornece serviços
- Melhor resposta do usuário - Baixa latência = usuários finais felizes - Após o download do aplicativo, nenhuma apresentação é transportada pela rede, apenas dados de negócios
- Ajuste natural em ambiente Cloud
- Modelo de programação organizado - Os desenvolvedores do cliente se concentram na Interface com o Usuário - os desenvolvedores do lado do servidor se concentram na lógica do negócio
- Aplicativos off-line - quando a rede falha, o cliente desacoplado pode alternar dinamicamente seus objetos de modelo
- Interoperabilidade - Integração mais fácil com menor sobrecarga de várias plataformas - Os clientes não se importam se os serviços são Java, C #, Python, ou uma combinação heterogênea

# API REST
API é um acrônimo que provém do inglês Application Programming Interface (Interface de Programação de Aplicações), que se trata de um conjunto de rotinas e padrões estabelecidos e documentados por uma determinada aplicação, para que outras aplicações consigam utilizar rodas as suas funcionalidades sem precisar conhecer os detalhes da implementação do software.

Desta forma, entendemos que as API’s permitem uma interoperabilidade entre aplicações. Em outras palavras, a comunicação entre aplicações e entre os usuários de uma API pode receber requisições de diversas aplicações distintas (Web, Mobile, Desktop e até mesmo de uma outra API).

![](https://camo.githubusercontent.com/299a11a7de7bd89af420a71ccd5f348a59514a971926a3d6402279dd7ebb36e7/68747470733a2f2f692e696d6775722e636f6d2f6243564b53516f2e706e67)

REST é um acrônimo que provém do inglês Representational State Transfer (Transferência de Estado Representacional), que criado no ano 2000 por Roy Fielding, em sua tese de doutorado, na qual ele descreve um design de arquitetura de software construído para servir aplicações em rede.

REST é uma arquitetura utilizada para integrar o Back-end com o Front-end, através do protocolo HTTP. Uma API Rest se comunica com o Front-end através do envio de Requests (Requisições) e do e recebimento de Responses (Respostas).

Estas Requests e Responses, são compostas por Objetos no formato JSON, em conjunto com os Métodos GET, POST, PUT e DELETE conforme vimos no modulo de Ciência da Computação.

![](https://camo.githubusercontent.com/2d503c9a607120ab01919a93a6af747196be1bd3b4cc310bb1b5401ffe2e8b15/68747470733a2f2f692e696d6775722e636f6d2f664b776f7335742e706e673f31)

# Diferenças entre API REST x RESTFUL
REST (representational state transfer) é como um guia de boas práticas. Uma vez que é um modelo de arquitetura de software que define uma série de requisitos para que as APIs sejam desenvolvidas, ou seja, é uma base para a construção de APIs que conecta os usuários com as aplicações em nuvem.

RESTful é a capacidade de um determinado sistema aplicar os principios REST

Os principais critérios para uma API ser RESTful são:
- Hipermídias (HATEOAS): Basicamente, sua API deve ser um livro aberto, você não deve precisar de acesso a documentação para saber que para adicionar um usuário no Banco de dadoas, precisará de uma requisição POST para http://locahots:8080/usuarios/cadastrar. Deve ser possível descobrir todas as manipulações de seus recursos através da própria API;
- Stateless: Significa que cada solicitação HTTP ocorre em isolamento completo. Quando o cliente faz uma Requisição HTTP, ele inclui todas as informações necessárias para o servidor atender à solicitação. O servidor nunca depende de informações de solicitações anteriores do cliente. Se alguma dessas informações for importante, o cliente a enviará como parte da solicitação atual;
- Cacheable: Mantém em cache as Respostas das últimas Requisições;
- Cliente-Servidor;
- Layered system: O Desenvolvimento da aplicação é distribuído em Camadas com funções pré-determinadas.

Modelo de Maturidade de Richardson para definir se uma API é Rest ou Restful:

![](https://camo.githubusercontent.com/c49f4b023c9efeb6e8bb20c2e21e4ff57e6bba05c842cec60bdcf10459a6e405/68747470733a2f2f692e696d6775722e636f6d2f6f7a4c746542482e706e67)
 

0. Uma API que não atenda nenhuma das regras
1. Recursos: A partir do momento em que seja possível fazer requisições de diferentes recursos em diferentes endpoints.
2. Verbos HTTP: Aqui, os diferentes Métodos HTTP são colocados em prática, em contraposição ao uso quase exclusivo do POST no protocolo SOAP. Além disso, cada verbo possui sua utilidade específica: PUT para atualizar, DELETE para excluir, GET para adquirir e POST para criar. Em alguns casos o PATCH também é utilizado.
3. Hypermedia: Os recursos passam a possuir links para recursos relacionados, além de links para realizar ações em cima dessas coleções, a partir desse ponto, a API se auto-documenta e possibilita a funcionalidade de descoberta.

## Formato JSON
JSON (JavaScript Object Notation) é um modelo para armazenamento e transmissão de informações no formato texto. Apesar de muito simples, tem sido bastante utilizado por aplicações Web devido a sua capacidade de estruturar informações de uma forma bem mais compacta do que o modelo XML, tornando mais rápido a interpretação dessas informações. Isto explica o fato de o JSON ter sido adotado por empresas como Google e Yahoo, cujas aplicações precisam transmitir grandes volumes de dados.

![](https://camo.githubusercontent.com/db9bbcb9a4c2c21253c9988361125a1a28e3d58b67ad50902df5a22bd3f8a26f/68747470733a2f2f692e696d6775722e636f6d2f726c35733865692e706e67)

A ideia utilizada pelo JSON para representar informações é tremendamente simples:para cada valor representado, atribui-se um nome (ou rótulo) que descreve o seu significado. Esta sintaxe é derivada da forma utilizada pelo JavaScript para representar informações.

# ARQUITETURA MVC
MVC é acrônimo de Model, View e Controller, é um padrão de arquitetura de software responsável por contribuir na otimização da velocidade entre as requisições feitas pelo comando dos usuários.

A arquitetura MVC é dividida em três componentes essenciais:

![](https://camo.githubusercontent.com/be39a71ba47c2cbf439a8ace42da825782a43fb9c78750b43398c4ecc9759f01/68747470733a2f2f692e696d6775722e636f6d2f436266774573512e706e67)

- Model (Modelo): Sua responsabilidade é gerenciar e controlar a forma como os dados se comportam por meio das funções, lógica e regras de negócios estabelecidas.

- Controller (Controladora): A camada de controle é responsável por intermediar as requisições enviadas pelo View com as respostas fornecidas pelo Model, processando os dados que o usuário informou e repassando para outras camadas.

- View (Visão): Essa camada é responsável por apresentar as informações de forma visual ao usuário. Em seu desenvolvimento devem ser aplicados apenas recursos ligados a aparência como mensagens, botões ou telas.

# Arquitetura de uma WEB API Spring
![](https://camo.githubusercontent.com/f2e7c37c784c5448b4bd474688cedffa72e58cb590879f4e42887b4228f94de0/68747470733a2f2f692e696d6775722e636f6d2f71474d394a6b7a2e706e67)

1. Controller
A primeira parte do sistema que interage com a Requisição HTTP enviada pelo cliente é a Camada de Controle (Controller). Ela define os Endpoints da API, ou seja, os pontos finais das rotas. Nesta Requisição também deve ser informado o Método (GET, POST, PUT ou DELETE). O principal objetivo da Camada Controller é oferecer serviços ao cliente, ou seja, fornecer a resposta, status, entre outros. O controlador faz uso dos serviços fornecidos pela camada de serviço (Service) para atender o cliente.

2. Service
A camada de Serviço (Service) destina-se a implementar as lógicas de negócios. O principal objetivo da camada de serviço é oferecer serviços à camada controladora. Todos os tipos de cálculos com os dados, por exemplo, são executados nesta camada, portanto, a camada de serviço requer dados. Portanto, elas contam com os serviços oferecidos pela camada Repository/DAO.

3. Repository/DAO
DAO significa Data Access Object (Objeto de acesso aos dados) e o principal objetivo da camada Repository é acessar (consultar) dados de forma eficiente no Banco de dados e fornecer serviços para a camada de serviço.

Existem interfaces no Spring Boot, que nos fornecem todas as operações do CRUD (CREATE, RETRIEVE, UPDATE, DELETE). Assim, a camada Repositório pode implementar qualquer um deles. A Camada Repository é como se fosse uma "Loja de Consultas", que oferece diversos tipos de consultas para a sua aplicação interagir com o Banco de dados.

4. Model
A camada Model (Modelo) representa os objetos do mundo real. Assim, esses objetos são referidos como modelos. JPA (Java Persistence API) fornece as referências ou detalhes sobre ORM (Object Relation Mapping - Mapeamento Objeto Relacional), o que significa que a classe Java pode ser relacionada à tabela do banco de dados. Existem muitas implementações de JPA ORM, a mais utilizada é o Hibernate. Este assunto será visto em detalhes, mais adiante.

