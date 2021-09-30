package com.github.tresnelsonjunior.curso.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/teste")
public class TesteController {

    @GetMapping("/vs")
    public ResponseEntity<String> Get() {
        return ResponseEntity.ok("Teste Visual Studio");
    }
    
}
