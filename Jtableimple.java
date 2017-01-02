package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;

import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attributewff.CustomAttribute;
import com.webfirmframework.wffweb.tag.html.tables.Table;
import com.webfirmframework.wffweb.tag.html.tables.Td;
import com.webfirmframework.wffweb.tag.html.tables.Tr;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;

public class Jtableimple {
	
	public static void main(String[] args) {

	    Html html = new Html(null) {
	        Body body = new Body(this) {
	            Table table = new Table(this, new CustomAttribute("border",
	                    "1px")) {

	                {
	                    Tr tr = new Tr(this) {
	                        Td td1 = new Td(this) {
	                            Blank cellContent = new Blank(this, "1");
	                        };
	                        Td td2 = new Td(this) {
	                            Blank cellContent = new Blank(this,
	                                    "First Name");
	                        };
	                        Td td3 = new Td(this) {
	                            Blank cellContent = new Blank(this, "Last Name");
	                        };
	                    };
	                    Tr tr1 = new Tr(this) {
	                        Td td1 = new Td(this, new CustomAttribute(
	                                "colspan", "3")) {
	                            Blank cellContent = new Blank(this,
	                                    "First Name");
	                        };

	                    };

	                }

	            };
	        };
	    };

	    html.setPrependDocType(true);
	    System.out.println(html.toHtmlString());
	}


}
