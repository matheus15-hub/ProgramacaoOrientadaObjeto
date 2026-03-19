package at3;

class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, String matricula){
        super(nome);
        this.matricula = matricula;
    }
    public String getInfoAlunos(){
        return "Nome: " + nome +" Matricula: " + matricula;
    }
}