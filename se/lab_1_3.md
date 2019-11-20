#  Draw a use case diagram for the following problem

# 1.
Consider a library, where a member can perform two operations: issue book and return it. A book is issued to a member only after verifying his credentials. Draw a use case diagram for the problem. 
- Identify the actors and use cases
- Associate the use cases with the actors by drawing a simple use case diagram

# 2. 
 Consider your neighbouring travel agent from whom you can purchase flight tickets. To book a ticket you need to provide details about your journey i.e. on which date and at what time you would like to travel. You also need to provide your address. The agency has recently been modernized. So you can pay either by cash or by card. You can also cancel a booked ticket later if you decide to change your plan. In that case you need to book a new ticket again. Your agent also allows you to book a hotel along with flight ticket. While canceling a flight ticket you can also cancel hotel booking. Appropriate refund as per policy is made in case of cancellation. 

 - Identify the use cases from a given non-trivial problem statement
 - Identify the primary and secondary actors for a system
 - Use to generalization of use cases and «include» stereotypes to prevent redundancy in the coding phase

 Reference:
 - https://www.uml-diagrams.org/use-case-diagrams.html
 - https://www.omg.org/spec/UML/2.1.2/Superstructure/PDF

# 3. Identify the domain classes from the following problem statement

 Mr. Bob is the boss of this agency. Cabs are solely owned by the agency. They hire drivers to drive the cabs. Most of the cabs are without AC. However, a few comes with AC.

The agency provides service from 8 AM to 8 PM. Presently the service is limited only within Kathmandu. Whenever any passenger books a cab, an available cab is allocated for him. A booking receipt is given to the passenger. He is then dropped to his home, office, or wherever he wants to go. In case the place is in too interior, the passenger is dropped at the nearest landmark.

Payments are made to the drivers by cheque drawn at the local branch of At Your Risk Bank. All kind of finances required for the business are dealt with this bank.

Recently Mr. Rob, neighbour of Mr. Bob, has given a proposal to book one of the cab in the morning everyday to drop his son to school, and drop him back to home later. Few other persons in the locality have also found the plan a good one. Hence, Mr. Bob is planning to introduce this "Drop to school" plan also very soon. 

- Identifying potential classes (and their attributes) from a given problem statement
- Use expert knowledge on the subject matter to identify other relevant classes

# 4. Draw a statechart diagram to graphically represent the following system

Consider a bulb with a push down switch. The bulb initially remains off. When the switch is pushed down, the bulb is on. Again when the switch is pushed up, the bulb turns off. The lifecycle of the bulb continues in this way until it gets damaged.

### Think about these points: 
- What are the different states of the bulb?
- What activities are performed in each state?
- What action does make the bulb move from one state to another?

#### Objectives
1. Identifying different states of a system
2. Identifying activities performed in each state


# 5.  Modeling UML Class Diagrams and Sequence diagrams 

The Web traditionally worked in a client-server model, where a web browser would send a HTTP request to the web server, and the server would send back a HTTP response to the browser. The HTTP request actually encapsulates the contents of the requested resource in some format. In cases where access to a resource is restricted or say, it requires a user authentication, the HTTP request encapsulates the login credentials and sends to the server. The server then checks with the database server if the credentials are correct. The status of verification is then send back to the browser. 

 In the recent years there has been a shift from the traditional way of how HTTP works. A new technique has been proposed, popularly know as AJAX, that lets asynchronous communication between a browser and web server. In traditional model, the browser used to send a HTTP request, and then wait for a HTTP response. The next HTTP request was usually sent after getting response from the server. 

  AJAX, however, lets a web browser to send multiple HTTP requests one after another, without waiting until a response is received. This approach is found to be very helpful in cases when contents of only a portion of the web page has to be updated, rather than refreshing the entire page. Web 2.0 uses AJAX in many different cases for better user experience. 
  
  From the above problem statement
  
  1. How would you represent the traditional Web with a sequence diagram (in both cases when user verification is required or not)
  2. What changes would appear in your sequence diagram if you are trying model a scenario where AJAX is being used?

*Limitations:* Only simple sequence diagrams could be considered in this lab. Don't depict alternate flows or loops, lifeline activation / deactivation / destroy. 