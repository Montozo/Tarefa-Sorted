
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        List<Produto> produtoList = List.of(            
            new Produto("Gameboy", 500),
            new Produto("Pirulito", 50),
            new Produto("Hotwheels", 80),
            new Produto("Carro", 15000));

        List<Produto> produtoFiltrado = produtoList.stream()
        .filter(produto -> produto.getPreco() >= 100)
        .collect(Collectors.toList());

        List<Produto>produtoOrdenado = produtoFiltrado.stream()
        .sorted(Comparator.comparing(Produto::getNome))
        .collect(Collectors.toList());

        produtoOrdenado.stream()
        .filter(p -> p.getNome().equalsIgnoreCase("Gameboy"))
        .findFirst()
        .ifPresentOrElse(System.out::println, () -> {System.out.println("nao encontrado");});


    }
}