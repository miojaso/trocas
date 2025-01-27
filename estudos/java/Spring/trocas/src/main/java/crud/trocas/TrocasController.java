package crud.trocas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.http.ResponseEntity.status;


@RestController
@RequestMapping("/")
public class TrocasController {

    @Autowired
    public TrocasSeila Repositorio;

    @GetMapping
    public ResponseEntity<Produtos> Brioco(){
        var Smoking = Repositorio.findAll();
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
