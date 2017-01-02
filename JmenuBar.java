package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.Href;
import com.webfirmframework.wffweb.tag.html.formatting.Strong;
import com.webfirmframework.wffweb.tag.html.html5.links.Nav;
import com.webfirmframework.wffweb.tag.html.links.A;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class JmenuBar {
	
	public void displayMenubar(){
		
		Html html = new Html(null) {{
			new Head(this);
			new Body(this) {{
				new Nav(this) {{
					new A(this,
						new Href("Java")) {{
						new NoTag(this, "Java");
					}};
					new NoTag(this, " | ");
					new A(this,
						new Href("/Php/")) {{
						new NoTag(this, "PHP");
					}};
					new NoTag(this, " | ");
					new A(this,
						new Href("/JavaScript/")) {{
						new NoTag(this, "JavaScript");
					}};
					new NoTag(this, " | ");
					new A(this,
						new Href("/Jq/")) {{
						new NoTag(this, "jQuery");
					}};
				}};
				new P(this) {{
					new Strong(this) {{
						new NoTag(this, "Note:");
					}};
					new NoTag(this, " The nav tag is not supported in Internet Explorer 8 and earlier versions.");
				}};
			}};
		}};
		html.setPrependDocType(true);
		System.out.println(html.toHtmlString());
	}

	public static void main(String[] args) {

		JmenuBar jmenubar = new JmenuBar();

		jmenubar.displayMenubar();

	}
	}


