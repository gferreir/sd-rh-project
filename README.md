# PROJECT "FÁBRICA DE SONHOS" 1.0

FÁBRICA DE SONHOS is a *maven-servlet web CRUD application.* The CRUD cycle describes the elemental functions of a persistent database. CRUD stands for Create, Read, Update and Delete.

## Description

FÁBRICA DE SONHOS was developed in Java EE and will run in a **Red Hat JBoss application platform (EAP)**.

The purpose of this application is to persisting a data in a database (PostgreSQL).

The application will generate a web page that will have an interface which a product can be added, read, updated and deleted.

### Requirements
* Java 8

You can check the java version with the command below

` $ java -version`

You can also download the OracleJDK

[Download](https://www.makeareadme.com/)

* Apache Maven 3.5x

You can check the maven version with the command below

` $ mvn -version`

You can also download the OracleJDK

[Download](https://maven.apache.org/download.cgi)

* PostgreSLQ server

You can also download 

[Download](https://www.postgresql.org/download/)

* JDBC connector

You can also download 

[Download](https://jdbc.postgresql.org/download.html)

* Red Hat JBoss Application Platform 6.4.x or above
* Linux environment

## PostgreSQL Datasource in JBoss EAP

We need configurate the non-xa datasource on JBoss EAP.

* Add the PostgreSQL JDBC driver as a core module.

` $ module add --name=com.postgresql --resources=/path/to/postgresql-9.3-1102.jdbc4.jar --dependencies=javax.api,javax.transaction.api `

* Register the PostgreSQL JDBC driver.

` $ /subsystem=datasources/jdbc-driver=postgresql:add(driver-name=postgresql,driver-module-name=com.postgresql,driver-xa-datasource-class-name=org.postgresql.xa.PGXADataSource) `

* Add the PostgreSQL datasource.

` $ data-source add --name=fabricadesonhos --jndi-name=java:jboss/fabricadesonhos --driver-name=postgresql --connection-url=jdbc:postgresql://localhost:5432/fabricadesonhos --user-name=fabricadesonhos --password=1234 --validate-on-match=true --background-validation=false --valid-connection-checker-class-name=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLValidConnectionChecker --exception-sorter-class-name=org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLExceptionSorter `



### How to execute the application

* Your EAP should first be started in standalone mode.

` $ EAP_HOME/bin/standalone.sh`

* Clone the repository

` $ git clone https://github.com/gferreir/sd-rh-project.git`

* Go to the directory

` $ cd sd-rh-project`

* Run the Maven (JBoss EAP 6.4.x)

` $ mvn package `

` $ mvn jboss-as:deploy`

* Run the Maven (JBoss EAP 7.x)

` $ mvn package `

` $ mvn wildfly:deploy`

After running the maven command, the application will be deployed in EAP

* Go to URL application

http://localhost:8080/fabricadesonhos/ 
