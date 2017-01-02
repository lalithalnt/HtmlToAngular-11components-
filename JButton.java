package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attribute.Type;
import com.webfirmframework.wffweb.tag.html.attribute.event.mouse.OnClick;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Button;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class JButton {

	public void method(){
		
		Html html = new Html(null) {{
			new Head(this);
			new Body(this) {{
				new Button(this,
					new Type("button"),
					new OnClick("alert('Hello world!')")) {{
					new NoTag(this, "Click Me!");
				}};
			}};
		}};
		html.setPrependDocType(true);
		System.out.println(html.toHtmlString());
	}

	public static void main(String[] args) {

		JButton button = new JButton();

		button.method();

	}
	
}