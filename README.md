Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=FIRST -Darg1=SECOND -Darg2=THIRD

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf vidhi_kamdar_assign_3.tar.gz vidhi_kamdar_assign_3

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense."

[Date: 10/17/2017]

-----------------------------------------------------------------------
Brief on implementation of State Pattern:
->Driver class initializes instance of Context class. For every line of the input file, the context class will call tightenOrLoosenSecurity method on the current state
depending on the average traffic and average prohibited items. This calculation is carried out by CalculateAverage class. Depending on the current state, the
operation ids are selected and added to the results arraylist.

Provide justification for Data Structures used in this assignment in
terms of Big O complexity (time and/or space)

ArrayList<String[]> for storing the list of travellers and their respective information:
The number of travellers may keep changing(ArrayList is suitable) but the fields may be fixed(String[] is suitable). For example, for this assignment: Day, TOD, Airline, ProhibitedItems are fixed.
getElement:O(1); Search:O(n) under normal circumstances

ArrayList<String> for storing results:
ArrayList is not fixed size, hence we can modify it more frequently when needed.Storing results needs constant change in size of the list according to the test cases.Even if we set an initial size, we can still modify the size
Big O Time complexity:O(n) under normal circumstances

-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken/referred code
(if any).

1. Split strings based on delimiter:
https://stackoverflow.com/questions/7787385/split-java-string-into-two-string-using-delimiter
https://stackoverflow.com/questions/8547940/splitting-strings-based-on-a-delimiter
https://beginnersbook.com/2013/12/java-string-split-method-example/

2. Usage of ArrayList
https://stackoverflow.com/questions/1921181/java-arraylist-of-string-arrays
https://stackoverflow.com/questions/3920602/get-specific-arraylist-item
https://stackoverflow.com/questions/14973566/find-the-index-in-an-arraylist-that-contains-a-string
https://stackoverflow.com/questions/3943582/use-of-contains-in-java-arrayliststring

3. Usage of Array
http://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
https://stackoverflow.com/questions/26255862/how-to-check-if-an-array-in-an-arraylist-contains-a-certain-value

3. Miscelleneous
https://stackoverflow.com/questions/28327438/java-generics-compilation-error-incompatible-types-item1-cannot-be-converted
https://www.mkyong.com/java/java-convert-string-to-int/
https://teamtreehouse.com/community/bad-source-file
https://stackoverflow.com/questions/3753869/how-do-i-concatenate-two-strings-in-java
https://stackoverflow.com/questions/16069106/how-to-compare-two-java-objects
https://www.tutorialspoint.com/java/java_string_tolowercase.htm
https://stackoverflow.com/questions/14206768/how-to-check-if-a-string-is-numeric

4. State pattern examples
Head First Design Patterns - ORA
https://github.com/bethrobson/Head-First-Design-Patterns/blob/master/src/headfirst/designpatterns/proxy/gumballmonitor/GumballMachine.java
https://dzone.com/articles/design-patterns-state
https://www.journaldev.com/1751/state-design-pattern-java
https://sourcemaking.com/design_patterns/state/java/5

5. Performance and Time Complexities
http://bigocheatsheet.com/
https://stackoverflow.com/questions/14670770/binary-search-tree-over-avl-tree
http://infotechgems.blogspot.com/2011/11/java-collections-performance-time.html

6. File I/O 
Read file line by line: Referred to: https://rosettacode.org/wiki/Read_a_file_line_by_line#Java
Analysed different methods to write to file: http://www.baeldung.com/java-write-to-file
FileNotFound Exception: https://www.tutorialspoint.com/java/java_exceptions.htm

7. Enums
http://tutorials.jenkov.com/java/enums.html
https://stackoverflow.com/questions/27089438/complexity-of-enum-values

8.Exceptions
https://stackoverflow.com/questions/6822968/print-the-stack-trace-of-an-exception
https://www.tutorialspoint.com/java/java_exceptions.htm
https://beginnersbook.com/2013/04/throw-in-java/
https://stackoverflow.com/questions/8052941/throwing-a-custom-numberformatexception-in-java
https://stackoverflow.com/questions/6456219/java-checking-if-parseint-throws-exception