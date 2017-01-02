package com.othersamples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.H3;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.Href;
import com.webfirmframework.wffweb.tag.html.attribute.event.mouse.OnClick;
import com.webfirmframework.wffweb.tag.html.attribute.global.ClassAttribute;
import com.webfirmframework.wffweb.tag.html.attribute.global.Id;
import com.webfirmframework.wffweb.tag.html.links.A;
import com.webfirmframework.wffweb.tag.html.lists.Li;
import com.webfirmframework.wffweb.tag.html.lists.Ul;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.programming.Script;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.StyleTag;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class TabbedPane {

	final Href href2 = new Href("javascript:void(0)");
	final ClassAttribute classAttribute3 = new ClassAttribute("tablinks");
	final ClassAttribute classAttribute8 = new ClassAttribute("tabcontent");

	public  void displayNavBar(){
	
	Html html = new Html(null) {{
		new Head(this) {{
			new StyleTag(this) {{
				
				new NoTag(this, "body {font-family: \"Lato\", sans-serif;}\r\n\r\nul.tab {\r\n    list-style-type: none;\r\n    "
						+ "margin: 0;\r\n    padding: 0;\r\n    overflow: hidden;\r\n    border: 1px solid #ccc;\r\n   "
						+ " background-color: #f1f1f1;\r\n}\r\n\r\n/* Float the list items side by side */\r\nul.tab li {float: left;}"
						+ "\r\n\r\n/* Style the links inside the list items */\r\nul.tab li a {\r\n\r\n   "
						+ " display: inline-block;\r\n    color: black;\r\n    text-align: center;\r\n    padding: 14px 16px;\r\n   "
						+ " text-decoration: none;\r\n    transition: 0.3s;\r\n    font-size: 17px;\r\n}\r\n\r\n/* Change background color of links on hover */\r\nul.tab li a:hover {\r\n   "
						+ " background-color: #ddd;\r\n}\r\n\r\n/* Create an active/current tablink class */\r\nul.tab li a:focus, "
						+ ".active {\r\n    background-color: #ccc;\r\n}\r\n\r\n/* Style the tab content */\r\n.tabcontent {\r\n   "
						+ " display: none;\r\n    padding: 6px 12px;\r\n    border: 1px solid #ccc;\r\n   "
						+ " border-top: none;\r\n}");
				
			}};
		}};
		new Body(this) {{
			new P(this) {{
				new NoTag(this, "Click on the links inside the tabbed menu:");
			}};
			new Ul(this,
				new ClassAttribute("tab")) {{
				new Li(this) {{
					new A(this,
						href2,
						classAttribute3,
						new OnClick("openCity(event, 'London')")) {{
						new NoTag(this, "London");
					}};
				}};
				new Li(this) {{
					new A(this,
						href2,
						classAttribute3,
						new OnClick("openCity(event, 'Paris')")) {{
						new NoTag(this, "Paris");
					}};
				}};
				new Li(this) {{
					new A(this,
						href2,
						classAttribute3,
						new OnClick("openCity(event, 'Tokyo')")) {{
						new NoTag(this, "Tokyo");
					}};
				}};
			}};
			new Div(this,
				new Id("London"),
				classAttribute8) {{
				new H3(this) {{
					new NoTag(this, "London");
				}};
				new P(this) {{
					new NoTag(this, "London is the capital city of England.");
				}};
			}};
			new Div(this,
				new Id("Paris"),
				classAttribute8) {{
				new H3(this) {{
					new NoTag(this, "Paris");
				}};
				new P(this) {{
					new NoTag(this, "Paris is the capital of France.");
				}};
			}};
			new Div(this,
				new Id("Tokyo"),
				classAttribute8) {{
				new H3(this) {{
					new NoTag(this, "Tokyo");
				}};
				new P(this) {{
					new NoTag(this, "Tokyo is the capital of Japan.");
				}};
			}};
			new Script(this) {{
				new NoTag(this, "function openCity(evt, cityName) {\r\n  "
						+ " var i, tabcontent, tablinks;\r\n    tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n   "
						+ " for (i = 0; i < tabcontent.length; i++) {\r\n        tabcontent[i].style.display = \"none\";\r\n    }\r\n   "
						+ " tablinks = document.getElementsByClassName(\"tablinks\");\r\n    for (i = 0; i < tablinks.length; i++) {\r\n  "
						+ "     tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\r\n    }\r\n  "
						+ "  document.getElementById(cityName).style.display = \"block\";\r\n  "
						+ "  evt.currentTarget.className += \" active\";\r\n}");
				
			}};
		}};
	}};
	 	
	
	html.setPrependDocType(true);
	
	System.out.println(html.toHtmlString());
	
	}
	public static void main(String[] args) {
		
		TabbedPane tabbedpane=new TabbedPane();
		
		tabbedpane.displayNavBar();
		
	}
}
