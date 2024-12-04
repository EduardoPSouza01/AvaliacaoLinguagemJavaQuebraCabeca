
package avaliacaolinguagemjavaquebracabeca;

abstract class Peca {
    private int id;
    
    public Peca(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }  
    public abstract boolean encaixa(Peca outra, String lado);    
}
