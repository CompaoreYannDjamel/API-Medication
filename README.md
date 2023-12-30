
# Gestion de Médicaments - API

## Description
Ce projet est une API Spring Boot pour la gestion des médicaments. Il permet de créer, lire, mettre à jour et supprimer des informations sur les médicaments, et enregistre les actions dans une table `audit_log`.

## Prérequis
- Java JDK 11 ou supérieur
- Maven 3.6 ou supérieur
- PostgreSQL

## Configuration
Avant de lancer l'application, configurez la base de données :
1. Installez et lancez PostgreSQL.
2. Créez une base de données nommée `medication_db`.
3. Exécutez le script SQL fourni dans `/resources/db/script.sql` pour créer les tables nécessaires.

Mettez à jour le fichier `application.properties` dans le dossier `resources` pour qu'il corresponde à votre configuration de base de données :
```
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=Yann2021
server.port=8094
```

## Lancement de l'Application
Pour lancer l'application, exécutez la commande suivante dans le répertoire racine du projet :
```
mvn spring-boot:run
```

## Utilisation de l'API
L'API peut être testée via des outils comme Postman ou cURL. Voici quelques exemples de requêtes :

### Obtenir la Liste de Tous les Médicaments
```
GET /drug
```

### Ajouter un Nouveau Médicament
```
POST /drug
Content-Type: application/json

{
  "catNumber": 1,
  "dci": "Paracétamol",
  "dosage": "500mg",
  "form": "Comprimé",
  ...
}
```

### Mettre à Jour un Médicament
```
PUT /drug
Content-Type: application/json

{
  "drugNumber": 1,
  "catNumber": 1,
  "dci": "Paracétamol Modifié",
  ...
}
```

### Supprimer un Médicament
```
DELETE /drug/{drugNumber}
```

## Tests
Pour exécuter les tests, utilisez la commande suivante :
```
mvn test
```
