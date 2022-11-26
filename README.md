# JKFramework-Service Example
_Last updated: 2022-11-26_

This repository contains a _JKFramework-Microservice_ to create a simple microservice.

## Prerequisites:
- JDK 17+ Installed

## Usage:
1. Clone the repository
2. Import as Java project into your favorite IDE (we use _SpringToolSuite_ and _Eclipse-JavaEE_)
3. Run `App` class.

## Project Main Contents 
The repository  contains the following main contents: 
1. Maven project with [pom.xml](pom.xml)
  > :page_facing_up:*Note*: If you are using Eclipse, be sure to refresh your project (select your project→ right click→ Maven→ Update Project)
2. [Model class](src/main/java/com/app/person/Model.java) which is contains the model fields.
3. [Controller]((src/main/java/com/app/person/Controller.java) which contains the rest controller end points  
4. [App class](src/main/java/com/app/App.java) the startup class in addition of being `RestApp config`

