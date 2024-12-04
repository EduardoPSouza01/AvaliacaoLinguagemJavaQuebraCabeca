
package avaliacaolinguagemjavaquebracabeca;


public class AvaliacaoLinguagemJavaQuebraCabeca {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(3, 3);

        Peca peca1 = new PecaComBorda(1, "A", "B", "C", "D");
        Peca peca2 = new PecaComBorda(2, "B", "X", "D", "Y");
        Peca peca3 = new PecaComBorda(3, "X", "Z", "Y", "W");

        tabuleiro.adicionarPeca(peca1, 0, 0);
        tabuleiro.adicionarPeca(peca2, 1, 0);
        tabuleiro.adicionarPeca(peca3, 2, 0);

        tabuleiro.exibirTabuleiro();
    }
    
}
