package souza.mateus;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada ai!");
	    // Criar uma referência paar Conta
        Conta c1;
        //Instanciar um objeto Conta
        c1 = new Conta();
        c1.cliente = new Cliente();

        c1.cliente.titular = "Inuyasha";
        c1.saldo = 199.99;

        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.cliente.titular = "Seichomaru";
        c2.saldo = 1000;
        c2.visualizarSaldo();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        if(c1.sacar(1000)){
            System.out.printf("Deu bom!");
        }else{
            System.out.println("Deus ruim!");
        }
        c1.visualizarSaldo();

        if(c1.transferirPara(1000, c2)){
            System.out.println("Deu bom, tranferiu!");
        }else{
            System.out.println("Deus ruim, não transferiu");
        }

    }
}
