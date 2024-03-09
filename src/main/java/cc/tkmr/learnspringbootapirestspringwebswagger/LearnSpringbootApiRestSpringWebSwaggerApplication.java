package cc.tkmr.learnspringbootapirestspringwebswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringbootApiRestSpringWebSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringbootApiRestSpringWebSwaggerApplication.class, args);
	}

}

// Create a new file in src/main/java/cc/tkmr/learnspringbootapirestspringwebswagger/controller
// Create a new controller class in cc.tkmr.learnspringbootapirestspringwebswagger.controller
// Create a new welcome() method in cc.tkmr.learnspringbootapirestspringwebswagger.controller
// Add @RestController annotation to the controller class
// Add @GetMapping annotation to the welcome() method

// Create a new file in src/main/java/cc/tkmr/learnspringbootapirestspringwebswagger/repository
// Create a new repository class in cc.tkmr.learnspringbootapirestspringwebswagger.repository
// Create a new findByUsername() method in cc.tkmr.learnspringbootapirestspringwebswagger.repository
// Create a new findById() method in cc.tkmr.learnspringbootapirestspringwebswagger.repository
// Create a new save() method in cc.tkmr.learnspringbootapirestspringwebswagger.repository
// Create a new deleteById() method in cc.tkmr.learnspringbootapirestspringwebswagger.repository
// Add @Repository annotation to the repository class

// Create a new file in src/main/java/cc/tkmr/learnspringbootapirestspringwebswagger/model
// Create a new User class in cc.tkmr.learnspringbootapirestspringwebswagger.model
// Create a new id property in cc.tkmr.learnspringbootapirestspringwebswagger.model
// Create a new login property in cc.tkmr.learnspringbootapirestspringwebswagger.model
// Create a new password property in cc.tkmr.learnspringbootapirestspringwebswagger.model
// Add @Entity annotation to the User class
// Add @Id annotation to the id property
// Add @Column annotation to the login property
// Add @Column annotation to the password property
// Add @Table annotation to the User class
// Add @Getter annotation to the User class
// Add @Setter annotation to the User class
// Add @ToString annotation to the User class
// Add @EqualsAndHashCode annotation to the User class
// Add @Builder annotation to the User class
// Add @AllArgsConstructor annotation to the User class
// Add @NoArgsConstructor annotation to the User class

// Create a new file in src/main/java/cc/tkmr/learnspringbootapirestspringwebswagger/controller/UserController.java

// Create a new file in src/main/java/cc/tkmr/learnspringbootapirestspringwebswagger/repository/UserRepository.java


// What is Swagger?
// Swagger is a RESTful API documentation tool for developers.

//See: https://springdoc.org/#getting-started
// Using Swagger 3 UI
// At pom.xml, add the following dependency (Spring boot 3):
//		<dependency>
//			<groupId>org.springdoc</groupId>
//			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
//			<version>2.3.0</version>
//		</dependency>

// IMPORTANT: Update the repository:
// Using Intellij IDEA: At pom.xml, at top right corner, click the button with Maven icon to update the repository and clear errors.

//For custom path Swagger UI:
// At src/main/resources/application.properties, add the following property:
// springdoc.swagger-ui.path=/swagger-ui

// Access through:
// http://localhost:8080/swagger-ui.html
// You can test your application with Swagger UI. No need to use external clients.

// OpenAPI description will be available at the following url for json format:
// http://server:port/context-path/v3/api-docs