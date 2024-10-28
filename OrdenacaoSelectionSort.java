class OrdenacaoSelectionSort implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<Integer> numeros) {
        int n = numeros.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (numeros.get(j) < numeros.get(minIdx)) {
                    minIdx = j;
                }
            }
            int temp = numeros.get(minIdx);
            numeros.set(minIdx, numeros.get(i));
            numeros.set(i, temp);
        }
    }
}