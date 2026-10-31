void main() {
    String linha = IO.readln("Entre um número inteiro positivo: ");
    int numero = Integer.parseInt(linha);

    if (ehDegrau(numero)) {
        IO.println(numero + " faz parte do esqudrão degrau");
    } else {
        IO.println(numero + " não faz parte do esqudrão degrau");
    }
}

boolean ehDegrau(int n) {
    int numeroAtual = 1;
    int soma = 1;

    while (soma < n) {
        numeroAtual += 1;
        soma += numeroAtual;
    }

    return n == soma;
}