package utilities;

public class Pessoa {

private Integer idade;
private Double altura;
private String nome;


public Integer getIdade() {
	return idade;
}

public void setIdade(Integer idade) {
	this.idade = idade;
}

public Double getAltura() {
	return altura;
}

public void setAltura(Double altura) {
	this.altura = altura;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String toString (){
	return this.nome;
}
	
}
