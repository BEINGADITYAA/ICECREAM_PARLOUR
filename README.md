# ICECREAM_PARLOUR
This project is an implementation of a simple ice cream parlor application in Java. The program allows the user to customize their ice cream order by choosing between vegan and non-vegan options, selecting a flavor, and adding optional toppings like chocochips and choco syrup. The user interacts with the program through the console, providing input for their choices.

Here's a breakdown of the classes:

1. **ICECREAM class:**
   - Manages the properties and methods related to the ice cream order.
   - It has attributes for the price, vegan status, flavor, and optional toppings (chocochips and choco syrup).
   - The `CHOICE` method sets the price based on whether the user chooses a vegan option or not.
   - The `FLAVOUR` method prompts the user to choose a flavor and adjusts the price accordingly.
   - The `ADDCHOCOCHIPS` and `ADDCHOCOSYRUP` methods allow the user to add optional toppings.
   - The `GETBILL` method generates and displays the final bill.

2. **MAIN class:**
   - Contains the main method to execute the ice cream ordering process.
   - Asks the user for their name, welcomes them, and prompts them to choose between vegan and non-vegan options.
   - Instantiates an `ICECREAM` object and sets the user's choice.
   - Asks the user to choose a flavor and optionally add chocochips or choco syrup.
   - Displays the final bill, summarizing the user's choices and the total cost.

The program follows a simple flow where the user makes sequential choices to customize their ice cream order. It provides a basic example of object-oriented programming principles, user input handling, and conditional branching in Java.
