 class Gerente extends funcionario{
    private String setor;

    public Gerente(String nome , double salario , String setor){
        super(nome , salario);
        this.setor = setor;
    }
    public String getInformacoes(){
        return "Nome:" + this.nome + " : Salario: " + this.salario + " : Setor: " + this.setor; 
    }
}
