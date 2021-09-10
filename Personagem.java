package aula2;
public class Personagem {
    private Integer vidas;
    private Integer qtdMoedas;
    private String nome;
    private Integer idade;
    private Integer stamina;
    private String corPele;
    private Double altura;
    private Double alturaSalto;
    private String corCabelo;
    private String corCamisa;
    private String corMacacao;
    private String corBone;
    private String corLuvas;
    private String corSapatos;
    private String ocupacao;
    private Boolean estrela;
    private Boolean flor;
    private Boolean pena;
    private Boolean cogumelo;

    public Personagem(Integer moeda, String nome, Integer idade,Integer stamina, Double altura, Integer vida) {
        
        this.qtdMoedas = moeda;
        this.vidas = vida;
        this.nome = nome;
        this.idade = idade;
        this.stamina = stamina;
        this.altura = altura;   
        this.corCabelo ="Preto";
        this.corPele = "Moreno";
        this.corCamisa = "Vermelha";
        this.corMacacao = "Azul";
        this.corBone = "Vermelho";
        this.corLuvas = "Brancas";
        this.corSapatos = "Brancos";
        this.ocupacao = "Mecânico";
        this.estrela = false;
        this.flor = false;
        this.pena = false;
        this.cogumelo = false;
    }          
    
    public void saltar(){
        
        if(this.nome == "Mario"){
            
            this.alturaSalto = this.altura / 2;
        
        }else if(this.nome == "Luigi"){
            
            this.alturaSalto = this.altura + (this.altura * 2);
        
        }
        
        System.out.println(this.nome + " Salta a uma altura de " + this.alturaSalto);
       
    
    }
    void caracteristicas(){
        
        System.out.println("Número de vidas: " + this.vidas);
        System.out.println("O mario tem " + this.qtdMoedas + " moeda(as)");
        System.out.println("Seu nome é: " + this.nome);
        System.out.println("O valor da stamina é: " + this.stamina);
        System.out.println("Sua idade é: " + this.idade);
        System.out.println("A cor da pele é: " + this.corPele);
        System.out.println("A sua altura é: " + this.altura);
        System.out.println("A cor do cabelo é: " + this.corCabelo);
        System.out.println("A cor da camisa é: " + this.corCamisa);
        System.out.println("A cor do macacão é: " + this.corMacacao);
        System.out.println("A cor do boné é: " + this.corBone);
        System.out.println("A cor das luvas são: " + this.corLuvas);
        System.out.println("A cor dos sapatos é: " + this.corSapatos);
        System.out.println("Sua ocupação é: " + this.ocupacao);
        if(this.estrela == true){
            
            System.out.println("O mario está invencível.");
        
        } 
        if(this.cogumelo == true){
        
            System.out.println("O mario ficou grande.");
        }
        if(this.pena == true){
        
            System.out.println("O mario pode voar.");
        }
    }
    
    public void ganharMoedas(){
        
        
        this.qtdMoedas = qtdMoedas +1;
       
       if(this.qtdMoedas % 10 == 0){
           
           this.vidas = vidas +1;
       
       } 
    
    }
    
    public void morrer(){
    
        this.stamina = 0;
        this.vidas = vidas -1;
        
        if(this.vidas < 0){
            
            this.stamina = 0;
            this.vidas = 0;
        
        }else if(this.vidas >= 0){
        
            this.stamina = 100;
        
        }
        
    }
    
    public void revigorar(){
        
        this.stamina = 100;       
    
    }
    public void invencivel(){
    
        this.estrela = true;
    
    }
    
    public void acabouInvencibilidade(){
    
        this.estrela = false;
    
    }   
        
    public void crescer(){
    
        this.cogumelo = true;        
                            
    }
    
    public void pegarPena(){
    
        this.pena = true;
    
    }
    public void perderStamina(){
      
        this.stamina = stamina - 10;
        if(this.stamina < 0){
            this.stamina = 0;
            System.out.println("Mario morreu");
        }
    
    }
    
    public void ganharStamina(){
    
        this.stamina = stamina + 5;
        if(stamina > 100){
            stamina = 100;
            System.out.println("Stamina chegou ao maximo");
        }
    
    }

    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }

    public Integer getQtdMoedas() {
        return qtdMoedas;
    }

    public void setQtdMoedas(Integer qtdMoedas) {
        this.qtdMoedas = qtdMoedas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(Double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getCorCamisa() {
        return corCamisa;
    }

    public void setCorCamisa(String corCamisa) {
        this.corCamisa = corCamisa;
    }

    public String getCorMacacao() {
        return corMacacao;
    }

    public void setCorMacacao(String corMacacao) {
        this.corMacacao = corMacacao;
    }

    public String getCorBone() {
        return corBone;
    }

    public void setCorBone(String corBone) {
        this.corBone = corBone;
    }

    public String getCorLuvas() {
        return corLuvas;
    }

    public void setCorLuvas(String corLuvas) {
        this.corLuvas = corLuvas;
    }

    public String getCorSapatos() {
        return corSapatos;
    }

    public void setCorSapatos(String corSapatos) {
        this.corSapatos = corSapatos;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Boolean getEstrela() {
        return estrela;
    }

    public void setEstrela(Boolean estrela) {
        this.estrela = estrela;
    }

    public Boolean getFlor() {
        return flor;
    }

    public void setFlor(Boolean flor) {
        this.flor = flor;
    }

    public Boolean getPena() {
        return pena;
    }

    public void setPena(Boolean pena) {
        this.pena = pena;
    }

    public Boolean getCogumelo() {
        return cogumelo;
    }

    public void setCogumelo(Boolean cogumelo) {
        this.cogumelo = cogumelo;
    }

  
}
