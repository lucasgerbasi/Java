public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        Aluno obj2 = new Aluno(123, "Fulano", 19, 7.5f, 8.5f);

        System.out.println(obj2.dadosAlunos());
        obj2.passou();
    }
}