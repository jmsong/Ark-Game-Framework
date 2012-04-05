package net.ark.framework.system.images;

import javax.microedition.khronos.opengles.GL10;

import net.ark.framework.components.Drawable;
import net.ark.framework.system.images.android.AndroidLabel;

public abstract class Label extends Drawable {	
	protected Label(String text, float x, float y) {
		//Init
		super();
		
		//initialize
		m_Text = text;
		setPosition(x, y);
	}
	
	public static Label create(String text, String font) 									{ return Label.create(text, font, 0, 0); 			}
	public static Label createNumber(int number, String font) 								{ return Label.create("" + number, font);			}
	public static Label create(String text, String font, float x, float y) 					{ return new AndroidLabel(text, font, x, y);		}
	public static Label createNumber(int number, String font, float x, float y) 			{ return Label.create("" + number, font, x, y);		}
	
	public String getText()	{	return m_Text;	}
	
	@Override
	public abstract void draw(GL10 gl);
	
	//Data
	protected String m_Text;
}
