# AI Assistant APP

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring, Langchain4j and LM Studio.**

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/JU7I0/ai-assistant-java.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080
3. Install [LM Studio](https://lmstudio.ai/)
4. Download model Meta-Llama-3-8B-Instruct-Q5_K_M.gguf
5. Start LM Server

<img src=".github/llmStudio.png"/>

## API Endpoints
The API provides the following endpoints:

**GET USERS**
```markdown
POST /api/chat - Retrieve a list of all users.
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

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.
