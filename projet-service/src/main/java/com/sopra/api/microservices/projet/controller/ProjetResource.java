package com.sopra.api.microservices.projet.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;

/**
 * Ressource permettant de récupérer les informations des projets
 *
 * @author mohamed
 */
@RestController
@RequestMapping("/api")
public class ProjetResource {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String findClients() {
        return "Hello World !!";
    }

}
