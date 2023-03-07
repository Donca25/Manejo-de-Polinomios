package polinomios;

public class FORMA3 {
	
	Nodo punta;
	
	public	FORMA3()
	{
		punta=null;
	}
	
	public Nodo getPunta()
	{
		return punta;
	}
	public int getDU() {
		return punta.getE()+1;
	}
	
	public void getVF1() {
		String s="";
		Nodo p=punta;
		while (p!=null) {
			s=s+p.getC()+p.getE();
			p=p.getL();		
		}
		char Vc[]= s.toCharArray();
		String Vs[]=new String[Vc.length];
		for (int i=0; i<Vc.length; i++) {
			Vs[i]= Vc[i];
		}
	
	}
		
	
	public void convertir(String Vs[]) {
		
		for (int i= 0; i<Vs.length; i=i+2) {
			if (Vs[i]!=null){
				
				InsertarOrdenado(Integer.parseInt(Vs[i]), Integer.parseInt(Vs[i+1]));
				
			}
		}
		
	}
	
	public void InsertarOrdenado(int coe, int exp){
		
		Nodo x =new Nodo(coe,exp); 
		Nodo p= punta, a=null;
		if (p== null) {
			
			punta=x;
		}
		
		else {
			
			while (p!= null) {
				
				if (punta.getE()<x.getE()) {
					x.setL(punta);
					punta = x;
				}
				else {
					if (x.getE() < p.getE() && p.getL()==null) {
						
						p.setL(x);				
						
					}
					else {
						if(p.getE()<x.getE() && x.getE()<a.getE()) {
							x.setL(p);
							a.setL(x);
						}
						
					}
					
				}
				
				a=p;
				p= p.getL();		
				
			}
		}
		
		
	}
	
	
	public void mostrar() {
		
		Nodo p=punta;
		while (p!=null) {
			System.out.print("["+p.getC()+"]");
			System.out.print("["+p.getE()+"]");
			p=p.getL();		}
	}

}
