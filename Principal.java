public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        
        List<Integer> numeros = new ArrayList<>(Arrays.asList(34, 7, 23, 32, 5, 62));
        System.out.println("Lista original: " + numeros);

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");

        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
            case 2:
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                break;
            case 3:
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        contexto.executarOrdenacao(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}