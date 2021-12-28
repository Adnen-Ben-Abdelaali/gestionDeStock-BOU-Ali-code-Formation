package com.bouali.gestiondestock.config;

import springfox.documentation.swagger2.annotations.*;
import springfox.documentation.spring.web.plugins.*;
import springfox.documentation.spi.*;
import java.util.*;
import springfox.documentation.builders.*;
import org.springframework.context.annotation.*;
import springfox.documentation.spi.service.contexts.*;
import springfox.documentation.service.*;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration
{
    public static final String AUTHORIZATION_HEADER = "Authorization";
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfoBuilder().description("Gestion de stock API documentation").title("Gestion de stock REST API").build()).groupName("REST API V1").securityContexts((List)Collections.singletonList(this.securityContext())).securitySchemes((List)Collections.singletonList(this.apiKey())).useDefaultResponseMessages(false).select().apis(RequestHandlerSelectors.basePackage("com.bouali.gestiondestock")).paths(PathSelectors.any()).build();
    }
    
    private ApiKey apiKey() {
        return new ApiKey("JWT", "Authorization", "header");
    }
    
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences((List)this.defaultAuth()).build();
    }
    
    List<SecurityReference> defaultAuth() {
        final AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        final AuthorizationScope[] authorizationScopes = { authorizationScope };
        return Collections.singletonList(new SecurityReference("JWT", authorizationScopes));
    }
}