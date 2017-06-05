public class ElefanteIndiano
{
    public static void main(double valor)
    {
        System.out.println(ConversaoDeUnidadeDeTempo.SemToDia(ConversaoDeUnidadeDeTempo.MesToDia(ConversaoDeUnidadeDeTempo.AnoToDia(valor,1),1),1)+" dia(s)");  
        ConversaoDeUnidadeDeTempo.MinToSec(ConversaoDeUnidadeDeTempo.HoraToMin(ConversaoDeUnidadeDeTempo.DiaToHora(valor,0),0),0);
    }
    
}