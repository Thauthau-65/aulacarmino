public class Coordenador extends Pessoa {
    

public Coordenador (String nome, int idade, double altura, String email, int matricula){
  
    super(nome, idade, altura, email);
this.matricula = matricula;
}

private int matricula;

public int getMatricula() {
    return matricula;
}

public void setMatricula(int matricula) {
    this.matricula = matricula;
}
 
public void exibirDados(){
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Altura: " + getAltura());
    System.out.println("Email: " + getEmail());
    System.out.println("RA: " + matricula);

}
  












}