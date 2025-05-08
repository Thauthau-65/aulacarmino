public class Main {
    
    public static void main(String[] args) {
    
        Aluno aluno = new Aluno("Luiza", 18, 1.67, "luizakusma2@gmail.com", 82510675);
        Professor professor = new Professor( "Danilo", 39, 1.80, "danilo@ulife.com.br", 221214);
        Coordenador coordenador = new Coordenador("Carmino", 50, 1.80, "carmino01@ulife.com.br", 151515);


        aluno.exibirDados();  // se não colocar para exibir dados ele não vai mostar nada
        professor.exibirDados();
        coordenador.exibirDados();
        
        
        
        }
        
        
        // sobrecarga consiste na redefinição de itens já existentes, ele permite que sejam definidas duas ou mais funções com o mesmo nome, desde que sua lista de argumentos sejam diferentes 
        // sobrecarga de método permite a existência de vários métodos de mesmo nome, contando que as assinaturas sejam diferentes, variando em "NÚMERO", "TIPO de ARGUMENTOS", "VALOR DE RETORNO" e até "VARIÁVEIS diferentes".
    
        // sobrescrita ou @Override, está relacionada a Orientação a Objetos, mais especificamente com a Herança.
        // com a sobrescrita podemos especializar métodos herdados das superclasse, alterando seu comportamento nas subclasses por um mais específico 
        // ela basicamente cria um novo método na classe filha contendo a mesma assinatura e o mesmo tipo de retorno do método sobrescrito
















}