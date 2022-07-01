





Minnie and Mickey are getting ready to send out Holiday bonuses to their hard working employees in Retail District #5. The bonuses are calculated based on how much each retail store sold in each category. The retail store with the highest amount sold in a category will receive $5,000. The retail store with the lowest amount sold in a category will receive $1,000. All other retail stores in district #5 will receive $2,000. If a retail store didn’t sale anything in a category, or they have a negative sales amount, they are not eligible for a bonus in that category. If only one retail store sold items in a category, they are eligible to receive only the bonus of $5000 for that category.





Create a utility class that manipulates a two-dimensional ragged array of doubles. This utility class will be used to create a Sales Report for Retail District #5. It will accommodate positive and negative numbers. Follow the Javadoc provided. 
Create a utility class that will calculate holiday bonuses given a ragged array of doubles which represent the sales for each store in each category. It will also take in bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in a category and the bonus amount for all other stores.
These utility classes will be used with an existing GUI class to create a sales report and display holiday bonuses.
Testing of these utility classes will be done with the JUnit tests and the GUI class provided for you.

Academic Honesty Policy – Do your own work!  Each project submission will be compared against other submissions from current and previous semesters.  

Good Faith Attempt (GFA) –
•	Your project must satisfy (pass) all of the included GFA test files 
•	Capture four of your test runs (actual vs. expected results) in your write-up 
o	A 28% deduction will be imposed on any project that did not include these test cases and their respective test results
•	INCLUDE your name as the author on every Java file that you are creating
•	Your submission will not satisfy the GFA if these requirements are not met  





•	Creating classes based on Javadoc
•	Two Dimensional Ragged Arrays
•	Passing arrays to and from methods
•	Creating a Utility class (static methods)
•	JUnit testing
•	Reading from a file
•	Writing to a file	
•	Using methods of the utility class within an existing GUI driver class
o	Must follow Javadoc to implement correctly





Utility class - TwoDimRaggedArrayUtility
The class TwoDimRaggedArrayUtility will follow the provided Javadoc and will contain the following methods: 
1.	Method readFile – pass in a file and return a two-dimensional ragged array of doubles
2.	Method writeToFile – pass in a two-dimensional ragged array of doubles and a file, and writes the ragged array into the file. Each row is on a separate line and each double is separated by a space. 
3.	Method getTotal – pass in a two-dimensional ragged array of doubles and returns the total of the elements in the array.
4.	Method getAverage – pass in a two-dimensional ragged array of doubles and returns the average of the elements in the array (total/num of elements).
5.	Method getRowTotal – pass in a two-dimensional ragged array of doubles and a row index and returns the total of that row. Row index 0 is the first row in the array.
6.	Method getColumnTotal - pass in a two-dimensional ragged array of doubles and a column index and returns the total of that column. Column index 0 is the first column in the array. If a row doesn’t contain that column, it is not an error, that row will not participate in this method.
7.	Method getHighestInRow - pass in a two-dimensional ragged array of doubles and a row index and returns the largest element in that row. Row index 0 is the first row in the array.
8.	Method getHighestInRowIndex - pass in a two-dimensional ragged array of doubles and a row index and returns the index of the largest element in that row. Row index 0 is the first row in the array.
9.	Method getLowestInRow - a two-dimensional ragged array of doubles and a row index and returns the smallest element in that row. Row index 0 is the first row in the array.
10.	Method getLowestInRowIndex - a two-dimensional ragged array of doubles and a row index and returns the index of the smallest element in that row. Row index 0 is the first row in the array.
11.	Method getHighestInColumn - pass in a two-dimensional ragged array of doubles and a column index and returns the largest element in that column. Column index 0 is the first column in the array. If a row doesn’t contain that column, it is not an error, that row will not participate in this method.
12.	Method getHighestInColumnIndex - pass in a two-dimensional ragged array of doubles and a column index and returns the index of the largest element in that column. Column index 0 is the first column in the array. If a row doesn’t contain that column, it is not an error, that row will not participate in this method.
13.	Method getLowestInColumn - pass in a two-dimensional ragged array of doubles and a column index and returns the smallest element in that column. Column index 0 is the first column in the array. If a row doesn’t contain that column, it is not an error, that row will not participate in this method.
14.	Method getLowestInColumnIndex - pass in a two-dimensional ragged array of doubles and a column index and returns the index of the smallest element in that column. Column index 0 is the first column in the array. If a row doesn’t contain that column, it is not an error, that row will not participate in this method.
15.	Method getHighestInArray - pass in a two-dimensional ragged array of doubles and returns the largest element in the array.
16.	Method getLowestInArray - pass in a two-dimensional ragged array of doubles and returns the smallest element in the array.

Utility class – HolidayBonus
The class HolidayBonus will follow the provided Javadoc and will contain the following methods: 
1.	Method calculateHolidayBonus – pass in a two-dimensional ragged array of doubles, and the bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in a category and bonus amount for all other stores. It will return an array of doubles which represents the holiday bonuses for each of the stores in the district. The first entry in the returned array [0] will represent the holiday bonus for the store at [0] in the two-dimensional ragged array of doubles. You will be using methods from the TwoDimRaggedArrayUtility when needed.
2.	Method calculateTotalHolidayBonus – pass in a two-dimensional ragged array of doubles, and the bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in a category and bonus amount for all other stores. It will return a double which represents the total of all Holiday Bonuses for the District. You will be using methods from the TwoDimRaggedArrayUtility when needed.

GUI Application – provided for you
1.	Uses methods of TwoDimRaggedArrayUtility and HolidayBonus
2.	When the Load Sales Data button is selected the sales data is read from a file and displayed on the screen with the sales data as well as the totals for each store and the totals for each category. The largest sales for each category is highlighted in green. The smallest sales for each category is highlighted in red. The holiday bonus for each store is displayed as well as the total of holiday bonuses.
3.	The file contains a row for each store and each double in the row is separated by a space
4.	Student must provide two additional input files and a screenshot of the results of each. Each file will have at least 4 rows and up to 6 numbers on each row. They must represent ragged arrays.

JUnit Test
1.	Student will implement TwoDimRaggesArrayUtilityTestSTUDENT
2.	Student will implement HolidayBonusTestSTUDENT








When GUI application starts (provided), user is shown display of Store Names and Item Names
User selects Load Sales Data to select the file containing the sales data. The application then displays the sales for each store and each item as well as the totals for the store and the totals for the item. The store with the highest sales for each item will be highlighted. 
Exit will exit the application. 

File Format
The file will be in the following format: one store per line, each sales figure is separated by a space.
 




When application starts: 
 

File containing sales data:
 

Result after selecting Load Sales Data:
 

File containing sales data (including negative numbers):
 

Result after selecting Load Sales Data:
 

File containing sales data (including negative numbers):
 

Result after selecting Load Sales Data:
 






Deliverables / Submissions: 
Design: UML class diagram with algorithm (pseudo-code) for methods
Implementation: Submit a compressed file containing the follow (see below):  The Java application (it must compile and run correctly); Javadoc files in a directory; a write-up as specified below.  Be sure to review the provided project rubric to understand project expectations.  The write-up will include:  
•	Test Cases (These are the ones you will use in your STUDENT test methods in the JUnit test)
o	Prepare a test table with a list of test cases (expected versus actual results) that you are testing the application with
•	UML diagram
•	Any assumptions that you are making for this project
•	In three or more paragraphs, highlights of your learning experience
	 
Deliverable format: The above deliverables will be packaged as follows. Two compressed files in the following formats:
•	LastNameFirstName_Assignment5_Complete.zip, a compressed file in the zip format, with the following:
•	Write up (Word document) - reflection paragraphs
•	UML Diagram - latest version (Word or jpg document)
•	doc (directory) - Javadoc
•	File1.html (example)
•	File2.html (example)
•	src (directory)  
•	File1.java (example)
•	File2.java (example)
•	Filetest.java (example)
•	LastNameFirstName_Assignment5_Moss.zip, a compressed file containing one or more Java files:
•	File1.java (example)
•	File2.java (example)
•	Filetest.java (example)
•	This folder should contain Java source files only

![image](https://user-images.githubusercontent.com/90938278/176967011-a20491bd-0c74-429f-9e43-f5e6258259b2.png)
