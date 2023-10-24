# Ironhack midterm project template

This is a template to make your work in the midterm project easier.
In this template you will find a spring project containing two entities: "Collection", representing a collection of books. And "Book", representing a book object.
There is a relationship ManyToOne between them, because many books can be inside a collection.
The Book entity also has an embedded property, which is the Author, you can find the Author class inside the model package as well.
Both entities have repositories, testing files, controllers and services.

You should first strike to complete something like this before you add any bonus or extra content.

## Steps:

1) Decide the topic you want to create your project about (movies, videogames, food, sports, travel, etc)

2) Create a spring project with https://start.spring.io/  (Maven, java 17)

3) Fill in the application.properties

4) Create the model package and some entities

5) Run your project to check that everything goes well

6) Create the repository package and the repositories for your entities

7) Test some of the repository methods (findAll, findById, custom methods) to check that everything is working
   (You can add some data in the setUp method from the testing file or with a SQL script)

8) Create the controller package with the impl & interfaces packages inside, add the controller files one by one,
   try each controller method with Postman before adding the next one

9) Create the service package with the impl & interfaces packages inside, create the service files and move there
   the logic from the controller methods

10) Create some controller tests (just one per request type would be fine)

11) Don't forget about creating the README.md documentation with the UML diagrams!


## Good luck everyone! :)
