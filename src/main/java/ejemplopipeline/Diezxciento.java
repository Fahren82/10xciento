package ejemplopipeline;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	
	public Diezxciento(){
		ahorro = 20000000;
		sueldo = 700000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(){
		double diezxciento = ahorro * 0.1;
		System.out.println(diezxciento);
		return (int) diezxciento;
	}
	
	public Float impuesto(int sueldo){
		Integer sueldoAnual = sueldo*12;
		
		float inpuesto = 0.0f;
		if (sueldoAnual > 17864280 && (sueldoAnual < 29773800)){
			inpuesto =  0.08f;
		}else if(sueldoAnual > 29700000 && (sueldoAnual < 41600000)){
			System.out.println("ingresó al else");
			inpuesto = 0.135f;
		}
		
		System.out.println("Sueldo Anual: "+sueldoAnual); 
		System.out.println("Impuesto: "+inpuesto); 
		return inpuesto;
	}
	
	public int saldoAhorro(int ahorro) {
		double noventaxciento = ahorro * 0.9;
		System.out.println("Saldo Ahorro: "+noventaxciento);
		return (int) noventaxciento;
	}

}