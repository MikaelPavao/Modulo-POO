package aula2;

import java.util.Random;

public class Jogo{
    private Personagem jogador1;
    private Personagem jogador2;  
    private int j1 = 0; 
    private int j2 = 0; 

    public Jogo(Personagem jogador1, Personagem jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

  
    
    public void dadosJogador(){
        System.out.println("O nome do jogador 1 é " + this.jogador1.getNome());
        System.out.println("A quantidade de moedas é " + this.jogador1.getQtdMoedas());
        System.out.println("--------------------------------------");
        System.out.println("O nome do jogador 2 é " + this.jogador2.getNome());
        System.out.println("A quantidade de moedas é " + this.jogador2.getQtdMoedas());
    
    }
    
    public void jogar(){
        
        Random aleatorio = new Random();
            
        int qtdJogador1 = aleatorio.nextInt(30);
        for(int i = 0; i < qtdJogador1; i++){
            
            this.jogador1.ganharMoedas();            
                       
            System.out.println("------=======------");
            System.out.println("Quantidade de vida que o jogador 1 tem: " + this.jogador1.getVidas());            
            System.out.println("Quantidade de moedas que o jogador 1 coletou: " + this.jogador1.getQtdMoedas());
                            
        }
        
        int qtdJogador2 = aleatorio.nextInt(30);
        for(int i = 0; i < qtdJogador1; i++){
        
            this.jogador2.ganharMoedas();
            
            System.out.println("------=======------");
            System.out.println("Quantidade de vida que o jogador 2 tem: " + this.jogador2.getVidas());            
            System.out.println("Quantidade de moedas que o jogador 2 coletou: " + this.jogador2.getQtdMoedas());
        }
        
            System.out.println("----------==Fim de jogo==----------");
            System.out.println("Quantidade de vezes que o jogado 1 coletou moedas: " + qtdJogador1);
            System.out.println("As caracteristicas do jogador 1 é ");
            this.jogador1.caracteristicas();
            System.out.println("------------------------------------");
            System.out.println("Quantidade de vezes que o jogado 2 coletou moedas: " + qtdJogador2);
            System.out.println("As caracteristicas do jogador 2 é ");
            this.jogador2.caracteristicas();
            
    
    }

    public Personagem getJogador1() {
        return jogador1;
    }

    public void setJogador1(Personagem jogador1) {
        this.jogador1 = jogador1;
    }

    public Personagem getJogador2() {
        return jogador2;
    }

    public void setJogador2(Personagem jogador2) {
        this.jogador2 = jogador2;
    }

    public int getJ1() {
        return j1;
    }

    public void setJ1(int j1) {
        this.j1 = j1;
    }

    public int getJ2() {
        return j2;
    }

    public void setJ2(int j2) {
        this.j2 = j2;
    }

 
    
    
    
    
}
