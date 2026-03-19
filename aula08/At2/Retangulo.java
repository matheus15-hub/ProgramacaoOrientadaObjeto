package At2;

 class Retangulo extends Forma {
    private double altura;
    private double largura;

    public Retangulo(String cor){
        this.cor = cor;
    }
    public void setCalculoArea(double altura, double largura){
        this.area = altura*largura;
    }
}
