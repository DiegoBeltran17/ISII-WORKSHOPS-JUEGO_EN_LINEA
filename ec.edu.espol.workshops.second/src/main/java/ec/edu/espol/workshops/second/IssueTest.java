package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;

import org.junit.Test;

public class IssueTest {

	@Test
	public void testCheckCredentials1() {
        Customer validCustomer = new Customer(30, 'M', true, true);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(200, valid, 0.01);
	}
	@Test
	public void testCheckCredentials2() {
        Customer validCustomer = new Customer(30, 'M', false, true);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(400, valid, 0.01);
	}
	@Test
	public void testCheckCredentials3() {
        Customer validCustomer = new Customer(18, 'M', false, true);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(2000, valid, 0.01);
	}
	@Test
	public void testCheckCredentials4() {
        Customer validCustomer = new Customer(50, 'F', true, true);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(300, valid, 0.01);
	}
	@Test
	public void testCheckCredentials5() {
        Customer validCustomer = new Customer(60, 'F', false, true);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(200, valid, 0.01);
	}
	@Test
	public void testCheckCredentials6() {
        Customer validCustomer = new Customer(60, 'M', false, true);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(400, valid, 0.01);
	}
	@Test
	public void testCheckCredentials7() {
        Customer validCustomer = new Customer(81, 'M', false, true);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(-1, valid, 0.01);
	}
	@Test
	public void testCheckCredentials8() {
        Customer validCustomer = new Customer(30, 'M', false, false);
        CarInsurance carInsurance = new CarInsurance();
        int valid = carInsurance.checkCredentials(validCustomer);
        assertEquals(-1, valid, 0.01);
	}
	
	
}
