package AtividadeLivro;
import java.util.Scanner;
 
public class MainLivro {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        String titulo = ler.next();
        System.out.println("Digite o nome do autor: ");
        String autor = ler.next();
        System.out.println("Digite o numero das paginas:  ");
        int paginas = ler.nextInt();
        System.out.println("Digite o prçlo do livro: ");
        double preco = ler.nextDouble();
        
        
        Livro livro1 = new Livro(titulo, autor, paginas, preco);
        
        // livro1.setTitulo("");
        // livro1.setAutor("");
        // livro1.setPaginas("");
       //  livro1.setPreco("");

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Paginas: " + livro1.getPaginas());
        System.out.println("Preco: " + livro1.getPreco());


        ler.close();


    }
}
