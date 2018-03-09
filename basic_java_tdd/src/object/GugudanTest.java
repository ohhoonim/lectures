package object;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import object.example.Gugudan;

public class GugudanTest {
	@Test
	public void gugudanTest() {
		
		Gugudan gugu = new Gugudan(8, 17);

		gugu.setWidth(6);
		gugu.print();
		
	}
}


















