# FakeStore - Clone API

## Table of Contents
- [Prerequisites](#prerequisites)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [License](#license)
- [Apis](#api-usage-guide)
- [Documentation](#documentation)

## Prerequisites

Before using this repository, make sure you have the following prerequisites installed:

- IntellIJ: [Installation Guide]([https://docs.docker.com/get-docker/](https://www.jetbrains.com/idea/download/))
- Spring Boot: [Installation Guide](https://spring.io/projects/spring-boot)
- Some dependencies necessary

## Tech Stack

This project uses the following technologies:

- [Java](https://www.geeksforgeeks.org/java/): The backend service is written in Java
- [Spring Boot](https://spring.io/projects/spring-boot): Docker is used for setting up the database and running the application in a containerized environment.
  
## Getting Started

Follow these steps to get started with the project:

1. Clone the repository: 
    ```bash
    git clone https://github.com/narasimha-1511/midtermFakeStoreAPI
    ```

2. Run This Folder using IntellIJ:

## API Usage Guide

Here are the available endpoints and how to use them:

- **Get All Products**

  `GET /products/`

- **Get a Product**

  `GET /products/{id}`
  Parameters:
    - id of the product{int,Long}

- **Get all Categories**

  `GET /products/categories`

  
- **Get A Single Categories**

  `GET /products/category/{category}`
    Parameters:
    - category of the product{string}

- **Create a Product**

  `POST /products/`
   Reqiured:
   - Response Body

- **Update a Product**

  `PUT PATCH /products/{id}`

  Parameters:
  - `id`: ID of the produdct


## License

This project is licensed under the [MIT License](LICENSE).

