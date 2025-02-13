package crud.trocas;

public class TrocasDTO{

    private String Desejo;
    private String NomeDoProduto;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNomeDoProduto() {
        return NomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        NomeDoProduto = nomeDoProduto;
    }

    public String getDesejo() {
        return Desejo;
    }

    public void setDesejo(String desejo) {
        Desejo = desejo;
    }


}
