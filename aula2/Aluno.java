public class Aluno {
    public int nroAluno, idade;
    public String nome;
    public float p1,p2;

    public Aluno() {}

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        float notaFinal;
        notaFinal = (this.p1 + this.p2)/2;
        return notaFinal;
    }

    public void passou() {
        if (this.notaFinal() >= 6.0) {
            System.out.println("Aprovado.");
        }
        else {
            System.out.println("Reprovado.");
        }
    }

    public String dadosAlunos() {
        return "Nro: " + this.nroAluno + " Nome: " + this.nome + " Idade: " + this.idade + " Média: " + this.notaFinal();
    }
}

