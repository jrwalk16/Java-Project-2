# Java-Project-2



## Endpoints

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
