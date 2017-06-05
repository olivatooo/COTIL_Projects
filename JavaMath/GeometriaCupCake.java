class GeometriaCupCake {

    public static double Area(double lado1, double lado2)
    {
    return (lado1*lado2);
    }
    
    public static double Comprimento(double raio)
    {
    return (2*Math.PI*raio);
    }
    
    public static String Baskara(int a, int b, int c)
    {
    int delta=(b*b)-(4*a*c);
    double x1=((b*(-1))+Math.sqrt(delta))/(2*a);
    double x2=((b*(-1))-Math.sqrt(delta))/(2*a);
    return x1+" e "+x2;
    }
}