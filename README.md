# employee_information_system

## Working with Employee app in your IDE

### Prerequisites
The following items should be installed in your system:
* Java 8 or newer
* Maven
* Lombok
* Node.js 14 or newer
* MySQL 8
* Git command line tool (https://help.github.com/articles/set-up-git)
* Your preffered IDEA
  * Eclipse
  * IntelliJ IDEA

### Steps:
 
 1) On the command line
    ```
    git clone https://github.com/ProgIsLove/employee-app.git
    ```
 2) Open terminal create DB
    ```
    ${yourPath}/MySQL/MySQL Server 8.0/bin>mysql -u root -p
    
    mysql> create database employeemanager;
    
    ```
 3) Navigate into application.properties file ->              
    ${yourPath}/employee_information_system/employee_server/src/main/resources/application.properties and 
    setup your MySQL configuration

    ```
    Example:
    
    spring.datasource.url=jdbc:mysql://localhost:3306/employeemanager
    spring.datasource.username=root
    spring.datasource.password=password
     
    ```
  4) Open terminal
  
    ```
    ${yourPath}/employee-app>mvn clean install
    
    ${yourPath}/emloyee-app/employee_server/target>java -jar employee_server-0.0.1-SNAPSHOT.jar
     
    ```
    
###  Visit http://localhost:8080/nhl in your browser

  5) Enjoy <3

<img alt="section" src="https://imgur.com/RC1x9sE.png">


  
