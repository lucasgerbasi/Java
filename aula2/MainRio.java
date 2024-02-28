public class MainRio {
    public static void main(String[] args) {

        Rio rio1 = new Rio("rio", 3, true);
        Rio rio2 = new Rio();

        rio1.chover(4);
        rio1.ensolarar(2);
        rio1.sujar();
        rio1.limpar();
        rio1.mostra();
    }
}
