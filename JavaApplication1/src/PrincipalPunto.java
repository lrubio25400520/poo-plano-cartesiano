public class PrincipalPunto {
   public static void main(String[] args){
     Punto a = new Punto("A",5,6);
     Punto b = new Punto("B", 20,20);
     
     double distancia;
     distancia = Math.sqrt(Math.pow((b.getX()-a.getX()),2)+(Math.pow(b.getY()-b.getY(),2)));
     System.out.println("La distamcia es " + distancia);
   }
}
