# JAVA-DesignPatterns-State #

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
