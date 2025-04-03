public class Task{

    // Classe é um modelo resumido do que eu queo criar, como se fosse a planta de uma casa 

    private int id; // Este é o id da task
    private String description; // Está é a descrição da tak
    private boolean completed;  // Este é o estado da task, representar se a task está concluída ou não

    //O método construtor utiliza o valor de igual, eu sei que ele é construtor pois tem o mesmo nome da miha classe e é público.
    
    public Task(int id, String description){ // Este id é uma variável criada dentro do bloco.
    this.id = id;  //Acessse o atributo da minha classe 
    this.description = description; //Marca como concluído ou não "O estado"
    this.completed = false;

    }

    //get id: Vai retornar o valor do atributo, ele é encapsulado e private

    public int getId(){

        return this.id; // Usa o return para retornar o atributo id
    }

    public String getDescription(){

        return this.description;
    }

    public boolean isCompleted(){ //Toda vez que ver um is na frente significa verdadeiro ou falso

        return this.completed;
    }

    public void makCompleted(){ // O void também faz a atribuição de um valor, por isso pode também ser conhecido como set
        
        this.completed = true;

    }

    //Overrigth eu estou sobreecrevendo

    @override
    public String toString(){

        return "Tarefa: id" + id + "\n" + "Descrição: " + description + "\n" + "Completa: " + completed;
    }



    }



