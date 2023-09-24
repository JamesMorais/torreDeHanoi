package executavel;

public class TorreDeHanoi {
    public static void torreDeHanoi(int n, char origem, char aux, char destino){
        if (n==1){
            System.out.println(origem+"->"+destino);
            return;
        }
        torreDeHanoi(n-1, origem, destino, aux);
        torreDeHanoi(1, origem, aux, destino);
        torreDeHanoi(n-1,aux, origem, destino);
    }
    public static void main(String[] args) {
        torreDeHanoi(3, 'A', 'B', 'C');
    }

}
