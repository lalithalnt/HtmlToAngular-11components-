package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Br;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.Action;
import com.webfirmframework.wffweb.tag.html.attribute.Name;
import com.webfirmframework.wffweb.tag.html.attribute.Type;
import com.webfirmframework.wffweb.tag.html.attribute.Value;
import com.webfirmframework.wffweb.tag.html.attribute.global.Id;
import com.webfirmframework.wffweb.tag.html.attributewff.CustomAttribute;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Form;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Input;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Label;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.tables.Table;
import com.webfirmframework.wffweb.tag.html.tables.Td;
import com.webfirmframework.wffweb.tag.html.tables.Tr;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class JLabel {
	public static void main(String[] args) 
	 {
	
	
	final Type type3 = new Type("radio");
	final Name name4 = new Name("gender");

	Html html = new Html(null) {{
		new Head(this);
		new Body(this) {{
			new P(this) {{
				new NoTag(this, "Click on one of the text labels :");
			}};
			new Form(this,
				new Action("SwingToAngular_form.asp")) {{
				new Label(this,
					new CustomAttribute("for", "male")) {{
					new NoTag(this, "Male");
				}};
				new Input(this,
					type3,
					name4,
					new Id("male"),
					new Value("male"));
				new Br(this);
				new Label(this,
					new CustomAttribute("for", "female")) {{
					new NoTag(this, "Female");
				}};
				new Input(this,
					type3,
					name4,
					new Id("female"),
					new Value("female"));
				new Br(this);
				new Label(this,
					new CustomAttribute("for", "other")) {{
					new NoTag(this, "Other");
				}};
				new Input(this,
					type3,
					name4,
					new Id("other"),
					new Value("other"));
				new Br(this);
				new Br(this);
				new Input(this,
					new Type("submit"),
					new Value("Submit"));
			}};
		}};
	}};
	 html.setPrependDocType(true);
	 System.out.println(html.toHtmlString());
	
	 }
}
