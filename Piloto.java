public class Piloto {

    private int qtdhorasvoo;
    private String piloto;

    public Piloto(String piloto){

    this.qtdhorasvoo = 0;
    this.piloto = piloto;
    
}

public void setPiloto(String piloto){
    this.piloto = piloto;
}

public String getPiloto(String piloto){
    return piloto;
}


public void adicionarHoras(int horas){

    if(horas > 0){
        this.qtdhorasvoo += horas;
    }

    
} 

public void imprimir(){

    System.out.println("O nome do piloto é " + piloto);
    System.out.println("A quantidade de horas de voo é " + qtdhorasvoo);
    if(qtdhorasvoo <= 200){

        System.out.println("Tipo: co-piloto");
    }
    else{
        System.out.println("Tipo: comandante");
    }
}
}
