package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsonex2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        <script>\n");
      out.write("             function getJson1(){\n");
      out.write("               ajax = new XMLHttpRequest();\n");
      out.write("                ajax.open(\"GET\",\"JsonController?op=getjson\",true);\n");
      out.write("                ajax.send();\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                ajax.onreadystatechange= function(){ \n");
      out.write("                     if (this.status==200 && this.readyState==4){\n");
      out.write("                        output = this.responseText; \n");
      out.write("                        //p1.innerHTML = output;\n");
      out.write("                        //alert(output);\n");
      out.write("                        \n");
      out.write("                        obj = JSON.parse(output);\n");
      out.write("                        p1.innerHTML = \"Name \" + obj.name +\"<br/>\" + \"Age : \" + obj.age;\n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("                \n");
      out.write("       \n");
      out.write("           \n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("            \n");
      out.write("    $(\"#b2\").click(function(){\n");
      out.write("        $.get(\"JsonController?op=getjson2\",function(responseText){\n");
      out.write("           $(\"#p1\").html(responseText);\n");
      out.write("           object = JSON.parse(responseText);\n");
      out.write("             $(\"#p1\").html(($(\"#p1\").html()+ \"<br/>\" + object.rollno +\"<br/>\" +object.name +\"<br/>\"+object.age));\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("      \n");
      out.write("       $(\"#b3\").click(function(){\n");
      out.write("        $.get(\"JsonController?op=getjson3\",function(responseText){\n");
      out.write("          students = JSON.parse(responseText);\n");
      out.write("          for (i=0;i<students.length;i++)\n");
      out.write("          {\n");
      out.write("              record = \"rollno :\"+ students[i].rollno +\", Name : \" + students[i].name +\", Age : \" + students[i].age +\"<hr/>\";\n");
      out.write("              $(\"#p1\").append(record);\n");
      out.write("           \n");
      out.write("          }\n");
      out.write("       });\n");
      out.write("    });\n");
      out.write("      \n");
      out.write("});\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <input type=\"button\" value=\"load json1\" onclick=\"getJson1();\"/>\n");
      out.write("        <br/>\n");
      out.write("        <input type=\"button\" id=\"b2\" value=\"Load Jason from java class\" />\n");
      out.write("        \n");
      out.write("        <input type=\"button\" id=\"b3\" value=\"Load json Array\"/>\n");
      out.write("        <p id=\"p1\">\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
