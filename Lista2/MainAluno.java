public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(123, "Fulano", 19, 7.5f, 8.5f);


        System.out.println(obj1.notaFinal());
        System.out.println(obj1.dadosAlunos());
    }
}