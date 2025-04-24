# Spring Boot application template
Spring Boot application template implementing the command layer based on the design pattern Command.

## Purpose
The purpose of this template is to speed up the creation of new Spring Boot applications.

## Structure command layer in application
```
my-project
├─ org.example.application
│  ├─ api
│  ├─ controller
│  │
│  ├─ command
│  │  ├─ core
│  │  │  └─ AbstractCommand.java
│  │  │
│  │  ├─ common
│  │  │  ├─ Command.java
│  │  │  ├─ CommandSupport.java
│  │  │  └─ CommandContext.java
│  │  │
│  │  ├─ user (my command package for example)
│  │  ├─ ... 
│  │  └─ ...
│  │
│  ├─ dao
│  ├─ ... 
```