import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {
	
	@Given("^Um cliente especial com saldo de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^for solicitado um saque de (\\d+) reais$")
	public void for_solicitado_um_saque_de_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^deve efetuar o saque e atualizar o saldo para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_para_reais(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
