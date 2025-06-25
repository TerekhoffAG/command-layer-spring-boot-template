# Шаблон приложения с использованием Spring Boot 3.х 
Шаблон приложения Spring Boot, реализующий командный слой на основе шаблона проектирования Command (Команда).

## Назначение
Цель этого шаблона — ускорить создание новых приложений с использованием Spring Boot.

## Структура командного слоя в приложении
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

## Стек технологий
![Java](https://badgen.net/badge/Java/17+/orange)
![Java Spring Boot](https://badgen.net/badge/Spring%20Boot/3.4.4/green)
![Liquibase](https://badgen.net/badge/Liquibase/4.32.0/purple)
![Gradle](https://badgen.net/badge/build/Gradle/cyan)
