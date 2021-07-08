This project represents a movie recommendation application.

The code you are interested in is in the Recommender class. This class has two methods:
- recommendations: returns the list of recommendations for a client
- recommendationsCSV: returns the list of recommendations in CSV format (comma separated value)

A movie has a title, director and genre
A customer has a name and list of favorite movies

The recommendation algorithm is based on proposing films from directors that the client liked.

In addition, there is a test with two test methods. Both fail because they represent changes
we want in our code.

To run the test you must go to test/edu/solid/srp /TestRecommender.java and, with the right button
 select run as -> JUnit Test

The test requires that you make two functional changes:
- That the list of recommendations does not include films that the client has already seen
- that the csv format changes from the current <title, genre, director> to <title, director, genre>

As you can see, there are two different changes: one in the recommendation algorithm, another in the way of transmitting
 the data. In the current implementation, the two changes must be made in the same class,
violating the Single Responsibility Principle.

Refactor the code so that these two responsibilities are in different classes.
Then, adapt the test code for the new structure.

Good luck and do not hesitate to ask any questions.
