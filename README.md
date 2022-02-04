# Java-Project-2

### Project Description
Create a management system for comic book inventory using Spring Boot REST API. The system provides functionality to create superhero entries as well and link them to series they appeared in as well as supporting characters.


### Process
I wanted to create an application that allowed me to keep track of comic books in inventory. I thought about what kinds of information I wanted to be able to find based on the superhero. I decided to add tables for series the character appeared in as well as the supporting characters who appeared alongside them. I aslo included a table listing the secret identity of the superhero. This would be a one-to-one relationship while the others would be one-to-many.

#### Things to add in future
1. Functionality to match supporting characters to the series they appear.
2. Once we can match characters/series be able to look up all series a supporting character appears.

### Endpoints

| ENDPOINT                                                | FUNCTIONALITY |
|---------------------------------------------------------| :--- |
| GET _/api/superheroes/_                                 | GET all Superheroes
| GET _/api/superheroes/{heroId}/_                        | GET superhero by ID
| POST _/api/superheroes/_                                | CREATE a new superhero
| PUT _/api/superheroes/{heroId}/_                        | UPDATE a superhero by ID
| DELETE _/api/superheroes/{heroId}/_                     | DELETE a superhero by ID
| POST _/api/superheroes/{heroId}/secretidentity/_        | CREATE a new secret identity
| GET _/api/superheroes/{heroId}/secretidentity/{nameId}_ | GET a secret identity by ID
| POST /api/superheroes/{heroId}/series/                  | CREATE a superhero series
| GET /api/superheroes/{heroId}/series/                   | GET all series for a superhero
| GET _/api/superheroes/{heroId}/series/{seriesId}/_      | GET a series by ID
| POST /api/superheroes/{heroId}/characters/              | CREATE a new supporting character
| PUT /api/superheroes/{heroId}/characters/               | GET all supporting characters for a superhero 
| GET /api/superheroes/{heroId}/characters/{characterId}  | GET supporting character by ID


### User Stories

* As a user, I want to be able to add a superhero to the database.
* As a user, I want to be able to delete a superhero from the database.
* As a user, I want to be able to update a superhero in the database.
* As a user, I want to be able to find a superhero in the database.
* As a user, I want to be able to see all superheroes in the database.
* As a user, I want to be able to create a secret identity for a superhero.
* As a user, I want to be able to view the secret identity for a superhero.
* As a user, I want to be able to create a series for a superhero.
* As a user, I want to be able to view a series for a superhero.
* As a user, I want to be able to view all series for a superhero.
* As a user, I want to be able to create a superhero supporting character.
* As a user, I want to be able to view a supporting characters of a superhero.
* As a user, I want to be able to view all supporting characters of a superhero.


### POM Dependencies


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>6.0.0.Alpha7</version>
            <type>pom</type>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.0.0.CR1</version>
            <type>pom</type>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.6.3</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.4.0-b180830.0359</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    

### Entity Relationship Diagram


![SuperHero](https://media.git.generalassemb.ly/user/40878/files/277d4400-85ad-11ec-8875-6f85f87f6155)


### Programs Used

![SpringBoot](https://user-images.githubusercontent.com/77462898/152444031-3b6663aa-3610-48a2-bae1-9564dc10e471.png)

![postman](https://user-images.githubusercontent.com/77462898/152444063-eaca287a-b7af-489a-b3f7-663e8eca2ad3.png)

![postgres logo](https://user-images.githubusercontent.com/77462898/152444380-ffb0ab5c-6a19-4c2a-830c-be25c418d370.png)

![intelliJ logo](https://media.git.generalassemb.ly/user/40878/files/8cd52480-851c-11ec-9421-b7c2fbc16551)
