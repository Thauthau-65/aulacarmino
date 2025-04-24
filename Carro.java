public class Carro {

    static int qtdportas;
    public static void main(String[] args) {

    Veiculo IX35 = new Veiculo();

    IX35.setAno(2018);

        //IX35.getAno();
    IX35.setModelo("IX35");
    
    IX35.setMarca("Hyundai");

    qtdportas = 4;

    //System.out.println("O ano do carro é " + IX35.getAno());
    //System.out.println("O modelo do carro é " + IX35.getModelo());
    //System.out.println("A marca do carro é " + IX35.getMarca());
    //System.out.println("A quantidade de porta do carro é " + qtdportas);
    
        IX35.exibirInfomações();

    }
                                //tem partida elétrica, colocar como atributo em moto
}                               // sedan tem teto solar
   