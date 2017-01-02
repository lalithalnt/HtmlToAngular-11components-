package com.othersamples;

import java.awt.Checkbox;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Br;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attribute.Action;
import com.webfirmframework.wffweb.tag.html.attribute.Name;
import com.webfirmframework.wffweb.tag.html.attribute.Type;
import com.webfirmframework.wffweb.tag.html.attribute.Value;
import com.webfirmframework.wffweb.tag.html.attributewff.CustomAttribute;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Form;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Input;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.tables.Table;
import com.webfirmframework.wffweb.tag.html.tables.Td;
import com.webfirmframework.wffweb.tag.html.tables.Tr;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class JcheckBox 
{
	public static void main(String[] args) 
	 {
		 final Type type1 = new Type("checkbox");
		 final Name name2 = new Name("vehicle");

		 Html html = new Html(null) {{
		 	new Head(this);
		 	new Body(this) {{
		 		new Form(this,
		 			new Action()) {{
		 			new Input(this,
		 				type1,
		 				name2,
		 				new Value("Bike"));
		 			new NoTag(this, "I have a bike ");
		 			new Br(this);
		 			new Input(this,
		 				type1,
		 				name2,
		 				new Value("Car"));
		 			new NoTag(this, "I have a car ");
		 		}};
		 	}};
		 }};
	 
		 html.setPrependDocType(true);
		 System.out.println(html.toHtmlString());
	}
	
}        
	            
	            
	            
