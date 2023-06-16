<h1 align="center"> Coffee_Machine_Sinulator </h1>

* Tech stack used: JAVA, OOPS
* ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

* This is a simple Java program that simulates a coffee machine. 
The program allows users to buy different types of coffee, fill the machine with ingredients, take money from the machine,
and view the available ingredients and analytics.

>## Usage
* Once the program is running, you will be presented with a menu of options:

* Buy: Select this option to buy a coffee. You can choose from different coffee types available in the menu.
* Fill: Select this option to fill the coffee machine with ingredients. You will be prompted to enter the amount of water, milk, coffee beans, and money to add.
* Take: Select this option to take the money collected by the machine.
* Show: Select this option to view the current status of the coffee machine, including the available ingredients and the amount of money collected.
* Analytics: Select this option to view the analytics of the coffee machine, including the number of cups sold for each coffee type and the total money earned.
* Exit: Select this option to exit the program.
* Please follow the on-screen instructions and provide the required inputs when prompted.

>## Classes
* The program consists of the following classes:

* CoffeeMachine: Represents the coffee machine itself. It contains methods for buying coffee, filling ingredients, taking money, and displaying information and analytics.
* Coffee: Represents a type of coffee. It stores information about the coffee type, price, and the amount of water, milk, and coffee beans needed to make it.
* Main: Contains the main method to start the program and create an instance of the CoffeeMachine class.

>## Project Summary
* The project is a simulation of a coffee machine implemented in Java. It allows users to interact with the coffee machine by buying different types of coffee, filling the machine with ingredients, 
* taking money from the machine, and viewing the available ingredients and analytics.
* The CoffeeMachine class serves as the main component of the project, containing methods for handling user input and managing the coffee machine's functionality. 
It keeps track of the amount of water, milk, coffee beans, and money available in the machine.
 It also tracks the number of cups sold for each coffee type and calculates the total money earned.
* The Coffee class represents a specific type of coffee, storing information such as the coffee type, price, and the amount of water, milk,
 and coffee beans required to make it. Multiple instances of the Coffee class are created and stored in an array within the CoffeeMachine class to represent the available coffee options.
* The program's execution is driven by the Main class, which creates an instance of the CoffeeMachine class and calls its run method to start the interaction with the user.
