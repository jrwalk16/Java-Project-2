# Java-Project-2

### Project Description
Create a management system for comic book inventory using Spring Boot REST API. 

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


### Entity Relationship Diagram

=======
![SuperHero](https://user-images.githubusercontent.com/77462898/152441627-b82ff963-dee8-4d26-9d20-5a304c77ac59.png)

