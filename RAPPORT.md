**Bertrand Axel**

**Bontron Julien**

# Rapport TP3

## Question 1

### fonction wasborn()
On suppose que la personne est née le 1er Janvier 2000

| Classe          | Validité | Représentant | Oracle                     |
|:---------------:|:--------:|:------------:|:--------------------------:|
| date antérieur  | valide   | 01/12/1999   | false                      |
| date postérieur | valide   | 01/02/2000   | true                       |
| jour même       | valide   | 01/01/2000   | true                       |
| jour d'avant    | valide   | 31/12/1999   | false                      |
| jour d'après    | valide   | 02/01/2000   | true                       |
| date nulle      | invalide | ""           | illegal argument exception |

### fonction getAge()
On suppose que la personne est née le 1er Janvier 2000

| Classe          | Validité | Représentant | Oracle                     |
|:---------------:|:--------:|:------------:|:--------------------------:|
| date antérieur  | valide   | 01/12/1999   | illegal argument exception |
| date postérieur | valide   | 01/01/2001   | 1                          |
| jour même       | valide   | 01/01/2000   | 0                          |
| jour d'avant    | valide   | 31/12/1999   | illegal argument exception |
| jour d'après    | valide   | 02/01/2000   | 0                          |
| date nulle      | invalide | ""           | illegal argument exception |

## Question 2

Après avoir implémenter les cas de test nous pouvons observer que ceux-ci fontionnent correctement. 

## Question 3 

Afin de faire passer ces tests aux classes du package people qui implémentent l’interface IPerson nous avons utilisé une architecture similaire au pattern
stratégie. Comme les mêmes tests sont appliqués à chaque classe implémentant IPerson on implémente les tests dans une seule classe puis changeons le type
d'argument des classes filles. 

## Question 4

En effet, sur chaque classe tester elles renvoient toutes au moins une erreur.

## Question 5

Afin de faire passer les tests précédents à la classe Personne du package people nous avons utiliser le pattern Adapteur et pour cela nous avons implémenté
la classe PersonneAdapter. 

## Question 6

Voir code de la classe OutilPerson fonction [filterByAgeInterval](/src/main/java/OutilsPerson.java#L12).

## Question 7

Voir code de la classe OutilPerson fonction [getMaxAge](/src/main/java/OutilsPerson.java#L12).

## Question 8

Voir code de la classe OutilPersonTest 

## Question 9

Nous utilisons l'outil intégré à l'IDE IntelliJ, celui nous indique que l'ensembe des method est couvert mais pas l'ensemble des lignes car le constructeur 
n'est pas pris en compte. 

## Question 10

Voir le code de OutilPersonTest, notamment de la fonction [after](/src/test/java/OutilPersonTest.java#L39)
