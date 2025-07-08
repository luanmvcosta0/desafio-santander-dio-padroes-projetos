package costa.desafio_santander_dio_padroes_projetos.util;

public class LoggerSingleton {

    private static LoggerSingleton instancia;

    private LoggerSingleton() {

    }

    public static LoggerSingleton getInstancia() {
        if (instancia == null) {
            instancia = new LoggerSingleton();
        }
        return instancia;
    }

    public void log(String menssagem) {
        System.out.println("[LOG] " + menssagem);
    }

}
