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

##Question 2

