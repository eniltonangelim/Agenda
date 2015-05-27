package br.unifor.ads.engagement;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

public class Tarefas implements Serializable {

	/** Math.abs(1432157877-1432157949/60)
	 *  
	 */
	private static final long serialVersionUID = -2633303892068752319L;
	
	
	private Long dataNotificao;
	private Date dataAgendadoNotificacao;
	
	public Tarefas ( Date dataAgendadoNotificao ){
		this.setConvertDataToUnixTime(dataAgendadoNotificacao);
	}
	
	
	
	public Long getDataNotificao() {
		return this.dataNotificao;
	}

	public void setDataNotificao(Long dataNotificao) {
		this.dataNotificao = dataNotificao;
	}
	
	private void setConvertDataToUnixTime(Date dataNotificacao){
		setDataNotificao(dataNotificao);
	};


}
