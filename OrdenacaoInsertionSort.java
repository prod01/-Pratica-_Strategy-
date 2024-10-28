class OrdenacaoInsertionSort implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 1; i < n; i++) {
            int key = numeros.get(i);
            int j = i - 1;
            while (j >= 0 && numeros.get(j) > key) {
                numeros.set(j + 1, numeros.get(j));
                j--;
            }
            numeros.set(j + 1, key);
        }
    }
}