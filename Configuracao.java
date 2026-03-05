public class Configuracao {

    private static Configuracao instancia;
    private String tema;

    private Configuracao() {
        this.tema = "Claro";
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
