class TrazABebidaQuePisca
{
public static void main()
{
CamaroteSuperior a = new CamaroteSuperior();
CamaroteInferior b = new CamaroteInferior(1);
CamaroteInferior c = new CamaroteInferior(2);
CamaroteInferior d = new CamaroteInferior(3);
Normal e = new Normal();

System.out.println(a.RetornaValor());
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);

}
}