public  class Aula{
    public static void main(String[] arg){
        Caneta c1 = new Caneta();
        c1.cor="azul";
        c1.ponta=0.5f;
        c1.destampar();
        c1.modelo="Bic";
        c1.rabiscar();
        c1.status();
        
        Caneta c2= new Caneta();
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}