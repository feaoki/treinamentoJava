package br.paduan.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class SampleController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> getHello(){
        return ResponseEntity.ok("Meu primeiro app Spring!");
    }

    @GetMapping("/versao")
    public ResponseEntity<String> getVersao(){
        return ResponseEntity.ok("versao 0.1");
    }

}
