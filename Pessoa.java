public class Pessoa{

    private String nome;   //isso está encapsulado, privado
    private int idade;
    private double altura;
    private String email;



    public Pessoa(String nome, int idade, double altura, String email){  
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.email = email;      // "THIS" faz referencia a classe, ele diferencia parametros de atributos da classe, ele pega o contexto da classe, ele diz "isso aqui"
                                // ele faz referencia  ao atributos dessa classe, da classe Pessoa 
    }
   


    
  public String getNome() {
        return nome;
    }







    public void setNome(String nome) {
        this.nome = nome;
    }







    public int getIdade() {
        return idade;
    }







    public void setIdade(int idade) {
        this.idade = idade;
    }







    public double getAltura() {
        return altura;
    }







    public void setAltura(double altura) {
        this.altura = altura;
    }







    public String getEmail() {
        return email;
    }







    public void setEmail(String email) {
        this.email = email;
    }







  


}

// construtor é um método para INICIALIZAR um OBJETO, que pode estar declarado ou não declarado,  " Pessoa pessoa = new pessoa" o último pessoa é o construtor, eu uso "new" para instanciar=criar uma classe


// como eu encapsulei essa classe com os modificadores private, eu preciso usar o "GET E O SET" para acessar as informações, para acessar os atributos eu preciso utilizar os modificadores de acesso