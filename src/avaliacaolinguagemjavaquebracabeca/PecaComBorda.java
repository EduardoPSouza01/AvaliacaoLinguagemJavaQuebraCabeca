
package avaliacaolinguagemjavaquebracabeca;

public class PecaComBorda extends Peca{
    
    private String bordaSuperior;
    private String bordaInferior;
    private String bordaEsquerda;
    private String bordaDireita;
    
    public PecaComBorda(int id, String bordaSuperior, String bordaInferior, String bordaEsquerda, String bordaDireita){
        super (id);
        this.bordaDireita = bordaDireita;
        this.bordaEsquerda = bordaEsquerda;
        this.bordaInferior = bordaInferior;
        this.bordaSuperior  = bordaSuperior;
    }
    
    public String getBorda(String lado){
        switch(lado.toLowerCase()){
            case "esquerdo":
                return bordaEsquerda;
            case "direito":
                return bordaDireita;
            case "inferior":
                return bordaInferior;
            case "superior":
                return bordaSuperior;
            default:
                return null;
        }   
    }
            
    @Override
    public boolean encaixa(Peca outra, String lado) {
        
       if (outra instanceof PecaComBorda outraPeca) {
            switch (lado.toLowerCase()) {
                case "superior":
                    return this.bordaSuperior.equals(outraPeca.getBorda("inferior"));
                case "inferior":
                    return this.bordaInferior.equals(outraPeca.getBorda("superior"));
                case "esquerda":
                    return this.bordaEsquerda.equals(outraPeca.getBorda("direita"));
                case "direita":
                    return this.bordaDireita.equals(outraPeca.getBorda("esquerda"));
            }
        }
        return false;
    }
}
