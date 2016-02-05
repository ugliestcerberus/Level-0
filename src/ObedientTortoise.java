import org.teachingextensions.logo.Tortoise;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		
		drawSquare();
		
		for(int i=0;i<3;i++){}
	}

	private static void drawSquare() {
		for (int i = 0; i < 4; i++) {
		Tortoise.move(200);
		Tortoise.turn(90);
		
		}
	}
		


	
}
