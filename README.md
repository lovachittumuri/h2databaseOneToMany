### h2databaseOneToMany

### http://localhost:9999/student - for Get the List of Students
### http://localhost:9999/department - for Get the List of Departments 

###  http://localhost:9999/h2-console - to get the h2 console - to access the H2 DB Details.

******************* H2 Console - Login DB Details ***********************************

### UserName : lova 
### Password : lova

url : jdbc:h2:mem:testdb


Here is the Application Properties details 

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

server.port=9999

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.platform=h2
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always
spring.datasource.username=lova
spring.datasource.password=lova

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
