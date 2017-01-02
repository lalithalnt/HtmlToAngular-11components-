package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attribute.Href;
import com.webfirmframework.wffweb.tag.html.links.A;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class LableWithHyperLink {
	
	public void displayHiperlink(){
		
		Html html = new Html(null) {{
			new Head(this);
			new Body(this) {{
				new A(this,
					new Href("http://www.Google.com")) {{
					new NoTag(this, "Visit Google.com!");
				}};
			}};
		}};
		html.setPrependDocType(true);
		System.out.println(html.toHtmlString());
	}

public static void main(String[] args) {

	LableWithHyperLink lablewithhyperlink = new LableWithHyperLink();
	
	lablewithhyperlink.displayHiperlink();
	
	}

}

