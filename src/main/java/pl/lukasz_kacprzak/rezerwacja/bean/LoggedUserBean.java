package pl.lukasz_kacprzak.rezerwacja.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="loggedUserBean")
@RequestScoped
public class LoggedUserBean {
	public LoggedUserBean() {
		System.out.println("LoggedUserBean Start!");
	}

	public String getMesssage() {
		return "LoggedUserBean Hello World!";
	}
}