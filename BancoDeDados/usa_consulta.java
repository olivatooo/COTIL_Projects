import java.sql.ResultSet;
public class usa_consulta{
    public static void main()
    {
        ResultSet retorno;
        dados d = new dados();
           if(d.conecta("143.106.241.1","3infd1","3infd1","3infd1"))
        {
        System.out.println("Conectado!");
        }
        else
        {
        System.out.println("Não conectado");
        }
        retorno =d.consulta("select * from cliente");
        try
       
        {
            while(retorno.next())
            {
            System.out.println(retorno.getString("nome")+" - "+retorno.getString("idade"));
            }
        }
        catch(Exception e)
        {
            System.out.println("Houve um erro:"+e);
        }
    }   
}