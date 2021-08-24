# TruckProject
## The Problem

Our San Francisco team loves to eat. They are also a team that loves variety, so they also like to discover new places to eat.

In fact, we have a particular affection for food trucks. One of the great things about Food Trucks in San Francisco is that the city releases a list of them as open data.

Your assignment is to make it possible for us to find a food truck no matter where our work takes us in the city.

Feel free to tackle this problem in a way that demonstrates your expertise of an area -- or takes you out of your comfort zone.

## The Solution
The truck data itself has got a lot going on at first sight. There are lot of variables that we have available to us. The only ones necessary for this assignment are the location ID and the block. The others I added in bc I was going to attempt to do something fun/fancy with them but ran out of time and it wasn't in the scope of the project. Next time. I created a truck model with the necessary data points. 

The data from the CSV taken from online was loaded into the repo and read in through a file scanner. Because I didn't need all the elements of data from the file, i was picky with what I chose to save in the DB. I read the file line by line and I split each line by piece of data. Then, saved it all as one truck and added it to the db. 

Now that I had all the trucks, I started working on my endpoints. Spring makes it easy to access data, so I was able to use the functions it had to find each data record by the necesary ID (location and block)

## The Endpoints
There are four endpoints that are useful to us through this REST service

GET /trucks

This endpoint will return all the trucks stored in the DB 

GET /trucks/{id}

This endpoint will return the one truck connected with this location ID

GET /trucks/block/{block}

This endpoint will return a list of trucks that have the same block ID

POST /trucks

This endpoint will add a new truck to the DB

## How To Run
Either run from your IDE or use:

./mvnw clean spring-boot:run

and the localhose URL to hit should be localhost:8080