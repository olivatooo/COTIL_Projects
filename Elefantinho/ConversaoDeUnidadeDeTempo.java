public class ConversaoDeUnidadeDeTempo
{
    public static double MinToSec(double minsec, int tipo)
    {
        if(tipo==0)
        {
            System.out.println(minsec*60+" segundos");
            return minsec*60;
        }
        if(tipo==1)
        {
            System.out.println(minsec/60+" segundos");
            return minsec/60;
        }
        
        return 0;
    }
    
    public static double HoraToMin(double horamin,int tipo)
    {
        if(tipo==0)
        {
            System.out.println(horamin*60+" minutos");
            return horamin*60;
        }
        if(tipo==1)
        {
            return horamin/60;
        }
        return 0;
    }
    
    public static double DiaToHora(double diahora, int tipo)
    {
        if(tipo==0)
        {
            System.out.println(diahora*24+" horas");
            return diahora*24;
        }
        if(tipo==1)
        {
            System.out.println(Math.floor(diahora/24)+" dia(s)");
            return diahora%24;
        }
        return 0;
    }
    
    public static double SemToDia(double semdia, int tipo)
    {
        if(tipo==0)
        {
            return semdia*7;
        }
        if(tipo==1)
        {
            System.out.println(Math.floor(semdia/7)+" semana(s)");
            return semdia%7;
        }
        return 0;
    }
   
    public static double MesToDia(double mesdia, int tipo)
    {
        if(tipo==0)
        {
            System.out.println(mesdia*30+" meses");
            return mesdia*30;
        }
        if(tipo==1)
        {
            System.out.println(Math.floor(mesdia/30)+" mes(es)");
            return mesdia%30;
        }
        return 0;
    }
    
    public static double AnoToDia(double anodia, int tipo)
    {
        if(tipo==0)
        {
            return anodia*365;
        }
        if(tipo==1)
        {      
            System.out.println(Math.floor(anodia/365)+" ano(s)");
            return anodia%365;
        }
        return 0;
    }
}