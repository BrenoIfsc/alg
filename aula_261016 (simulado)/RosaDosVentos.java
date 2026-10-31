// Limites das direcoes
final int NORTE = 0;
final int NORDESTE = 1;
final int LESTE = 2;
final int SUDESTE = 3;
final int SUL = 4;
final int SUDOESTE = 5;
final int OESTE = 6;
final int NOROESTE = 7;

void main() { 
    String linha = IO.readln("Entre com o ângulo (graus): ");

    int angulo = Integer.parseInt(linha);

    int voltas = angulo / 360;
    int anguloNormalizado = angulo % 360;
    int intervaloAngulo = anguloNormalizado / 45;

    String direcao;

    switch (intervaloAngulo) {
        case NORTE -> direcao = "Norte";
        case NORDESTE -> direcao = "Nordeste";
        case LESTE -> direcao = "Leste";
        case SUDESTE -> direcao = "Sudeste";
        case SUL -> direcao = "Sul";
        case SUDOESTE -> direcao = "Sudoeste";
        case OESTE -> direcao = "Oeste";
        case NOROESTE -> direcao = "Noroeste";
        default -> throw new RuntimeException("Não são permitidos ângulos negativos");
    }

    switch (voltas) {
        case 0 -> IO.println(direcao);
        case 1 -> IO.println(direcao + ", após 1 volta");
        default -> IO.println(direcao + ", após " + voltas + " voltas");
    }
}