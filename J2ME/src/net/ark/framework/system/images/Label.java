package net.ark.framework.system.images;

import net.ark.framework.system.images.j2me.J2MELabel;
import net.ark.framework.system.images.j2me.Number;
import net.ark.framework.components.Drawable;
import net.ark.framework.system.Utilities;

public abstract class Label extends Drawable {	
	protected Label(String text, float x, float y) {
		//Init
		super();
		
		//initialize
		m_Text = text;
		if (m_Text == null) m_Text = "";
		setPosition(x, y);
	}

	public static Label create(String text) 													{ return Label.create(text, Utilities.instance().getSystemFont(), 0, 0); 										}
	public static Label createInteger(int number) 												{ return Label.create("" + number);																				}
	public static Label create(String text, String font) 										{ return Label.create(text, font, 0, 0); 																		}
	public static Label createInteger(int number, String font) 									{ return Label.create("" + number, font);																		}
	public static Label create(String text, String font, float x, float y) 						{ return new J2MELabel(text, font, x, y);																		}
	public static Label createInteger(int number, String font, float x, float y)				{ return Label.create("" + number, font, x, y);																	}
	public static Label createFloat(float number, int decimal, String font) 					{ return Label.create(Utilities.instance().writeFloat(number, decimal), font);									}
	public static Label createFloat(float number, int decimal, String font, float x, float y)	{ return Label.create(Utilities.instance().writeFloat(number, decimal), font, x, y);							}
	public static Label createFloat(float number, int decimal) 									{ return Label.create(Utilities.instance().writeFloat(number, decimal), Utilities.instance().getSystemFont());	}
	
	public static Label createNumber(int number, int font, int alignment)					{ return new Number(number, font, alignment);		}
	public static Label createNumber(int number, int font, float x, float y, int alignment)	{ return new Number(number, font, x, y, alignment);	}
	public static Label createNumber(int number, int font, float x, float y)				{ return new Number(number, font, x, y);			}
	public static Label createNumber(int number, int font)									{ return new Number(number, font);					}
	
	public String getText()	{	return m_Text;	}
	
	//Data
	protected String m_Text;
}
