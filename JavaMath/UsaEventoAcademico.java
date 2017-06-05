class UsaEventoAcademico
{
public static void main(String arg[])
    {
    EventoAcademico SBED1998;
    EventoAcademico ISER1999;
    
    Data data1=new Data();
    Data data2=new Data();
    
    data1.inicializaData((byte)20,(byte)4,(short)1998);
    data2.inicializaData((byte)27,(byte)4,(short)1998);
    SBED1998=new EventoAcademico("Simpósio Brasileiro de Educação à Distância","Londrina,PR",data1,data2,940);
    data1.inicializaData((byte)28,(byte)11,(short)1999);
    data2.inicializaData((byte)4,(byte)12,(short)1999);
    ISER1999 = new EventoAcademico("International Symposium on Education Robotics","Taipei,Taiwan",data1,data2,1308);
    System.out.println(SBED1998);
    System.out.println(ISER1999);
    }
}