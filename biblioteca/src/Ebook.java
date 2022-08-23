public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }

    public String getWaterMark(){
        return waterMark;
    }

    
    @Override
    void aplicaDesconto(Double porcentagem) {
        if (porcentagem > 0.35){
            System.out.println("O desconto não pode passar de 35%");
        }
		this.setValor(this.getValor() - this.getValor() * porcentagem);
	}

    public String toString(){
        return this.getNome();
    }
    
}
