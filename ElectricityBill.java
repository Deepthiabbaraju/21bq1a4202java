
class ElectricityBill {
	String cnum,cname;
	int type;
	double pmr,cmr,amount,units;
	ElectricityBill(){
	    cnum="";
	    cname="";
	    type=0;
	    pmr=0.0;
	    cmr=0.0;
	}
	
	double amountcal() {
		units=cmr-pmr;
		if (type==1)
		{
			if (units<100)
				amount=units*1;
			else if (units<=200)
		    	 amount=100+(units-100)*2.50;
			else if (units<=500)
		    		amount=100+250+(units-200)*4;
		    else
		    	amount=units*6;
		}
		if (type==2){
				if (units<100)
					amount=units*2;
				else if (units<=200)
			    		amount=200+(units-100)*4.50;
				else if (units<=500)
			    		amount=200+450+(units-200)*6;
			    else
			    	amount=units*7;
		}
		if (type!=1 && type!=2){
		    System.out.println("enter valid type ");
		}
		return amount;
	    }

}








