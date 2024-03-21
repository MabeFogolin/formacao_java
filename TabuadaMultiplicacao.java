public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for(int i= 0; i<=10; i++){
           int produto = i * numero;
            System.out.printf("%d x %d = %d \n", i, numero, produto);
        }
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);
    }
}
