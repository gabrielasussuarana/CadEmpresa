public class AppCadastro {
    public static void main(String[] args) {
        RegistroFuncionario profissional1 = new RegistroFuncionario(1,"Natalia Oliveira");
        RegistroFuncionario profissional2 = new RegistroFuncionario(5,"Tiago Ramos");

        RegistroFuncionario profissional3 = new RegistroFuncionario(6,"Geraldo Santos",true,"Mesquita");
        RegistroFuncionario profissional4 = new RegistroFuncionario(7,"Gio Sato",true,"Dolores");

        RegistroFuncionario profissional5 = new RegistroFuncionario(8,"Rui Heiss",true,"EECPA",true,"La Salle");
        RegistroFuncionario profissional6 = new RegistroFuncionario(2,"Julia Cardoso",true,"Concurseiro",true,"Concurseiro");

        RegistroFuncionario profissional7 = new RegistroFuncionario(4,"Carla Fernanda",true,"Marista",true,"Marista",true,"UFRGS");
        RegistroFuncionario profissional8 = new RegistroFuncionario(3,"Filipe",true,"São Pedro",true,"São Pedro",true,"UFPEL");

        System.out.println("Registro Funcionários: ");
        System.out.println(profissional1.toString());
        System.out.println(profissional2.toString());
        System.out.println(profissional3.toString());
        System.out.println(profissional4.toString());
        System.out.println(profissional5.toString());
        System.out.println(profissional6.toString());
        System.out.println(profissional7.toString());
        System.out.println(profissional8.toString());
    }
}
