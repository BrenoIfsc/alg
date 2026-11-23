void main() {
    String linha = IO.readln("Entre com a quantidade de itens: ");
    int numItens = Integer.parseInt(linha);
    
    int[] quantidades = new int[numItens];
    double[] precos = new double[numItens];

    for (int i = 0; i < numItens; i ++) {
        linha = IO.readln("Quantidade do item " + (i + 1) + ": ");
        quantidades[i] = Integer.parseInt(linha);
        linha = IO.readln("Preço unitário do item " + (i + 1) + ": ");
        precos[i] = Double.parseDouble(linha);
    }

    linha = IO.readln("Desconto (%): ");
    double desconto = Double.parseDouble(linha) / 100;

    double[] subtotais = calculaSubtotais(quantidades, precos);
    double total = obtemTotalAposDesconto(subtotais, desconto);

    IO.println(String.format("Total: R$ %.2f", total));
}

double[] calculaSubtotais(int[] quantidades, double[] precos) {
    double[] subtotais = new double[quantidades.length];
    for (int i = 0; i < quantidades.length; i ++) {
        subtotais[i] = quantidades[i] * precos[i];
    }
    return subtotais;
}

double somaTotal(double[] subtotais) {
    double total = 0;
    for (int i = 0; i < subtotais.length; i ++) {
        total += subtotais[i];
    }
    return total;
}

double obtemTotalAposDesconto(double[] subtotais, double desconto) {
    return somaTotal(subtotais) * (1 - desconto);
}

