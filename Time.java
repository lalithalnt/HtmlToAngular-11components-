package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.H1;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.event.mouse.OnClick;
import com.webfirmframework.wffweb.tag.html.attribute.global.Id;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Button;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class Time {
	
	public void displayTime(){
		
		Html html = new Html(null) {{
			new Head(this);
			new Body(this) {{
				new H1(this) {{
					new NoTag(this, "My First JavaScript");
				}};
				
				new P(this,
						new Id("demo"));
				new Button(this,
						new OnClick("document.getElementById('demo').innerHTML = Date()")) {{
					new NoTag(this, " Date and Time.");
				}};
				
			}};
		}};
		html.setPrependDocType(true);
	
		System.out.println(html.toHtmlString());
	}

	public static void main(String[] args) {

		Time time = new Time();

		time.displayTime();

	}
	
	
}