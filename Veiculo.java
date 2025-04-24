public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;

    public Veiculo(String marca, String modelo, int ano, double combustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.motorLigado = false;
        this.combustivel = combustivel;
    }

    public Veiculo(){
        System.out.println("Construtor padrão");
    }

    public boolean getMotorLigado(){
        return this.motorLigado;
    }

    public void setvelocidadeAtual(){
        this.velocidadeAtual += velocidadeAtual;
    }

    public void motorLigado(){
        if(!this.motorLigado){
            this.motorLigado = true;
            System.out.println("Motor Ligado");
        } 
        else{
            System.out.println("O motor já está ligado");
        }
    }

    public void desligarMotor(){
        if(this.motorLigado){
            this.motorLigado = false;
            this.velocidadeAtual = 0;
            System.out.println("Seu motorestá desligado");
        } 
        else{
            System.out.println("Seu motor já está ligado");
        }
    }

    public void acelerar(){
        if(this.motorLigado && this.combustivel >= 1){
            this.motorLigado = true;
            this.velocidadeAtual += 10;
            this.combustivel -= 0.10;
            System.out.println("Sua velocidade atual é: " + this.velocidadeAtual + "km/h");
        }
        else if (!this.motorLigado && this.combustivel >= 1){
            System.out.println("Motor está desligado");
        }
        else if(!this.motorLigado && this.combustivel <= 0){
            this.motorLigado = true;
            System.out.println("Você está sem combustível");
        }
        else{
            System.out.println("Seu motor está desligado, e seu combustível acabou");
        }
    }

    public void frear(){
        if(this.motorLigado){
            if(this.velocidadeAtual > 0){
                this.velocidadeAtual -= 10;
                if(this.velocidadeAtual < 0){
                  }
             System.out.println("Está parando");
                }
                else{
                    System.err.println("Já está parado");
                }
    
                            } else {  System.err.println("Já está parado");
                }
            }
        public void exibirInfo(){
            System.out.println("Sua marca é: " + this.marca);
            System.out.println("Seu modelo é " + this.modelo);
            System.out.println("Seu ano é: " + this.ano);
            System.out.println("Sua velocidade atual é: " + this.velocidadeAtual);
            System.out.println("Seu motor está ligado?" + this.motorLigado);
            System.out.println("Você tem: " + this.combustivel + "de combustível no seu veículo");
        }

        public void abastecer(double combustivel){
            if(this.velocidadeAtual <= 0){
                if(!this.motorLigado){
                    this.combustivel += combustivel;
                    System.out.println("Foi abastecido com: " + combustivel + "Litros!");
                }
                else{
                    System.out.println("Desligue seu motor");
                }
            } else{
                System.out.println("O veículo já está parado");
            }
        }

        public double statusCombustivel(){
            return this.combustivel;
        }
    }
