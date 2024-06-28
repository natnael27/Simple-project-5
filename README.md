# Simple java project
This code splits the Date, Patient, Hospital and Main classes into separate files, Date.java, Patient.java, Hospital.java and Main.java respectively. You can compile and run the Main.java file to execute the program.

We then define a Patient class with five instance variables: name, age, disease, dateOfAdmission, 
and dateOfDischarge. We define a constructor that takes these five variables as parameters and 
initializes them using the this keyword. We also define getter methods to access the instance 
variables, and a display() method that prints the patient's information to the console in a formatted 
way.

Finally, we define a Hospital class with an ArrayList of Patient objects as its instance variable. We 
define a constructor that initializes the ArrayList, and methods to add and delete patients from the 
list, as well as to display all patients and display patients under 12 years old.


In the Main class, we create three Date objects and two Patient objects with initial values. We then 
create a Hospital object and add the two patients to its ArrayList. We then call the 
displayAllPatients() and displayPatientsUnder12() methods on the hospital object to display the 
patient information.
