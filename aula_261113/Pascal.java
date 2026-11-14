void main() {
    String linha = IO.readln("Entre com n máximo: ");
    int nMax = Integer.parseInt(linha);
    imprimePascal(nMax);
}

void imprimePascal(int nMax) {
    for (int n = 0; n <= nMax; n ++) {
        for (int k = 0; k <= n; k ++) {
            int val = coeficienteBinomial(n, k);
            IO.print(val + " ");
        }
        IO.println();
    }
}

int potenciaFatorial(int base, int expoente) {
    if (expoente == 0) {
        return 1;
    }

    int resultado = base;

    for (int i = 1; i < expoente; i ++) {
        resultado *= base - i;
    }

    return resultado;
}

int coeficienteBinomial(int n, int k) {
    return potenciaFatorial(n, k) / potenciaFatorial(k, k);
}