void main() {
    Random rng = new Random();

    String linha = IO.readln("Entre a quantidade de rolagens: ");

    int resultados[] = new int[13]; 
    int rolagens = Integer.parseInt(linha);

    for (int i = 0; i < rolagens; i ++) {
        int d1 = rng.nextInt(1, 7);
        int d2 = rng.nextInt(1, 7);
        int soma = d1 + d2;

        resultados[soma] += 1;
    }

    for (int i = 2; i <= 12; i ++) {
        float porcentagem = resultados[i] / (float) rolagens * 100;
        String grafico = new String(new char[(int) porcentagem]).replace("\0", "*");
        String s = String.format("%2d: %5.2f%% | %s", i, porcentagem, grafico);

        IO.println(s);
    }

}