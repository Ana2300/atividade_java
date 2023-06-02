package Aula9;

public class Orientaçãoaobjeto { private String nome;
private String endereco;
private String telefone;
private String email;
private int idade;

// Método construtor
public Cliente(String nome, String endereco, String telefone, String email, int idade) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
    this.idade = idade;
}

// Métodos Get e Set
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

// Método visualizar
public void visualizar() {
    System.out.println("Nome: " + nome);
    System.out.println("Endereço: " + endereco);
    System.out.println("Telefone: " + telefone);
    System.out.println("Email: " + email);
    System.out.println("Idade: " + idade);
}
}

//Classe TestaCliente
public class TestaCliente {
public static void main(String[] args) {
    // Instanciando dois objetos da classe Cliente
    Cliente cliente1 = new Cliente("João", "Rua A, 123", "123456789", "joao@example.com", 30);
    Cliente cliente2 = new Cliente("Maria", "Rua B, 456", "987654321", "maria@example.com", 25);

    // Exibindo os dados dos objetos
    System.out.println("Dados do Cliente 1:");
    cliente1.visualizar();

    System.out.println();

    System.out.println("Dados do Cliente 2:");
    cliente2.visualizar();
}
}

}
