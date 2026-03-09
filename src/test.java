public class test {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("douglas");
        Escola escola = new Escola("2 de julho");

        aluno.setEscola(escola);
        aluno.imprimir();
    }
}
