package object;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import object.example.Car;
import object.relation.Algorithm;
import object.relation.AlgorithmAdvanced;
import object.relation.Bubble;
import object.relation.Quick;
import object.relation.Sort;

public class RelationTest {
	
	@Test
	public void dependencyTest() {
		//Algorithm al = new Bubble();
		Algorithm al = new Quick();
		
		Sort sort = new Sort(al);
		
		sort.print();
	}

}










