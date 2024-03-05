public class Aluno {
    public int nroAluno, idade;
    public String nome;
    public float p1, p2;

    public Aluno() {
    }

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;


    }

    public int getNroAluno() {
        return nroAluno;
    }

    public void setNroAluno(int nroAluno) {
        if (nroAluno == 6) {
            return nroAluno;
        } else {
            System.out.println("Número inválido.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public float getP1() {
        this.p1 = p1;
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public float notaFinal() {
        float notaFinal;
        notaFinal = (this.p1 + this.p2) / 2;
        return notaFinal;
    }

    @Override
    public String dadosAlunos() {
            return "Aluno{" +
                    "nroAluno=" + nroAluno +
                    ", idade=" + idade +
                    ", nome=" + nome +
                    ", p1=" + p1 +
                    ", p2=" + p2 +
                    '}';
        }
    }