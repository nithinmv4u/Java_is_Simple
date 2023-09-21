package Inc_tax;

public class Calculation {
	float tax(float p)
	{
		if(p<=250000)
			p=0;
		else if (p>250000&&p<=500000)
			p=p*5/100;
		else if (p>500000&&p<=1000000)
			p=p*20/100;
		else if (p>1000000&&p<=5000000)
			p=p*30/100;
		return p;
	}

}
