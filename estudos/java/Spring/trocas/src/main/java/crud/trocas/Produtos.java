package crud.trocas;

import jakarta.persistence.*;

@Entity
@Table(name="Produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    public Long GetId(){
        return id;
    }

    public void SetId(Long id){
        this.id = id;
    }


    @Column(name="NomeDoProduto")
    private String NomeDoProduto;

    public void SetNomeDoProduto(String nameofproduct){
        this.NomeDoProduto = nameofproduct;
    }

    public String GetNomeDoProduto(){
        return NomeDoProduto;
    }


    @Column(name="Descricao")
    private String Desejo;

    public void SetDesejo(String wish){
        this.Desejo = wish;
    }

    public String GetDesejo(){
        return Desejo;
    }
}
