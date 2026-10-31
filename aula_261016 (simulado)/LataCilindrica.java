double calculaAreaCirculo(double raio) {
    return Math.PI * Math.pow(raio, 2);
}

double calculaAreaSuperficie(double raio, double altura) {
    double areaBases = calculaAreaCirculo(raio);
    return 2 * Math.PI * raio * altura + 2 * areaBases;
}

double calculaMassaLata(double raio, double altura, double espessura, double densidade) {
    return  calculaAreaSuperficie(raio, altura) * espessura * densidade;
}


void main() {
    double diametro, raio, espessura, altura, densidade;
    int numLatas;
    String linha;

    linha = IO.readln("Entre com o diâmetro (cm): ");
    diametro = Double.parseDouble(linha);
    raio = diametro / 2;

    linha = IO.readln("Entre com a altura (cm): ");
    altura = Double.parseDouble(linha);

    linha = IO.readln("Entre com a espessura (cm): ");
    espessura = Double.parseDouble(linha);

    linha = IO.readln("Entre com a densidade (cm): ");
    densidade = Double.parseDouble(linha);

    linha = IO.readln("Entre com o número de latas: ");
    numLatas = Integer.parseInt(linha);

    double massaLata = calculaMassaLata(raio, altura, espessura, densidade);
    double massaTotal = massaLata * numLatas;

    IO.println(String.format("Massa total: %.2f g", massaTotal));
}
