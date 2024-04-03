import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Edge_Control edge = new Edge_Control();
        Vehicle carro = new Vehicle("Carro familiar");
        Vehicle carro1 = new Vehicle("Carro Exercito");

        System.out.println("Veiculo: "+carro.getDescrition());
        
        carro.addPassageiros("Hugo");
        carro.addPassageiros("Yuri");
        carro.addPassageiros("Thiago");
        
        System.out.println("Os passageiros do carro "+carro.getDescrition()+" sao: ");
        carro.getPassageiros();
        
        System.out.println("Veiculo: "+carro1.getDescrition());

        carro1.addPassageiros("Edgar");
        carro1.addPassageiros("Tex");
        carro1.addPassageiros("Christophe");

        System.out.println("Os passageiros do carro "+carro1.getDescrition()+" sao: ");
        carro1.getPassageiros();

        edge.vehicles.add(carro);
        edge.vehicles.add(carro1);
        
        edge.getVehicles();

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {

            System.out.println("---> Menu de Controle de Borda <----\n");
            System.out.println("1. Verificar Elemento do checklist");
            System.out.println("2. Chamar proximo veiculo");
            System.out.println("3. Mostrar veiculos na fila");
            System.out.println("4. sair");
            System.out.print("Escolha uma das opcoes: ");
            choice = scanner.nextInt(); 

            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            switch (choice) {
                case 1:
                    System.out.print("O elemento do checklist passou? (true/false): ");
                    boolean passou = scanner.nextBoolean();
                    edge.CheckChecklist(passou);
                    break;
                case 2:
                    edge.NextVehicle();
                    break; 
               case 3:
                    edge.getVehicles();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, escolha novamente.");
            }
        }
        scanner.close();
    }
}
