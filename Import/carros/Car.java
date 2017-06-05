package carros;

public class Car{
     
    protected String getColor(){
        return "red";
    }
    
    public String imprimirCor()
    {
    Car a=new Car();
    return     a.getColor();
    }
    public static void main()
    {
  
    //a.imprimirCor();
    }
}
