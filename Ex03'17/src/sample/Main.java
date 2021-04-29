package sample;


import sample.model.PessoaFisica;
import sample.model.PessoaJuridica;

public class Main {


    public static void main(String[] args) {

        PessoaJuridica pessoaJuridica = new PessoaJuridica("XR Construtora");
        pessoaJuridica.setEndereco("Lá na esquina", 4567, "Jurere", "68308-3");
        pessoaJuridica.setCnpj("85764465");
        pessoaJuridica.setIe("78467685376");
        System.out.println("PESSOA JURÍDICA\n" + pessoaJuridica);

        PessoaFisica pessoaFisica = new PessoaFisica("Eduardo Boeira");
        pessoaFisica.setEndereco("Aeroporto", 3562, "Carianos", "78376-8");
        pessoaFisica.setCpf("736576532-06");
        pessoaFisica.setRg("7365245");
        System.out.println("PESSOA FÍSICA\n" + pessoaFisica);

    }

}
