package com.antunesicaro.springboot.entities;

import java.io.Serializable;
import java.util.Objects;

//para o objeto trafegar na rede é preciso transformar em cadeia de bytes com serializable
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	//1-nomear atributos
	//2-relacionamentos, porém por ser a primeira entidade, não faz ainda.
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	/*
	 *Construtor vazio
	 *Instanciação de objetos: Permite criar um objeto da classe User sem a necessidade de fornecer valores iniciais para seus campos. Por exemplo, após criar o objeto usando o construtor vazio, você pode usar os métodos setters para atribuir valores aos campos individualmente.
	 *Utilização em frameworks e tecnologias: Alguns frameworks, como bibliotecas de mapeamento objeto-relacional (ORM) ou frameworks de serialização, exigem um construtor vazio para criar instâncias de objetos e preencher seus campos posteriormente.
     *Herança: Se a classe User for uma subclasse de outra classe, o construtor vazio pode ser necessário para garantir a correta construção do objeto e o encadeamento de construtores entre as classes pai e filha.
     *Refatoração e manutenção de código: Um construtor vazio pode ser útil ao modificar ou estender uma classe existente, permitindo a criação de objetos sem afetar a lógica de construção existente.
	 */
	public User() {
		
	}
	
	//construtor para popular valor
	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	//Getter and Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//equals e hash code
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
}
