
# Spring Data JPA Relationships

This project demonstrates the implementation of different types of relationships in Spring Data JPA. The relationships covered include One-to-One, One-to-Many, and Many-to-Many. This example utilizes Spring Boot and Spring Data JPA for ORM and database interactions.

## Features

- **One-to-One**: Establishes a one-to-one relationship between two entities.
- **One-to-Many**: Manages a one-to-many relationship between entities.
- **Many-to-Many**: Sets up a many-to-many relationship with Spring Data JPA.

## Technologies Used

- **Spring Boot**: Simplifies the setup and configuration of Spring applications.
- **Spring Data JPA**: Simplifies data access and object-relational mapping.
- **Hibernate**: ORM framework for database interaction.
- **H2 Database**: In-memory database for development and testing purposes.


<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    
    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <!-- H2 Database for Development -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    
    <!-- Spring Boot Starter Test (JUnit, Mockito, etc.) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Getting Started

To run this project locally:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Medrhz/spring-data-jpa-relationships-v2.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd spring-data-jpa-relationships-v2
   ```
3. **Build the Project**: Use Maven to build the project.
   ```bash
   ./mvnw clean install
   ```
4. **Run the Application**: Start the application using your preferred IDE or command line.
   ```bash
   ./mvnw spring-boot:run
   ```

## Project Structure

- **src/main/java**: Contains the main Java source files.
- **src/main/resources**: Contains application configuration files.
- **.mvn/wrapper**: Maven Wrapper files.
- **pom.xml**: Project Object Model file for Maven dependencies.
- **mvnw & mvnw.cmd**: Maven Wrapper scripts for Unix and Windows.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

