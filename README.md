# TP 1 — Les Bases (Java)

Ce dépôt regroupe une série de 10 exercices Java pour pratiquer les bases de la programmation orientée objet : classes, encapsulation, héritage, interfaces, polymorphisme, collections et exceptions.

## Objectifs pédagogiques

- Manipuler des classes et des objets
- Utiliser les constructeurs et la surcharge de méthodes
- Appliquer l’héritage et le polymorphisme
- Implémenter des interfaces
- Gérer des collections (`ArrayList`)
- Comprendre les exceptions checked / unchecked

## Structure du projet

Le code source est organisé dans le dossier `src/` avec un package par exercice :

- `exercice01` : gestion simple d’un **Livre** (emprunt / retour)
- `exercice02` : **CompteBancaire** avec validations (dépôt / retrait)
- `exercice03` : **Rectangle** (constructeurs, aire, périmètre)
- `exercice04` : **Employe / Manager** (héritage)
- `exercice05` : **Produit** (surcharge de méthodes)
- `exercice06` : **Forme** abstraite + implémentations (cercle, rectangle, triangle)
- `exercice07` : interfaces **Allumable** / **Connectewifi**
- `exercice08` : **Reservation** avec dates (`LocalDate`) et saisonnalité
- `exercice09` : **Etudiant**, `equals` et usage d’`ArrayList`
- `exercice10` : exceptions personnalisées sur un **CompteBancaire**

Chaque exercice contient une classe `Main` exécutable pour illustrer le comportement.

## Prérequis

- Java 17+ (ou version compatible avec votre environnement)
- Un IDE Java (ex. IntelliJ IDEA) ou la ligne de commande

## Exécution

### Depuis un IDE

1. Ouvrir le projet.
2. Aller dans `src/exerciceXX/Main.java`.
3. Lancer la méthode `main` de l’exercice voulu.

### Depuis la ligne de commande

Exemple pour exécuter l’exercice 1 :

```bash
cd /home/runner/work/TP-1-Les-Bases/TP-1-Les-Bases
javac src/exercice01/*.java
java -cp src exercice01.Main
```

Adaptez `exercice01` selon l’exercice que vous voulez lancer.

## Auteur
Juliette
Projet de travaux pratiques — Java.
