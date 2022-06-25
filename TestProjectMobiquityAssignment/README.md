Steps for Execution:
1. Download the full project or clone it on your local machine.
2. Open it using eclipse
3. For execution: Go to src/test/java folder
4. Go to Basetest Package
5. Run with TestNG.
6. Output is on console.you can redirect to log file.
7. There are one postive and one negative test case-ApiChallangeTest,java and ApiChallangeNegativeTest.java
You can integrate with circleci by defining your own config.yml file.


Logic of Test case.

1	Search for the user with username “Delphine”. Get the userid of Delhine from https://jsonplaceholder.typicode.com/users
2	Use this id  to search in the Post Api to get all the Post of Delphine from	https://jsonplaceholder.typicode.com/posts
3	Count the size of Post made by Delphine	
4	Use this count to Get all the comments of this Post.	
5	Get the PostId 	
6	Use this PostId to get all the emails in the Post from https://jsonplaceholder.typicode.com/comments/
7	Very each email that the email is Valid or not.	

![image](https://user-images.githubusercontent.com/107347154/175785182-de16685c-25ec-4aed-99ec-f463dc55de51.png)
