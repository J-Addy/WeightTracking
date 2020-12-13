# WeightTracking

This is a simple applicaiton meant for users to be able to track their daily weights.  They also are able to set a goal weight, that, if they allow SMS notifcations, will alert them when they reach their goal weight.  The app allows users to create accounts with login credentials, log in, log weights, edit/delete existing weight logs, and set new goal weights.  

There were there main screens that were necessary to give the user the required functionality.  A screen that allows users to log in, a screen that allows the user to create a new account, and a screen that allows the user to view/edit/delete/log their weights.  There were several considerations in mind to keep the UI user-centered.  The first was to use neutral colors that contrasted nicely so the user is able to read the information clearly.  The second was to keep the application simple and to minimize clicks.  The user needs to be able to quickly log in, and view his/her weights, and easily edit/delete them, I believe all of these objectives were accomplished in a straight forward and efficient manner. 

The main way I approached the coding was to keep it organized and as simple as possible.  I divided the code up into separate packages based on use (model, view, ect).  I created several classes to keep this division and organization intact.  Within the classes, I used a background thread to do the heavy lifint as far as database quering, and I did my best to use simple, re-usable functions to accomplish the applicaitons goals.  I think I can re-use these same techniques in the future, but hopefully in an even more organized and straight forward manner. 

I tested my code in 3 main ways - visual, static, and dynamic testing.  I visually inspected the code for errors, my IDE statically tested it for me, and I dynamically tested it for execution (where I found the majority of errors).  On top of this, I wrote several model level test classes to ensure their functionality.  It was during my dyanmic testing that I really ran into an issues.  My recyclerview buttons were not functioning correctly, and this was attributed to myself not naming the buttons differently enough and relying on auto-complete while coding.  Not catching that typing error caused me to needlessly spend much time in my recyclerview adapter for no reason. 

I think adding click listeners within my recyclerview is the main area that I ended up innovating.  I like developing an overview of the entire app, especailly how the model classes will interact, and once I have that plan mostly down, I tackle how to bring them together in the controller classes.  This is where I prefer a divide and conqure approach.  I take one challenge at a time, solve it, and move on to the next.  How do I instantiate an SQLite database in code? Learn this skill, apply it, and move onto the next challenge.  How do I create an alert dialog? Learn the ins and out of creating dialogs, then move on to the next challenge.  This method isn't full proof, it isn't uncommon to have to go back and change things I previously did in order to maintain the flow of the app as I intend.  But the code I write, the easier it is for me to get through challenges without having to go back. 

I believe that I successfully completed all functionality related challenges that were presented to me. I think the place that I excelled in was creating my recyclerview adapater and preventing memory leaks by using weak references for my on click listeners.  I belive I demonstrated my abaility to make functional and reliable applicaitons.  I have had some expreience with Andoird Development in the past, but I am undoubtedly more knowledgeable and effecient than I was when I started. 
