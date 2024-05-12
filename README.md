# AI Assistant APP

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring, Langchain4j and LM Studio.**

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Fernanda-Kipper/ai-assistant-java
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080
3. Install [LM Studio](https://lmstudio.ai/)
4. Download model Meta-Llama-3-8B-Instruct-Q5_K_M.gguf
5. Start LM Server


## API Endpoints
The API provides the following endpoints:

**GET USERS**
```markdown
POST /api/chat - Retrieve a list of all users.
```
```json
{
  "message": "do you speak portuguese? "
}
```
```json
{
  "response": "The movies that have Category Romance are: - La La Land - Titanic"
}
```
