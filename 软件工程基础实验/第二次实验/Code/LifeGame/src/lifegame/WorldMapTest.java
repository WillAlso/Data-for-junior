package lifegame;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.junit.Before;
import org.junit.Test;

public class WorldMapTest {

	private static WorldMap world = new WorldMap();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPaintComponentGraphics() {
		int t = 0;
		world.timer = new Timer(1000, new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
            	System.out.println(0);
            }  
        });
		world.timer.start();
		if(world.timer.isRunning()) {
			System.out.println("Timer is running");
		}else {
			System.out.println("Timer is not running");
		}
		world.timer.stop();
		if(world.timer.isRunning()) {
			System.out.println("Timer is running");
		}else {
			System.out.println("Timer is not running");
		}
		
		System.out.println("Success");
	}

	@Test
	public void testSetWorldSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWorld_w() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWorld_h() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDesignWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetArrowWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSquareWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGliderWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetTempWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testStopWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testSpeedWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testSlowWorld() {
		fail("Not yet implemented");
	}

}
