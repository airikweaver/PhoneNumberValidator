# Binary Password Search

Common passwords are a huge security risk in the I.T. world. It is important to use longer, complex passphrases with mixes of uppercase, lowercase, numbers, and symbols to help guard against attacks. Hackers will often perform a dictionary attack, using very common passwords, to try to break into user accounts. Too many times, these attacks are succesful. In this assignment, you will create a console app that allows a user to test their password against the 1000 most used passwords.  

The repo contains a file (passwords.txt) of the 1000 most commmonly used passwords, one word per line. Create a program that reads the entire file into an array. The words should be sorted using a bubble sort or selection sort, *written by you*, printed to the console (use a method) and then searched for the given word using a binary search method also *written by you*. The program should tell the user if the given word appears in the top 1000 passwords, or state that the word does not appear.

The program should be exported as an executable jar file. It should allow the user to specify the password for which to search *as a command line argument* when launching the program from the console.

## Evaluation Criteria:

Program works and meets specifications

- Accepts command line argument
- Reads entire text file into Array
- Sorts the Array
- Binary Search	Method
- Print Sorted Array Method	


Communication

- Comments/Documentation/Format
- Author info
- All Parameters Documented
