public class Aluno extends Pessoa{  //extends é a herança na pratica
    
 //na Herança

// a classe filho é uma extensão da classe pai, "EXTENDS" outro nome para herença, os recursos que podem ser usados é atributos e métodos

private int ra;
private double nota;


public Aluno(String nome, int idade, double altura, String email, int ra){ // são atributos obrigatórios
 
    super(nome, idade, altura, email);  //construtor da classe Pessoa, está herdando os atributos da classe "Pessoa"
                                       //Construtor da classe pessoa, construtor da classe que você vai herda. Chamo a classe principal, estou herdando os atributos
  this.ra = ra;
  this.nota = 0.0;


}


public int getRa() {
    return ra;
}


public void setRa(int ra) {
    this.ra = ra;
}


public double getNota() {
    return nota;
}


public void setNota(double nota) {
    this.nota = nota;
}


public void exibirDados(){
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Altura: " + getAltura());
    System.out.println("Email: " + getEmail());
    System.out.println("RA: " + ra);
    System.out.println("Nota: " + nota);


}




}







// porque podemois chamar o construtor do Professor da classe aluno aqui? porque ela herda, porque é uma herença



 // A classe filho é uma extensão da classe pai, os recursos são os atributos e métodos

    //Porque pode chamar o construtor do professor na classe aluno, só posso chamar porque aluno herda. Porque a uma herança


    