
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
            System.out.println("Posicao invalida");
            return false;
        }   
        
        if(grid[linha][coluna] != null){
            System.out.println("Espaco ja ocupado");
            return false;
        }
        
        if(verificarEncaixe(peca, linha, coluna)){
            grid[linha][coluna] = peca;
            return true;
        }
        
        System.out.println("Nao e possível encaixar a peca na posicao (" + linha + ", " + coluna + ")");
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
        
        return encaixa;
        
    }
    
    public void exibirTabuleiro() {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (grid[i][j] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[" + grid[i][j].getId() + "} ");
                }
            }
            System.out.println();
        }
    }
    
}
