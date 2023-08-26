package Tp4E1;

public class Alarma {
boolean rompioV;
boolean abrioV;
boolean movimiento;
Timbre [] timbres;
Luz [] luces;

public Alarma(boolean rompioV, boolean abrioV, boolean movimiento) {
	this.rompioV=rompioV;
	this.abrioV=abrioV;
	this.movimiento=movimiento;
}

public void comprobar(Timbre T1) {
	if((isRompioV() || isAbrioV() || isMovimiento()) == true) {
		T1.sonar();
	}
}
public boolean isRompioV() {
	return rompioV;
}

public void setRompioV(boolean rompioV) {
	this.rompioV = rompioV;
}

public boolean isAbrioV() {
	return abrioV;
}

public void setAbrioV(boolean abrioV) {
	this.abrioV = abrioV;
}

public boolean isMovimiento() {
	return movimiento;
}
public void encenderLucesAlarma(Luz L1) {
    //se sobrescribe en AlarmaLuminosa
}
public void setMovimiento(boolean movimiento) {
	this.movimiento = movimiento;
}
public static void proceso(Alarma[] alarmas, Timbre T1, Luz L1) {
	    for (int i = 0; i < alarmas.length; i++) {
	        alarmas[i].comprobar(T1);
	        System.out.println((alarmas[i] instanceof AlarmaLuminosa));
	        if (alarmas[i] instanceof AlarmaLuminosa) {
	        	
	            AlarmaLuminosa alarmaLuminosa = (AlarmaLuminosa) alarmas[i];
	            alarmaLuminosa.encenderLucesAlarma(L1); // Llamada específica de AlarmaLuminosa
	        }
	        
	        System.out.println("--------" + i);
	    }

}


public static void main(String [] args) {
	Alarma A1= new Alarma(true, false, false);
	Alarma A2=new Alarma(false, true, true);
	Alarma A3=new Alarma(false, false, false);
	Luz L1=new Luz();
	Timbre T1= new Timbre();
	
Alarma [] alarmas= {A1, A2, A3};
Luz [] luces= {L1};
Timbre [] timbres= {T1};

proceso(alarmas, T1, L1);


}
}
