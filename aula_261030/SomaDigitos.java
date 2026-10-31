void main() {
    String linha = IO.readln("Entre com o valor: ");
    int valor = Integer.parseInt(linha);
    int soma = somaDigitos(valor);

    IO.println("Soma dos digitos: " + soma);
}

int somaDigitos(int n) {
    int soma = 0;
    int digitos = n;

    while (digitos > 0) {
        soma += digitos % 10;
        digitos = digitos / 10;
    }

    return soma;
}