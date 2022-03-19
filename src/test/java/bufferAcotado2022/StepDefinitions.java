package bufferAcotado2022;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	private BufferAcotado<String> buffer;
	private int numeroElementosContenidos = 0;
	boolean bufferLleno = false;
	String primerElemento;
	@Given("I have a buffer with a capacity of {int}")
	public void i_have_a_buffer_with_a_capacity_of(Integer int1) {
		buffer = new BufferAcotado<String>(int1);
	}
	@When("I add an {string}")
	public void i_add_an(String string) {
	    try {
	    	buffer.put(string);
		    numeroElementosContenidos++;
	    } catch (IllegalStateException e) {
	    	bufferLleno = true;
	    }
	}

	@And("{string} is the first element")
	public void who_is_the_first(String s) {
	    primerElemento = s;
	}
	@Then("It will be added to the buffer")
	public void it_will_be_added_to_the_buffer() {
		Assertions.assertEquals(numeroElementosContenidos, buffer.size());
	}
	@Given("I have a full buffer")
	public void i_have_a_full_buffer() {
		buffer = new BufferAcotado<String>(2);
		buffer.put("firstElementAdded");
		buffer.put("secondElementAdded");
	}
	@Then("I will not be able to add the element")
	public void i_won_t_be_able_to_add_the_element() {
	    Assertions.assertEquals(true, bufferLleno);
	}
	@And("The buffer is not full")
	public void the_buffer_is_not_full() {
	    Assertions.assertFalse(buffer.isFull());
	}
	@Then("The first element to get should be the first I have put in the buffer")
	public void the_first_element_to_get_should_be_the_first_i_have_put_in_the_buffer() {
	   Assertions.assertEquals(primerElemento, buffer.get());
	}
	@Then("The size should be {int}")
	public void the_size_should_be(Integer int1) {
	    Assertions.assertEquals(int1, buffer.size());
	}
	@Then("The size should be full")
	public void the_size_should_be_full() {
		Assertions.assertTrue(buffer.isFull());
	}
	@Then("The buffer should be empty")
	public void the_buffer_should_be_empty() {
		 Assertions.assertTrue(buffer.isEmpty());
	}



}
