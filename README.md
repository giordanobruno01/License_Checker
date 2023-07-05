# License_Checker
For this assignment, you are required to develop an application to enable a user to provide information about items of a certain item type. The item type that your application must work with has been assigned based on the penultimate digit of your student ID number. Use Table 2 and based on the penultimate i.e. second to last digit of your student ID find the item type assigned to you. The application should calculate different metrics based on the description provided in this section. IMPORTANT: This is a submission requirement. If the incorrect item type is implemented and/or the incorrect metrics are calculated no marks will be provided.
Note that a single array should be used to store all the items provided by the user. IMPORTANT: For storing multiple items of the assigned type you should only use array (i.e. you should not use other data structures that were not covered within the module as no marks will be awarded for such solutions).
         
 Each item type has a certain state. The mandatory state (information) that should be recorded for the item type assigned to you is provided in Table 2. In addition, you are required to identify and declare at least 2 more suitable fields that would provide meaningful state for the item type assigned to you.
The application should work as follows:
 The application (i.e. not the user!) sets the following number as a constant:
o MAX_NUM_ITEMS – you should define one constant in your application for the maximum number of items that could be provided, i.e. MAX_NUM_ITEMS. Assign a value of your choice that is at least 5.
 At the start of the application, the application should display on the screen the type of items a user can provide information for (i.e. based on the item type assigned to you in Table 2). The application should also display on the screen the maximum number of items that the user could provide information for.
 Next, the application should display on the screen the functionalities that the application provides using a text-based menu in a format similar with the one shown in Table 1. Next, the application should prompt the user to enter their choice. The application should allow a user to repetitively use the available functionalities until the user decides that they want to exit the application.
Table 1 Application Menu
Application Menu - Item Type: XYZ (replace XYZ with the Item Type assigned to you in Table 2)
1 – Add an item
2 – Display all the items
3 – Search and display all the items whose mandatory state is the same with the given value.
4 – Calculate and display the average value of the mandatory state of all the items entered until that point
5 – The functionality assigned to you in Table 3 6 – Exit application
Enter your choice:
The functionalities that the application must provide are as follows:
1. Add an item
 The user provides/enters information about a new item, and the item is
added to the array of items. Note that only one single item should be provided at a time (i.e. when the user chooses the choice 1, only the information for a single item is provided. If the user wants to provide information about another item, they would have to choose again choice 1).
        

  The Item should be created only when the mandatory state is valid. Otherwise, the user should be prompted again to provide a valid value for the mandatory state.
 Note that validation must be performed such that a user cannot provide more items than the maximum number of items set by the application (i.e. MAX_NUM_ITEMS).
2. Display all the items
 The application should display the details of all the items entered so far.
 If there are no items, the application should display a message to inform the
user of the same.
3. Search and display all the items whose mandatory state is the same with the given value. For example, search and display all Hotels with a rating of 2 (provided that the assigned item type is Hotel).
 The user provides a value for the mandatory state. Next, the application should search and display all the items that have that mandatory state.
 Note: When there are multiple items that meet the same requirement, all the items should be displayed using the following format:
Item 1 details i.e. mandatory state together with all the additional fields that you declared
Item 2 details i.e. mandatory state together with all the additional fields that you declared
...
Item n details i.e. mandatory state together with all the additional fields that you declared
 If there are no items that meet the requirement, the application should display a message to inform the user of the same.
4. Calculate and display the average value of the mandatory state of all the items entered until that point. For example, calculate the average duration of all the Projects entered until that point (provided that the assigned item type is Project).
5. The functionality assigned to you in Table 3
 The functionality that you should implement has been assigned based on the
last digit of your student ID number. Please check Table 3 to find the functionality assigned to you.
6. Exit application
 The application should allow a user to repetitively use all the available
functionalities until the user decides that they want to exit the application. When the user enters 6 the application should finish its execution.
Validation should be performed for all the numerical user input. When invalid input is provided the application should prompt again the user for valid input.
Table 2 Item Type is assigned based on the penultimate digit of your student ID number. IMPORTANT: This is a submission requirement. If the incorrect item type is implemented no marks will be provided.
  
Penultimate (i.e. second to last) digit of your student ID
 
Item Type
Mandatory state (data member/instance variable)
0
9 1
8 2
7 3
6 4
5
OR
OR
OR
OR
OR
Project
Hotel Appointment Motorcycle Electronics
Duration – a length of time between 2 months inclusive and 12 months inclusive
Rating – a rating is a real number between 1 and 5 inclusive, where 1 is the lowest rating and 5 is the highest rating
Urgency – valid input 1, 2, and 3; where 1 represents high urgency, 2 represents medium urgency, and 3 represents low urgency
Mileage – a non-negative value
Price – a value between 100 inclusive and 5000 inclusive
                Example: According to Table 2, a student with the student ID = 21987654 would implement an application to work with items of item type Electronics (because the penultimate digit of that student ID is 5). That means that the application should enable a user to provide information about electronics.
Table 3 Functionality is assigned based on the last digit of your student ID. IMPORTANT: This is a submission requirement. If the incorrect functionality is implemented, no marks will be provided for this functionality.
   
Last digit of your student ID
 
Functionality ID
Functionality
0 or 2 or 4 or 6 or 8
F1
Determine and display the item with the lowest mandatory state. Note: When there are multiple items that meet the same requirement, the first item entered that meets the requirement should be displayed.
 
1 or 3 or 5 or 7 or 9
F2
Determine and display the item with the highest mandatory state. Note: When there are multiple items that meet the same requirement, the last item entered that meets the requirement should be displayed.
 Example: According to Table 3, a student with the student ID = 21987654 would implement the functionality identified by F1 (because the last digit of that student ID is 4).
