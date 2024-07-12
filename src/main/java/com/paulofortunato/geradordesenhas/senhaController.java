package com.paulofortunato.geradordesenhas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Controle de requisição do método
@RestController
@RequestMapping("gerarsenha")
public class senhaController {
    
    @GetMapping("senha")
    public String senhaAleatória(String senha){ 
        GeradordeSenha geradordeSenha = new GeradordeSenha();
        senha = geradordeSenha.SenhaAleatória();
        return senha;

      }
}
