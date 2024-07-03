package com.example.manajeroback.config;

import io.swagger.v3.oas.annotations.OpenAPI31;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("Skieur-project")
                .description("TP étude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        return new Contact().name("Equipe ASI II");
    }
}
