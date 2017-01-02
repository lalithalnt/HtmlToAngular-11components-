package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.H3;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.global.Style;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class Panel {
	
	public void displayTextFormat(){
		
		Html html = new Html(null) {{
			new Head(this);
			new Body(this) {{
				new P(this) {{
					new NoTag(this, "This is some text.");
				}};
				new Div(this,
					new Style("color:#0000FF")) {{
					new H3(this) {{
						new NoTag(this, "This is a heading in a div element");
					}};
					new P(this) {{
						new NoTag(this, "This is some text in a div element.");
					}};
				}};
				new P(this) {{
					new NoTag(this, "This is some text.");
				}};
			}};
		}};
		html.setPrependDocType(true);
		System.out.println(html.toHtmlString());
	}

	public static void main(String[] args) {

		Panel panel = new Panel();

		panel.displayTextFormat();

	}
	}


