package sample;

import sample.model.Cliente;
import sample.model.Funcionario;

public class MainCliFun {

    public static void main(String[] args){

        Funcionario pessoa1 = new Funcionario();
        pessoa1.setNome("Pedro");
        pessoa1.setSobrenome("Silva");
        pessoa1.setTelefone("(48) 993514570");
        pessoa1.setEmail("pedro@gmail.com");
        pessoa1.setFuncao("Gerente");
        pessoa1.setSalario(30, 160);
        System.out.println("FUNCIONÁRIO\n" + pessoa1);

        Cliente pessoa2 = new Cliente("Jhonatan", "Alves");
        pessoa2.setEmail("jhonatan4alves@gmail.com");
        pessoa2.setDataCadastro("22/03/2021");
        pessoa2.setTelefone("(48) 999266751");
        System.out.println("\nCLIENTE\n" + pessoa2);
    }
}
