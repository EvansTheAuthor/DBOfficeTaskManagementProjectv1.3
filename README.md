# Project Name: DBOfficeTaskManagement
### Version: 1.3.0

## Updates:

### "New Team Creation" feature was released! Seems familiar to WhatsApp Group Chat but still needs some improvements :)  
but at least, this one is work well.

## Work in Progress:

- Fixing minor bugs that appear when accessing the Team Member Editing Frame.
- The application's UI is under development and planned as a long-term ongoing project.

Feel free to contact me for bug reports. I'll do my best to respond as soon as possible! :)

## How To Configure This Project?
**Prerequisites:**  
Firstly, you must have PostgreSQL and NetBeans installed. However, if you have another IDE that can run it properly, feel free to modify it as you wish.

**Download and Extract:**  
Download the project file and extract it. Place the folder "DBOfficeTaskManagement" in your NetBeansProjects folder.

**Create Database:**  
Open PostgreSQL and create a new database entitled "DBOfficeTaskManagement."

**Setup Tables:**  
Use the provided DBOfficeTaskManagement.sql file to create tables and their connections.

**Open Project in NetBeans:**  
Launch NetBeans and click "Open Project..." or press Ctrl + Shift + O.

**Select Project:**  
Select the project (DBOfficeTaskManagement or DBOfficeTaskManagementv[version]).

**Configure Database Connection:**  
Open DBConnection.java and change the password to match your PostgreSQL password.

**Add PostgreSQL Library:**  
Right-click on Libraries, then select "Add Library..." and choose "PostgreSQL JDBC Driver." If you can't find it, download the JDBC driver manually from the official site (https://jdbc.postgresql.org/download/) and use JDBC 4.2. Right-click on Libraries, then select "Add JAR/Folder..." and choose the jdbc.jar file.

**Create New Database Connection:**  
Open the Services tab, then right-click on Databases and select "New Connection..."

**Select Driver and Enter Database Name:**  
Choose PostgreSQL as the driver and click Next. Change the Database name to "DBOfficeTaskManagement."

**Enter Password and Test Connection:**  
Enter your PostgreSQL password and test the connection to ensure it is successful.

**Finish Connection Setup:**  
If the connection succeeds, click Finish.

**Run the Application:**  
Run AdminMenu.java or LoginFrame.java. When you run LoginFrame.java, use the username "Admin" and password "admin#123."

**Enjoy the Project:**  
Use the Java project as you wish. Good luck! :)
