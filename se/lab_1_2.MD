###### You are to write a program that reads in lines of input using scanf or cin, and file redirection, process the data, and then outthe results using printf or cout. This means you can use C or C++  or any other style I/O as is your personal preference.

1. Each line of th named "transactione data file begins with an 'e', 'c', or 't'.
2. Lines beginning with 'e' will have an integer employee ID and an employee name.
3. Lines beginning with 'c' will have an integer customer ID, customer name, and a floating point account balance.
4. Lines beginning with a 't' will have a customer ID, employee ID, a 'w' or 'd' representing withdrawal or deposit,and a floating point transaction amount.
5. Lines beginning with an 'e' and 'c' may be intermingled, but all 'e' and 'c' lines will come before lines beginning
with 't'.
6. There will be at most 50 employees and 50 customers, and an unknown number of transactions. Names will be at
most 15 characters long.

An example data file is shown below:

```
e 5 Elden
c 3 Felipe 55342.51415
e 3 Leonardo
e 1 Yong
c 9 Alessandra 8114.541862
c 6 Marnie 15287.78233
e 8 Kourtney
c 2 Lou 95053.44742
c 5 Numbers 51245.66138
e 4 Jarvis
e 9 Marlen
e 10 Florance
c 1 Devon 56442.27875
e 2 Elliott
c 8 Justina 73723.84849
c 10 Reyna 82946.53205
e 6 Antonetta
e 7 Florene
c 4 Merrill 98281.82784
c 7 Marlana 33252.21805
t 1 8 w 4924.86
t 9 6 d 3220.42
t 6 1 w 127.62
t 9 8 w 5566.7
t 9 8 d 5414.55
t 5 7 w 9422.35
t 9 10 d 1382.07
t 4 7 d 6131.07
t 8 2 w 2362.22
t 8 10 d 5834.48
t 5 4 w 5150.73
t 6 2 d 3795.96
t 1 9 w 3919.45
t 5 2 w 5037.31
t 3 9 w 8129.21
t 8 6 d 1235.67
t 2 4 d 6901.28
```