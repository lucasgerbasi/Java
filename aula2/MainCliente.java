public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(1, 1, "ABC", 500);
        obj1.depositar(500);
        obj1.sacar(200);

        System.out.println(obj1);
    }
}
