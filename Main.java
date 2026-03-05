public class Main {
    public static void main(String[] args) {

        Configuracao config1 = Configuracao.getInstancia();
        System.out.println(config1.getTema());

        config1.setTema("Escuro");

        Configuracao config2 = Configuracao.getInstancia();
        System.out.println(config2.getTema());

        System.out.println(config1 == config2);
    }
}
