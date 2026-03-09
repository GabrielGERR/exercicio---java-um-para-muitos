public class Aluno {
    private String nome;
    private Escola escola;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println(getNome());
        if(escola != null){
            System.out.println(escola.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }
}
