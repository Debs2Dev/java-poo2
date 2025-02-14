package exemplo;
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Marta", 31, "marta@gmail");
    
       pessoa.setNome("Marta");
       pessoa.setIdade( 30);
       pessoa.setEmail("marta@gmail.com");

       System.out.println("nome: " + pessoa.getNome());
       System.out.println("idade: " + pessoa.getIdade());
    

    }
    }
    