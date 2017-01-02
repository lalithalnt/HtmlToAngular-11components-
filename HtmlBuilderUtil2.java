package com.othersamples;
	
/**
 * 
 */

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Br;
import com.webfirmframework.wffweb.tag.html.H1;
import com.webfirmframework.wffweb.tag.html.H3;
import com.webfirmframework.wffweb.tag.html.Hr;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.Action;
import com.webfirmframework.wffweb.tag.html.attribute.Href;
import com.webfirmframework.wffweb.tag.html.attribute.Name;
import com.webfirmframework.wffweb.tag.html.attribute.Type;
import com.webfirmframework.wffweb.tag.html.attribute.Value;
import com.webfirmframework.wffweb.tag.html.attribute.event.mouse.OnClick;
import com.webfirmframework.wffweb.tag.html.attribute.global.ClassAttribute;
import com.webfirmframework.wffweb.tag.html.attribute.global.Id;
import com.webfirmframework.wffweb.tag.html.attribute.global.Style;
import com.webfirmframework.wffweb.tag.html.attributewff.CustomAttribute;
import com.webfirmframework.wffweb.tag.html.formatting.Strong;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Button;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Form;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Input;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Label;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Option;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Select;
import com.webfirmframework.wffweb.tag.html.formsandinputs.TextArea;
import com.webfirmframework.wffweb.tag.html.html5.identifier.NavAttributable;
import com.webfirmframework.wffweb.tag.html.html5.links.Nav;
import com.webfirmframework.wffweb.tag.html.html5.stylesandsemantics.Section;
import com.webfirmframework.wffweb.tag.html.identifier.TextAreaAttributable;
import com.webfirmframework.wffweb.tag.html.links.A;
import com.webfirmframework.wffweb.tag.html.lists.Li;
import com.webfirmframework.wffweb.tag.html.lists.Ul;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.programming.Script;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.StyleTag;
import com.webfirmframework.wffweb.tag.html.tables.TBody;
import com.webfirmframework.wffweb.tag.html.tables.Table;
import com.webfirmframework.wffweb.tag.html.tables.Td;
import com.webfirmframework.wffweb.tag.html.tables.Th;
import com.webfirmframework.wffweb.tag.html.tables.Tr;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

/**
 * @author Poc
 *
 */
public class HtmlBuilderUtil2 {
	
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

public void displayCheckbox()
{
	Html html = new Html(null) {{
		final Type type1 = new Type("checkbox");
		final Name name2 = new Name("vehicle");
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
public void displayRadioButton(){
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

public void displayTable()
{
	Html html=new Html(null){
		Head head=new Head(this)
				{
			StyleTag st=new StyleTag(this)
			{
		NoTag nt=new NoTag(this,"body{background:pink;}table{align:center;border-collapse:collapse;width:60%;}td,tr{border:1px solid grey;padding:8px;}"
				+ "h1{color:grey;text-align:center;}tr:nth-child(even){background-color:lightgrey;}");
			};//style
				};//head
		Body body=new Body(this){
			Br br=new Br(this);
			H1 h1=new H1(this){
        		Blank h1=new Blank(this,"Person Data");
        	};
			Br br1=new Br(this);
			Hr hr=new Hr(this);
			Table table=new Table(this){
				TBody tbody=new TBody(this){
					Tr tr1=new Tr(this){
						Th fullname=new Th(this){
							NoTag fullname=new NoTag(this,"FullName");
						};//th
						Th address=new Th(this){
							NoTag address=new NoTag(this,"Address");
						};//th
						Th phone=new Th(this){
							NoTag phone=new NoTag(this,"Phone");
						};//th
					};//tr
					Tr tr2=new Tr(this){
						Td fullname=new Td(this){
							NoTag fullname=new NoTag(this,"Saritha");
						};//th
						Td address=new Td(this){
							NoTag address=new NoTag(this,"Hyderabad");
						};//th
						Td phone=new Td(this){
							NoTag phone=new NoTag(this,"9856231245");
						};//th
					};//tr
					Tr tr3=new Tr(this){
						Td fullname=new Td(this){
							NoTag fullname=new NoTag(this,"Harika");
						};//th
						Td address=new Td(this){
							NoTag address=new NoTag(this,"Chennai");
						};//th
						Td phone=new Td(this){
							NoTag phone=new NoTag(this,"9856212245");
						};//th
					};//tr
					Tr tr4=new Tr(this){
						Td fullname=new Td(this){
							NoTag fullname=new NoTag(this,"Manasa");
						};//th
						Td address=new Td(this){
							NoTag address=new NoTag(this,"Hyderabad");
						};//th
						Td phone=new Td(this){
							NoTag phone=new NoTag(this,"8556231249");
						};//th
					};//tr
				};//tbody
			};//table
		};//body
	};//html




	// prepends the doc type <!DOCTYPE html>
	html.setPrependDocType(true);
	System.out.println(html.toHtmlString()); 

		}//displaytable() method
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
	
public void displayTextFormat(){
	
	Html html = new Html(null) {{
		new Head(this);
		new Body(this) {{
			new P(this) {{
				new NoTag(this, "This is some text.");
			}};
			new Div(this,
				new Style("color:#0000FF")) {{
				new H3(this) {{
					new NoTag(this, "This is a heading in a div element");
				}};
				new P(this) {{
					new NoTag(this, "This is some text in a div element.");
				}};
			}};
			new P(this) {{
				new NoTag(this, "This is some text.");
			}};
		}};
	}};
	html.setPrependDocType(true);
	System.out.println(html.toHtmlString());
}
public  void displayNavBar(){
	final Href href2 = new Href("javascript:void(0)");
	final ClassAttribute classAttribute3 = new ClassAttribute("tablinks");
	final ClassAttribute classAttribute8 = new ClassAttribute("tabcontent");
	
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


	public static void main(String[] arg) 
	{
		
		HtmlBuilderUtil2 ff = new HtmlBuilderUtil2();
		
		Html html = ff.htmlTagCreator();
		
		ff.headTagCreator(html);
		
		Body body = ff.bodyTagCreator(html);
		
		Div div = new Div(body, null);
		
		//Button button = new Button(div, null);
		
		//NoTag notag = ff.noTagCreator(div, "Hello World");
		
		div.addAttributes();
		
	ff.box();
	ff.method();
	ff.displayCheckbox();
	ff.displayRadioButton();
	ff.displayMenubar();
	ff.displayAlertBox();
	ff.displayTable();
	ff.displayHiperlink();
	ff.displayTextFormat();
	ff.displayNavBar();
	ff.displayTime();
		System.out.println(html.toHtmlString());
	
	}

	/**
	 * this program is to add on html conversion code
	 * 
	 * @Jar wffweb-2.1.3 is mandate for this program
	 * 
	 */
	
	
	/**
	 * Html tag creator
	 * */
	public Html htmlTagCreator() {
		Html html = new Html(null);
		html.setPrependDocType(true);
		return html;
	}
	
	public Head headTagCreator(Html html) {
		return new Head(html);
	}
	
	public Body bodyTagCreator(Html html) {
		return new Body(html);
	}
	
	public Div divTagCreator(Object object) {
		
		if(object instanceof Body){
			
			return new Div((Body)object, null);
			
		}else if(object instanceof Div){
			
			return new Div((Div)object, null);
		}
		return new Div(null, null);
	}
	
	/*public TextArea TextAreaCreator(Object object){
		
		if(object instanceof Div){
		
		return new TextArea("Hi.........");	
		
		}
	}*/
	
	/*public TextArea(object, null)*/
	
	/**
	 * Custom tag container to hold components
	 * @param object
	 * @param content
	 * 
	 * @return NoTag object
	 * */
	public NoTag noTagCreator(Object object, String content) {
		
		if(object instanceof Body){
			
			return new NoTag((Body)object, content);
			
		}else if(object instanceof Div){
			
			return new NoTag((Div)object, content);
		}
		return new NoTag((Body)object, content);
	}
	
	
}
