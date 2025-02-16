package crud.trocas;

import com.mysql.cj.x.protobuf.Mysqlx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@Controller
public class TrocasController {

    @Autowired
    public TrocasService Service;

    @Autowired
    public TrocasSeila repositorio;

    @GetMapping("/principal")
    public String index(Model model){
        List<Produtos> produtos = Service.GetProducts();
        model.addAttribute("produtos",produtos);
        return "index";
    }

    @GetMapping("/{id}")
    public String peido(){
        return "produto-pag";
    }

    @GetMapping("/criar")
    public String index2(Model model){
        model.addAttribute("Produtos", new Produtos());
        return "index2";
    }


    @PostMapping("/criar/salvar")
    public String fon(@ModelAttribute("Produtos") Produtos produtos){
        Service.add(produtos);
         return "redirect:/principal";
    }
}