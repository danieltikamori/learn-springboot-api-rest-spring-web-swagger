//package cc.tkmr.learnspringbootapirestspringwebswagger.doc;
//
//import io.swagger.v3.oas.models.info.Contact;
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//    private Contact contact() {
//        return new Contact(
//        );
//    }
//
//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("public-api")
//                .packagesToScan("cc.tkmr.learnspringbootapirestspringwebswagger.controller") // Your controller package
//                .pathsToMatch("/api/**")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi adminApi() {
//        return GroupedOpenApi.builder()
//                .group("admin-api")
//                .packagesToScan("cc.tkmr.learnspringbootapirestspringwebswagger.controller") // Your controller package
//                .pathsToMatch("/admin/**")
//                .addOpenApiMethodFilter(method -> method.getName().contains("admin-api")) // Modify the filter!!!
//                .build();
//    }
//}
