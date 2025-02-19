package crud.trocas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.module.FindException;
import java.sql.SQLException;
import java.util.List;

@Service
public class TrocasService{

    @Autowired
    public TrocasSeila repositorio;

    public List<Produtos> GetProducts() {
       return repositorio.findAll();
    }



    //caso o #butao seja apertado, o post vem
    public Produtos add(Produtos produto){
        return repositorio.save(produto);
    }



}