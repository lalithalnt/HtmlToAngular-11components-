package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.event.mouse.OnClick;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Button;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.programming.Script;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class JoptionPane {

	public void displayAlertBox(){
		
		Html html = new Html(null) {{
			new Head(this);
			new Body(this) {{
				new P(this) {{
					new NoTag(this, "Click the button to display an alert box.");
				}};
				new Button(this,
					new OnClick("myFunction()")) {{
					new NoTag(this, "Try it");
				}};
				new Script(this) {{
					new NoTag(this, "function myFunction() {\r\n    alert(\"Hello! I am an alert box!\");\r\n}");
				}};
			}};
		}};
		html.setPrependDocType(true);
		System.out.println(html.toHtmlString());
	}

	public static void main(String[] args) {

		JoptionPane jop = new JoptionPane();

		jop.displayAlertBox();

	}
	}

