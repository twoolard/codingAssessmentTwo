## RestAssured Framework (using Maven)
I built this framework using Java, RestAssured, lombok, and TestNG. 
Nothing too fancy going on with this one, it's similar to e2e one that I submitted. 
You will have to forgive my POJO's, I just used RoboPojo generator. Again, Build requires JDK 1.8 or higher but I recommend 11. 

   #### Step 0 - Installing Maven
The first thing you will need to do is install maven. Check out maven's documentation [here](https://maven.apache.org/install.html).
   #### Step 1 - Clone this Project
Clone this repository to the directory of your choice on your local machine.
   #### Step 3 - You're ready to run the tests
Open up the command prompt and navigate to the root directory in this project. Try running "mvn clean" then "mvn compile". Then when you're ready run "mvn test". You should see all of the forecast in the command prompt window.
If you want to use different coordinates for the test all you need to do is change the location in the local.properties file in the test resources root directory. 
