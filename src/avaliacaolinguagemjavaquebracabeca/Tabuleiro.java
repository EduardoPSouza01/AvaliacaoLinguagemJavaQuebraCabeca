
package avaliacaolinguagemjavaquebracabeca;

public class Tabuleiro {
    private Peca [][] grid;
    private int linha;
    private int coluna;
           
    public Tabuleiro(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.grid = new Peca[linha][coluna];
    }
    
    public boolean adicionarPeca(Peca peca, int linha, int coluna){

        if (linha < 0 || linha >= linha || coluna < 0 || coluna >= coluna) {
            System.out.println("Posição inválida!");
            return false;
        }   
        
        if(grid[linha][coluna] != null){
            System.out.println("\"Espaço já ocupado!");
            return false;
        }
        
        if(verificarEncaixe(peca, linha, coluna)){
            grid[linha][coluna] = peca;
            return true;
        }
        
        System.out.println("Não é possível encaixar a peça na posição (" + linha + ", " + coluna + ").");
        return false;
            
    }
    
    private boolean verificarEncaixe(Peca peca, int linha, int coluna){
        boolean encaixa = true;
        if (linha > 0 && grid[linha - 1][coluna] != null) {
            encaixa &= peca.encaixa(grid[linha - 1][coluna], "superior");
        }
        
        if (linha < linha - 1 && grid[linha + 1][coluna] != null) {
            encaixa &= peca.encaixa(grid[linha + 1][coluna], "inferior");
        }
        
        if(coluna > 0 && grid[linha -1 ][coluna] != null){
            encaixa &= peca.encaixa(grid[linha-1][coluna], "esquerda");
        }
        
        if(linha < linha -1 && grid[linha +1] [coluna] != null){
            encaixa &= peca.encaixa(grid[linha +1 ][coluna], "direita");
        }
        
        return true;
        
    }
    
}
