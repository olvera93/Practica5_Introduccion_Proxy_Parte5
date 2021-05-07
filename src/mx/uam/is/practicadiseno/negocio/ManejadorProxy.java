package mx.uam.is.practicadiseno.negocio;

import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;

public class ManejadorProxy implements Manejador {
	
	// Referencia al programa
	private Manejador manejador;
	
	public ManejadorProxy(Manejador manejador) {
		this.manejador = manejador;
	}

	@Override
	public String[] dameDatos() {
		System.out.println("Se invoc� el m�todo dameDatos()");
	     return manejador.dameDatos();
	}

	@Override
	public boolean agrega(String dato) {
		System.out.println("Se invoc� el m�todo agrega(String dato)");
	     return manejador.agrega(dato);
	}

	@Override
	public boolean agregaArchivo(String dato) {
		System.out.println("Se invoc� el m�todo agregaArchivo(String dato)");
	     return manejador.agregaArchivo(dato);
	}

	@Override
	public boolean borra(String dato) {
		System.out.println("Se invoc� el m�todo borra(String dato)");
	     return manejador.borra(dato);
	}

	@Override
	public void finaliza() {
		System.out.println("Se invoc� el m�todo finaliza()");
	    manejador.finaliza();
		
	}

	@Override
	public boolean agregaObservador(Observador o) {
		System.out.println("Se invoc� el m�todo agregaObservador(Observador o)");
	     return manejador.agregaObservador(o);

	}

	@Override
	public boolean quitaObservador(Observador o) {
		System.out.println("Se invoc� el m�todo quitaObservador(Observador o)");
	    return manejador.quitaObservador(o);
	}

	@Override
	public void notificar() {
		System.out.println("Se invoc� el m�todo notifica()");
	    manejador.notificar();
	}

}
