package At2;

 class Circulo extends Forma {
    private double raio;

    public Circulo(String cor){
        this.cor=cor;
 }
    public void setCalculoArea( double raio){
        this.area = (raio*raio) * 3.14; 
    }
}
