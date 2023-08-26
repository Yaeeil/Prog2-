package Tp4E1;

public class AlarmaLuminosa extends Alarma {


public AlarmaLuminosa(boolean rompioV, boolean abrioV, boolean movimiento) {
	super(rompioV, abrioV, movimiento);
}
@Override
public void encenderLucesAlarma(Luz L1) {
	 if (isRompioV()) {
         L1.encender();
	}
}
}
