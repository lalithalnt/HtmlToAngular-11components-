package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attribute.Value;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Option;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Select;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class ComboBox {
	
	public void box(){
		
		Html html = new Html(null) {{
			new Head(this);
			new Body(this) {{
				new Select(this) {{
					new Option(this,
						new Value("Java")) {{
						new NoTag(this, "Java");
					}};
					new Option(this,
						new Value("CPP")) {{
						new NoTag(this, "CPP");
					}};
					new Option(this,
						new Value(".Net")) {{
						new NoTag(this, ".Net");
					}};
					new Option(this,
						new Value("PHP")) {{
						new NoTag(this, "PHP");
					}};
				}};
			}};
		}};
		html.setPrependDocType(true);
	
		
		System.out.println(html.toHtmlString());
	}//method

public static void main(String[] args) {

	ComboBox combobox = new ComboBox();
	
	combobox.box();
	}//method
}//class
