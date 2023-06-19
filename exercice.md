# Exercice 

## Exercice 1

Créer un nouveau projet avec les dependances suivantes :
- lombok
- spring-boot-starter-web
- les dependances pour une base de données (jpa, mysql, mongodb, ...)

Faire une API de type CRUD pour l'entité `Personne` avec les champs suivants :
- id
- nom
- prenom
- dateNaissance
- email

On doit pouvoir faire les opérations suivantes :
- créer une personne
- récupérer une personne avec son id
- récupérer toutes les personnes
- modifier une personne
- supprimer une personne avec son id
- rechercher une personne en fonction de son nom ou de son prenom

## Exercice 2

Faire de même avec une entité `Equipe` avec les champs suivants :
- id
- nom
- membres (liste de personnes)
- representant (personne)

On doit pouvoir faire les opérations suivantes :
- créer une équipe
- récupérer une équipe avec son id
- récupérer toutes les équipes
- modifier une équipe
- supprimer une équipe avec son id
- rechercher une équipe en fonction de son nom
- ajouter un membre à une équipe
- supprimer un membre d'une équipe
- modifier le représentant d'une équipe
- récupérer les équipes d'une personne

