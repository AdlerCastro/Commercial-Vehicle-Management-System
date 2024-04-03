public class Edge_Control extends Queue<Vehicle> {
    Queue<Vehicle> vehicles;
    Stack<String> checklist;

    public Edge_Control() {
        this.vehicles =  new Queue<>();
        this.checklist = new Stack<>();
    }

    public void CheckChecklist(boolean passou) {
        if (passou) {
            System.out.println("Elemento do checklist verificado com sucesso.");
        } else {
            System.out.println("Elemento do checklist rejeitado.");
        }
    }

    public void NextVehicle() {
        if (vehicles.getSize() > 0) {
            vehicles.remove();
            System.out.println("Próximo veículo chamado.");
        } else {
            System.out.println("Não há veículos na fila.");
        }
    }

    public void getVehicles() {
        System.out.println("Os veiculos na fila para o controle de borda sao: ");
        vehicles.printVehicles();
    }

}
