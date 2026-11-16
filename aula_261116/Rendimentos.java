final double VALOR_INICIAL = 10000.0;
final double TAXA_INICIAL = 0.06;
final double PASSO_TAXA = 0.005;
final int NUM_TAXAS = 5;
final int NUM_ANOS = 4;

void main() {
    double investimentos[] = new double[NUM_TAXAS];
    double taxas[] = new double[NUM_TAXAS];

    for (int i = 0; i < NUM_TAXAS; i ++) {
        investimentos[i] = VALOR_INICIAL;
        taxas[i] = TAXA_INICIAL + PASSO_TAXA * i;
    }

    IO.print("Ano\t");

    for (int i = 0; i < NUM_TAXAS; i ++) {
        IO.print(String.format("%.1f%%\t\t", (taxas[i] * 100)));
    }
    IO.println();

    for (int i = 0; i < NUM_ANOS; i ++) {
        IO.print(i + "\t");
        for (int j = 0; j < NUM_TAXAS; j ++) {
            double taxa = taxas[j];
            double investimento = investimentos[j] * (1 + taxa);

            investimentos[j] = investimento;
            IO.print(String.format("%.2f\t", investimento));
        }

        IO.println();
    }

}