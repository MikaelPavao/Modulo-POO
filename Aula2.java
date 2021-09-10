package aula2;

public class Aula2 { 
    public static void main(String[] args) {
        Personagem mario = new Personagem(0 , "Mario", 50 , 100 , 1.50 , 1);
        Personagem luigi = new Personagem(0 , "Luigi", 50 , 100 , 1.60 , 1);
        
          
        Jogo jg = new Jogo(mario,luigi);
        
       
        jg.jogar();
       
    }      
}
