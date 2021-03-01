package souza.mateus;

public class Basico02 {
    //Estruturas de decisão
    public static void main(String[] args){
        int ano = 2020;

        //Estrutura de decisão simples
//        if(ano % 2 == 0){
//            System.out.println("Ano par!");
//        }
//        if(ano % 2 == 1){
//            System.out.println("Ano Impar!");
//        }

        //Estrutura de desisão composta
        if (ano % 2 == 0){
            System.out.printf("Ano par!");
        }else{
            System.out.println("Ano impar!");
        }

        //Varias decisoes
        switch (ano){
            case 2020:
                System.out.println("Vixi!");
                break;
            case 1991:
                System.out.println("Pokemon Red!!");
                break;
            default:
                System.out.println("Quase Boku no Hero saindo!");
                break;
        }
    }
}
