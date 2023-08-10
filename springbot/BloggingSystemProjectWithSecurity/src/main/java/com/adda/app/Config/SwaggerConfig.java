package com.adda.app.Config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;


@Configuration
//@EnableSwagger2
public class SwaggerConfig {
//	public  static final String AUTHORIZATION_HEADER="Authorization";
//	
//	
//	/**Api Keys*/
//	private ApiKey apikeys() 
//	{
//		return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
//	}
//	
//	
//	/**Security Contexts...*/
//	
//	private List<SecurityContext> securityContexts1()
//	{
//		return Arrays.asList(SecurityContext.builder().securityReferences(sf()).build());
//	}
//	
//	private List<SecurityReference>sf()
//	{
//		AuthorizationScope scope = new AuthorizationScope("globle", "AccesseEverything");
//		return Arrays.asList(new SecurityReference("JWT",new AuthorizationScope[] {scope}));
//	}
//	
//	@Bean
//	public Docket createDoket() 
//	{
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.adda.app"))
//				//.paths(PathSelectors.any())
//				.paths(PathSelectors.regex("/api.*"))
//				.build()
//				.pathMapping("/")
//				.apiInfo(apiInfo())
//		       .securityContexts(securityContexts1())
//		       .securitySchemes(Arrays.asList(apikeys()));
//		
//	}
//
//	
//	private ApiInfo apiInfo() {
//		// TODO Auto-generated method stub
//		return new ApiInfo("STUDENT APP", 
//				"SAMPLE APP", 
//				"3.2GA", 
//				"http://sample.com", 
//				new Contact("KAMAL", "http://dollopinfotech.com", "dollopinfotech@gmail.com"), 
//				"APACHE", 
//				"http://apache.com", 
//				Collections.emptyList());
//	
//	}

	private SecurityScheme createAPIKeyScheme() {
	    return new SecurityScheme().type(SecurityScheme.Type.HTTP)
	        .bearerFormat("JWT")
	        .scheme("bearer");
	}
	@Bean
	public OpenAPI openAPI() {
	    return new OpenAPI().addSecurityItem(new SecurityRequirement().
	            addList("Bearer Authentication"))
	        .components(new Components().addSecuritySchemes
	            ("Bearer Authentication", createAPIKeyScheme()))
	        .info(new Info().title("My REST API")
	            .description("Some custom description of API.")
	            .version("1.0").contact(new Contact().name("Sallo Szrajbman")
	                .email( "www.baeldung.com").url("salloszraj@gmail.com"))
	            .license(new License().name("License of API")
	                .url("API license URL")));
	}
}
