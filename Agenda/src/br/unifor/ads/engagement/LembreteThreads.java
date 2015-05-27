package br.unifor.ads.engagement;

import java.time.Instant;
import java.util.Date;

public class LembreteThreads implements Runnable {
	
	private Date dateTimeNow; 
	private Long unixTimeDataLimiteExercucao = Instant.now().getEpochSecond();
	
	
	public void run(){
		
	}

	public Date getDateTimeNow() {
		return dateTimeNow;
	}

	public void setDateTimeNow(Date dateTimeNow) {
		this.dateTimeNow = dateTimeNow;
	}
	
	public Double getIntervaloMinutos(){
		return (double) Math.abs(  getDataNotificao()-getUnixTimeDataLimiteExercucao()/60 );
	}
	
}
