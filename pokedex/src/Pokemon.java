public class Pokemon{

    private String Nome;
    private Integer Codigo;

    public void setNome(String nome){
        this.Nome = nome;
    }
    public String getNome(){
        return Nome;
    }

    public void setCodigo(Integer cod){
        this.Codigo = cod;
    }
    public Integer getCodigo(){
        return Codigo;
    }
}