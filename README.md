# PokemonTypesCounters

This application creates a webpage that allows user to check what types to use against enemy Pokémon.
USer can choose up to 2 types and webpage will display what good attack types are good and with what types to defend with.

## Table of Contents

- [Description](#description)
- [Technologies Used](#technologies-used)
- [Installation](#installation)

## Description
Provide an overview of the application. Explain the purpose of the project, what problems it solves, and any 
relevant details that may be of interest to users.

This project was created in order to simplify playing any Pokémon, so that user doesn't have to remember how 
all 18 types interact with each other or navigate a 18x18 chart and then compare the enemy's types against each other.

## Project Structure

### File in src/main/java
### Controllers 
#### DataDisplayController
Contains the logic and API endpoints that are used to calculate what types are good against an enemy Pokémon.
#### PageController
Contains API endpoints that are used to navigate the project

### Services
#### ProcessTypes
Contains the logic behind processing what types are good against an enemy Pokémon.

### Templates
#### TypeImages
Contains the template to process the types that are send from the front-end.
#### Types
Contains all interactions between types.

### Folders in src/main/resources
### \static
#### \css
Contains files with css styling for webpages.
#### \images
Contains images of types.
#### \js
Contains javascript files used in webpages.

### \templates
Contains html files with webpages.


## Technologies Used

- **Java** - Programming language used for backend development.
- **Spring Boot** - Framework for building web applications.
- **Maven** - Build tool for managing dependencies.
- **HTML/CSS/JavaScript** - Front-end development.

## Installation

### Prerequisites
- JDK 17 or higher
- Maven installed
- An IDE (e.g., IntelliJ IDEA)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/jzajas/PokemonTypesCounters.git
    ```
2. Navigate into the project directory:   
   ```bash
   cd PokemonTypesCounters
    ```
3. Build the project using Maven
   ```bash
    mvn clean install
    ```
4. Run the application
   ```bash
   mvn spring-boot:run
    ```
   

