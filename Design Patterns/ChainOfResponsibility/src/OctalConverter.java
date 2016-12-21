
public class OctalConverter implements Converter{

	Converter converter =null;
	@Override
	public void convertNumber(int number, String totype) {
		// TODO Auto-generated method stub
		if(totype.equalsIgnoreCase("octal")){
			System.out.println("Octal ("+number+") - " + Integer.toOctalString(number));
		}
		else{
			if(converter!=null)
				converter.convertNumber(number, totype);
			else
				System.out.println("Can't Process Request !");
		}
	}

	@Override
	public void setSuccessor(Converter converter) {
		// TODO Auto-generated method stub
		this.converter = converter;
	}

}
