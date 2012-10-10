theepicchat-android-practice
============================

Practice app for trying out networking and general Android development.

### Current Goal:
-----
1. User sign up (I guess we can use a postgres or mysql database for this. I think postgres is the hot new thing but it's whatever).
2. User sign up will allow us to store a device ID (The database can be stored on my server for practice)
3. I think this device ID can be used to communicate from one user to another through the app and push notifications
4. Create a "room" where two people can be invited to
5. Have it be one persons turn.
6. Have a button in this room that changes colors or something or we could just start with sending a message to the other player for now.
7. Have the other person get a push notification that it is their turn now and take them to the screen that shows the message for now.
They can enter a response and this goes on ad infinitum.

Here's a good read on what steps need to be done to create a game like this. http://www.indieflashblog.com/how-to-create-an-asynchronous-multiplayer-game.html

###### One particular section that looks like a good flow to follow:
-----
1. Create  a way to save the game state to an online database
2. Write  a database query that loads a list of the player’s games and allows player to  load and restore a game session by clicking on an item in the list
3. Upon  loading a game session, check to see if the session is currently available for  “live” play. If so, join the session in progress to connect with  opponents currently online. If not, create a “live” game room and  load the session.
4. Devise  a way to replay any animations player did not “see” since their last  time playing the game session
5. During  actual game play, write updates to the stored game state in the database each  time player issues an order (this differs from Hero Academy where you would wait until the end turn button is pressed  to update the database). By writing continuous, smaller updates to database  less bandwidth is used and the async-to-live play transition can be seamlessly  achieved.
6. Find  a way to transition real-time gameplay elements (turn timer, drop timer, game  duration clock, AI turn controller) to async (unique challenge for Hero Mages, not applicable to all async  games)
7. Design  a user interface for viewing and joining async multiplayer games
8. Create  a match-making system that allows player to pick their army preferences,  preferred opponent type, etc. and matches player to games with available  opponents in database
9. When  a game turn is complete, send a notification to next opponent via email or  device push notification indicating that it is now their turn to play


### Eventual Goal:
-----
1. Cool asynchronous multiplayer android game wish push notifications.
2. ???
3. Profit.