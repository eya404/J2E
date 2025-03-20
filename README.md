# JEE
# Projet : Injection de dépendances avec Spring

* Objectif
L'objectif de ce projet est de mettre en œuvre l'injection de dépendances en utilisant différentes méthodes : instanciation statique, dynamique, et le framework Spring.

* Étapes réalisées
1. Création des interfaces `IDao` et `IMetier`.
2. Implémentation des interfaces avec couplage faible.
3. Injection des dépendances :
   - Par instanciation statique.
   - Par instanciation dynamique.
   - En utilisant Spring (XML et annotations).

* Problèmes rencontrés
- Configuration de Spring avec les annotations.
- Chargement dynamique des classes.

* Solutions
- Utilisation de `<context:annotation-config/>` pour activer les annotations.
- Ajout d'un fichier `config.txt` pour l'instanciation dynamique.
