package br.unifor.poo.agenda;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Tarefas tarefa = new Tarefas();
		Reuniao reuniao = new Reuniao();
		Contato contato = new Contato();
		
		contato.setNome("Enilton Angelim");
		reuniao.addContato(contato);
		contato.setNome("Hythalo Henrique");
		reuniao.addContato(contato);
		contato.setNome("Yasmmim Guti");
		
		reuniao.addContato(contato);
		reuniao.setDataLembrete(new Date());
		reuniao.setDataReuniao(new Date());
		reuniao.setDescricao("Java 8");
		reuniao.setLocalReuniao("Unifor - W. Soares");
		reuniao.setDataCompromisso(new Date());
		
		tarefa.setDescricao("Enilton - Teste");
		tarefa.setDataLembrete(new Date());
		tarefa.setLimiteExecucao(new Date());
		tarefa.setDataCompromisso(new Date());
		
		agenda.adicionarCompromissos(tarefa);
		agenda.adicionarCompromissos(reuniao);
		agenda.detalharCompromissos();
		new  Thread(agenda).start();
				
	}

}
