import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("Lindsay");
        Turista mochileira = new Turista();
        // Definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");
        // Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null,retorno);
        // Atribuiçao dinamica
        String nome = JOptionPane
                .showInputDialog("Entre com o nome da pessoa Turista:");
        // Criaçao do objeto do tipo turista
        Turista pessoaTurista = new Turista(nome);

        System.out.println(pessoaTurista.getNome());
        // Pedir cpf e mostrar
        String cpf = JOptionPane.showInputDialog("Entre com o cpf:");
        // Adicionar cpf na pessoaTurista
        pessoaTurista.setCpf(cpf);
        System.out.println(pessoaTurista.getCpf());


    }
}