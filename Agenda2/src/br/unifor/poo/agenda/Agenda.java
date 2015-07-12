package br.unifor.poo.agenda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda extends Compromissos implements Runnable {

	private Date dataCorrente;
	private List<Compromissos> compromisso = new ArrayList<Compromissos>();
	
	
	public Date getDataCorrente() {
		return dataCorrente;
	}
	
	public void setDataCorrente(Date dataCorrente) {
		this.dataCorrente = dataCorrente;
	}
	
	public List<Compromissos> getCompromisso() {
		return compromisso;
	}
	
	public void setCompromisso(List<Compromissos> compromisso) {
		this.compromisso = compromisso;
	}
	
	public void adicionarCompromissos(Compromissos compromisso){
		this.compromisso.add(compromisso);
	}
	
	@Override
	public void detalharCompromissos() {
		for(Compromissos compromissos: compromisso){
			System.out.println(compromissos.toString());
		}
	};
	
	@Override
	public void run(){
		while(true){
			for(Compromissos compromissos: compromisso){
				if(compromissos.getDataCompromisso().after(new Date())){
					System.out.println("Está atrasado para o compromisso "+compromissos.getDescricao());
				}else{
					System.out.println("Você tem um compromisso às "+compromissos.getDataCompromisso());
				}
			}
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
