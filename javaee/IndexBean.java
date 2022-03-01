package br.com.softblue.javaee;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class IndexBean implements Serializable {

	public String getMensagem() {
		return "Esta � uma mensagem vinda do bean (2)!";
	}
}
