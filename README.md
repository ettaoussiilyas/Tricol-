📌 Projet Tricol – Gestion des Fournisseurs
🏢 Contexte du projet

Tricol est une entreprise spécialisée dans la conception et la fabrication de vêtements professionnels. Afin d’améliorer la gestion des approvisionnements, les dirigeants souhaitent mettre en place une application dédiée.

Cette première version de l’application se concentre exclusivement sur la gestion des fournisseurs, constituant ainsi la base d’un futur système complet incluant :

Gestion des produits

Gestion des commandes

Gestion des stocks

L’objectif est de développer un module robuste et extensible en utilisant les fondamentaux de Spring Core.

🎯 Objectif du projet

Développer une application Java permettant de gérer les fournisseurs avec les fonctionnalités de base (CRUD), tout en respectant une architecture en couches conforme aux bonnes pratiques Spring.

✅ Fonctionnalités (Exigences fonctionnelles)
📂 Gestion des fournisseurs

Ajouter un fournisseur : Société, adresse, contact, email, téléphone, ville, ICE.

Modifier un fournisseur : Mise à jour des informations existantes.

Supprimer un fournisseur : Suppression d’un fournisseur du système.

Afficher la liste des fournisseurs : Consultation de tous les fournisseurs avec option de tri (par nom).

🛠️ Exigences techniques
🧩 Technologies utilisées

Java

Spring Core

Spring MVC

Spring Data JPA

⚙️ Concepts Spring à intégrer

IoC Container (Inversion of Control)

Spring Beans & Scopes

ApplicationContext vs BeanFactory

Configuration Spring :

XML

Annotations

Java Config

Component Scanning

🏗️ Architecture

Architecture en couches :

Repository

Service

Controller

Utilisation des interfaces Spring Data JPA (CRUD, requêtes personnalisées)

Patterns Service et Controller

💾 Persistance des données

Spring Data JPA

Méthodes automatiques : findAll(), findById(), count(), etc.

Query Methods personnalisées : findByNom(...), findByEmailEndingWith(...), etc.

🌐 API REST – Endpoints
Méthode	Endpoint	Description
GET	/api/v1/fournisseurs	Lister tous les fournisseurs

GET	/api/v1/fournisseurs/{id}	Consulter un fournisseur par ID

POST	/api/v1/fournisseurs	Ajouter un nouveau fournisseur

PUT	/api/v1/fournisseurs/{id}	Modifier un fournisseur existant

DELETE	/api/v1/fournisseurs/{id}	Supprimer un fournisseur

🎓 Modalités pédagogiques



📊 Modalités d’évaluation (présentation de 30 minutes)
Durée	Contenu
10 min	Démonstration des fonctionnalités
10 min	Explication du code, organisation, modélisation
5 min	Mise en situation
5 min	Questions/Réponses (évaluation des connaissances)
📁 Livrables

✅ Code source sur un dépôt Git

✅ Collection Postman (JSON) pour tester les endpoints

✅ Fichier README.md

🏆 Critères de performance

✔ Architecture claire et bien structurée
✔ Utilisation des 3 types de configuration Spring (XML, Annotations, Java)
✔ Gestion des dépendances via Spring IoC
✔ API REST fonctionnelle et testée
✔ Code propre, documenté et conforme aux bonnes pratiques