public class LivroFisico extends Livro {
    public LivroFisico(Autor autor){
        super(autor);
    }

    Double getTaxaimpressao(){
        return this.getValor() * 0.02;
    }
}
