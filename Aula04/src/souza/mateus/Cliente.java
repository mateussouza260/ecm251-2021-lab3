package souza.mateus;

public class Cliente {
    String titular;
    String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}