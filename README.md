# Aplicativo Assistente de IA

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licença](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Este projeto é uma API construída utilizando **Java, Java Spring, Langchain4j e LM Studio.**

## Sumário

- [Instalação](#instalação)
- [Uso](#uso)
- [Endpoints da API](#endpoints-da-api)
- [DockerFile](#para-executar-com-Docker)
- [Contribuições](#contribuições)

## Instalação para rodar local

1. Clone o repositório:

```bash
git clone https://github.com/JU7I0/ai-assistant-java.git
```

2. Instale as dependências com o Maven

## Uso

1. Inicie a aplicação com o Maven
2. A API estará acessível em http://localhost:8080
3. Instale [LM Studio](https://lmstudio.ai/)
4. Faça o download do modelo Meta-Llama-3-8B-Instruct-Q5_K_M.gguf
5. Inicie o Servidor LM

![LM Studio](.github/llmStudio.png)

## Endpoints da API
A API fornece os seguintes endpoints:

**METODO POST**
```markdown
POST /api/chat - Faça perguntas ao chat.
```
```json
{
    "message": "Oi, tudo bem?"
}
```
```json
{
  "response": "Tudo bem! Como posso ajudar você hoje?"
}
```
## Para executar com Docker:

1. Certifique-se de ter o Docker instalado em sua máquina. Se não tiver, você pode baixá-lo e instalá-lo a partir do [site oficial do Docker](https://www.docker.com/get-started).

2. Abra um terminal e navegue até o diretório raiz do projeto onde está localizado o arquivo Dockerfile.

3. Execute o seguinte comando para construir a imagem Docker:

```docker build -t ai-assistant-java  . ```

4. Execute o seguinte comando para rodar a imagem no container:

```docker run -p 8080:8080 ai-assistant-java```

## Contribuições

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorias, por favor, abra uma issue ou envie um pull request para o repositório.

Ao contribuir para este projeto, por favor, siga o estilo de código existente, [convenções de commits](https://www.conventionalcommits.org/en/v1.0.0/), e envie suas alterações em um branch separado.
