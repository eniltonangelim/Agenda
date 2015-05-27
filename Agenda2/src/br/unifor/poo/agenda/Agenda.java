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
		for(Compromissos compromisso: compromisso){
			System.out.println(compromisso.toString());
		}
	};
	
	@Override
	public void run(){
		while(true){
			for(Compromissos compromisso: compromisso){
				if(compromisso.getDataCompromisso().after(new Date())){
					System.out.println("Está atrasado para o compromisso "+compromisso.getDescricao());
				}
			}
			try {
				Thread.sleep(6000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
