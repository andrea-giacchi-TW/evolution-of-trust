#The Evolution of Trust

## Basic game
- Build the game for 2 players
- Display and verify output after each round
- Game lasts 5 rounds: declare winner and final points

## Play with characters
Model and run a game between characters:

###First Match: *Always Cooperate* vs *Always Cheat*
- **Always Cooperate**: Cooperates at every round
- **Always Cheat**: Cheats at every round

Expected points after each round:

| Round | Always Cooperate | Always Cheat |
|:------|:-----------------|:-------------|
| 1     | -1               | 3            |
| 2     | -2               | 6            |
| 3     | -3               | 9            |
| 4     | -4               | 12           |
| 5     | -5               | 15           |

###Second Match: *Copy Cat* vs *Always Cheat*
- **Copy Cat**: starts with Cooperate, and afterwards copies whatever opponents did in the last round
- **Always Cheat**: Cheats at every round

Expected points after each round:

| Round | Copy Cat | Always Cheat |
|:------|:---------|:-------------|
| 1     | -1       | 3            |
| 2     | -1       | 3            |
| 3     | -1       | 3            |
| 4     | -1       | 3            |
| 5     | -1       | 3            |

###Third Match: *Copy Cat* vs *Grudger*
- **Copy Cat**: starts with Cooperate, and afterwards copies whatever opponents did in the last round
- **Grudger**: starts like ***Always Cooperate***, if opponent cheats he switches to ***Always Cheat***

Expected points after each round:

| Round | Copy Cat | Grudger |
|:------|:---------|:--------|
| 1     | 2        | 2       |
| 2     | 4        | 4       |
| 3     | 6        | 6       |
| 4     | 8        | 8       |
| 5     | 10       | 10      |

###Fourth Match: *Copy Cat* vs *Detective*
- **Copy Cat**: starts with Cooperate, and afterwards copies whatever opponents did in the last round
- **Detective**: starts Cooperate, Cheat, Cooperate, Cooperate. If opponent cheats back, he'll act like ***Copycat***. If opponents never cheats back, he'll act like ***Always Cheat***

Expected points after each round:

| Round | Copy Cat | Detective |
|:------|:---------|:----------|
| 1     | 2        | 2         |
| 2     | 1        | 5         |
| 3     | 4        | 4         |
| 4     | 6        | 6         |
| 5     | 8        | 8         |


## Tournament Game
Model a tournament between the characters we previously built:
- 5 characters
- Each character fights against all the others (10 matches)
- 10 rounds per match
- Sum all the points from every match
- Declare total points for each character and the winner of the tournament (Copy Cat)


## Repeated Tournaments
Let's introduce evolution in the game:
- 25 characters (15 ***Always Cooperate***, 5 ***Always Cheat*** and 5 ***Copy Cat***)
- Play a tournament
- Remove the 5 worst players (if there's a tie, pick randomly between them)
- Clone the 5 best players (if there's a tie, pick randomly between them)
- Repeat 20 times
- The character with most players in the game wins (***Copy Cat***)

#### Re-Introduce Detective and Grudger in the tournaments
Play repeated tournaments and check winner:
- 25 characters (5 ***Always Cooperate***, 5 ***Always Cheat***, 5 ***Copy Cat***, 5 ***Grudger*** and 6 ***Detective***)
- ***Copy Cat*** wins


## Considering Mistakes
Introduce a 5% chance for all player to make a mistake (opposite move)

Model 3 new characters:
- ***Copy Kitten***: starts like ***Copy Cat*** but cheats back only after opponents cheats twice in a row
- ***Simpleton***: starts with Cooperate, if opponent cooperates he does same move as last one, if opponent cheats he does the opposite of last move.
- ***Random***: 50% chance to do either Cooperate or Cheat

#### Repeated tournament with mistakes 1
- 25 characters (13 ***Always Cooperate***, 3 ***Copy Cat***, 3 ***Copy Kitten***, 3 ***Simpleton*** and 3 ***Random***)
- ***Simpleton*** wins

#### Repeated tournament with mistakes 2
- 25 characters (13 ***Always Cheat***, 3 ***Copy Cat***, 3 ***Copy Kitten***, 3 ***Simpleton*** and 3 ***Random***)
- ***Copy Kitten*** wins


## Sandbox
Create a sandbox running Repeated tournaments where is possible to play with all the settings:
- choose the 25 players between all 8 characters
- edit payoffs of the 3 combination Cooperate-Cheat (Cooperate-Cooperate values move together just like Cheat-Cheat)
- rounds per match
- evolution speed (quantity of players to replace after each tournament)
- chance of mistakes