package crud.trocas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.module.FindException;
import java.sql.SQLException;

@Service
public class TrocasService{

    @Autowired
    public TrocasSeila repositorio;

    public ResponseEntity<Produtos> GetProducts() {
        var arte = repositorio.findAll();
        return ResponseEntity.status(200).build();
    }

    //caso o #butao seja apertado, o post vem
    public Produtos add(Produtos produto){
        return repositorio.save(produto);
    }


}