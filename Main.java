
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        List<Produto> produtoList = List.of(            
            new Produto("Gameboy", 500),
            new Produto("Pirulito", 50),
            new Produto("Hotwheels", 80),
            new Produto("Carro", 15000));

        List<Produto> produtoFiltrado = produtoList.stream().filter(produto -> produto.getPreco() >= 100).collect(Collectors.toList());



        produtoFiltrado.stream().sorted((p1 , p2) -> p1.getNome().compareTo(p2.getNome())).forEach(System.out::println);
    }
}