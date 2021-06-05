package Prioridade;

import Pessoa.Pessoa;

public class Prioridade {
	public int verificaPrioridade(int idade, String profissao, boolean comorbidade, String raca, boolean gestante) {
		if ((idade >= 65) || (profissao == "Médico") || (profissao == "Enfermeiro") || (profissao == "Téc. Enfermagem") || (profissao == "Profissionais da Saúde")) {
			return 1;
		}else if ((idade >= 45) || (comorbidade == true) || (gestante == true) || (profissao == "Professor")) {
			return 2;
		}else if (raca == "Indíngena") {
			return 3;
		}else {
			return 4;
		}
	}
	
	public static int verificaPrioridade(Pessoa pessoa) {
		if ((pessoa.getIdade() >= 65) || (pessoa.getProfissao() == "Médico") || (pessoa.getProfissao() == "Enfermeiro") || (pessoa.getProfissao() == "Téc. Enfermagem") || (pessoa.getProfissao() == "Profissionais da Saúde")) {
			return 1;
		}else if ((pessoa.getIdade() >= 45) || (pessoa.isComorbidade() == true) || (pessoa.isGestante() == true) || (pessoa.getProfissao() == "Professor")) {
			return 2;
		}else if (pessoa.getRaca() == "Indíngena") {
			return 3;
		}else {
			return 4;
		}
	}
}

//Dentre as pessoas com comorbidades, apenas aquelas que se enquadram a lista elencada pelo PNI poderão se vacinar, são elas:

//Diabetes mellitus;
//Pneumopatias crônicas graves;
//Hipertensão Arterial Resistente (HAR);
//Hipertensão arterial estágio 3;
//Hipertensão arterial estágios 1 e 2 com lesão em órgão-alvo e/ou comorbidade;
//Insuficiência cardíaca (IC);
//Cor-pulmonares e Hipertensão pulmonar;
//Cardiopatia hipertensiva;
//Síndromes coronarianas;
//Valvopatias; Miocardiopatias e Pericardiopatias;
//Doenças da Aorta, dos Grandes Vasos e Fístulas arteriovenosas;
//Arritmias cardíacas;
//Cardiopatias congênita no adulto;
//Próteses valvares e Dispositivos cardíacos implantados;
//Doença cerebrovascular;
//Doença renal crônica;
//Imunossuprimidos;
//Hemoglobinopatias graves;
//Obesidade mórbida Índice de massa corpórea (IMC) ≥ 40;
//Cirrose hepática.