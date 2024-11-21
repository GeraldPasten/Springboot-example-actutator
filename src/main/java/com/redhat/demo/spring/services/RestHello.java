package com.redhat.demo.spring.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHello {

     // Definimos un logger para la clase
    private static final Logger logger = LoggerFactory.getLogger(RestHello.class);


    @GetMapping("/hello") 
    public String greetings() {
        // Agregamos un log informativo al iniciar la operación
        logger.info("Endpoint /hello fue invocado");

        String response = "GilBertooo";

         // Agregamos un log de depuración con la respuesta
         logger.debug("Respuesta generada: {}", response);


        return response;

    }

}
