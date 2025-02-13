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

    public String getNomeDoProduto() {
        return NomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.NomeDoProduto = nomeDoProduto;
    }


    @Column(name="Descricao")
    private String Descricao;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }


    @Column(name="Desejo")
    private String Desejo;


    public String getDesejo() {
        return Desejo;
    }

    public void setDesejo(String desejo) {
        this.Desejo = desejo;
    }

}
