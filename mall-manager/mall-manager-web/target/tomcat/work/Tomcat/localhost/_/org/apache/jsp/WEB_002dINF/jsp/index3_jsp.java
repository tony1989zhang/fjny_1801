/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-15 00:28:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<!--easyui-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/jquery.min.js\" type=\"text/javascript\"\r\n");
      out.write("\tcharset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/jquery.easyui.min.js\" type=\"text/javascript\"\r\n");
      out.write("\tcharset=\"utf-8\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\ttype=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("<!--开发-->\r\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"../easyui/themes/gray/easyui.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/superBlue.css\" id=\"themeCss\">\r\n");
      out.write("\t\t<script src=\"js/super.js\" type=\"text/javascript\" charset=\"utf-8\"></script>-->\r\n");
      out.write("<!--测试dist-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/super/css/font-awesome.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/super/superBlue.css\" id=\"themeCss\" />\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/easyui/themes/super/super.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/superDemo.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"main\" class=\"easyui-layout\">\r\n");
      out.write("\t<div data-options=\"region:'north',border:false\" class=\"super-north\">\r\n");
      out.write("\t\t<!--顶部-->\r\n");
      out.write("\t\t<div class=\"super-navigation\">\r\n");
      out.write("\t\t\t<!--系统名称-->\r\n");
      out.write("\t\t\t<div class=\"super-navigation-title\">SUPER THEME</div>\r\n");
      out.write("\t\t\t<!--自定义导航-->\r\n");
      out.write("\t\t\t<div class=\"super-navigation-main\">\r\n");
      out.write("\t\t\t\t<div class=\"super-setting-left\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-commenting-o\"></i>消息</li>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-envelope-o\"></i>邮件</li>\r\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fa fa-bell-o\"></i>通知</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"super-setting-right\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"super-setting-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-gears\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"mm\" class=\"easyui-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>个人中心</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"themeSetting\">主题</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"logout\">退出</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"user\"><span class=\"user-icon\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"img/favicon.png\" /></span>管理员</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'west',title:'MAIN NAVIGATION',border:false\"\r\n");
      out.write("\t\tclass=\"super-west\">\r\n");
      out.write("\t\t<!--左侧导航-->\r\n");
      out.write("\t\t<div class=\"easyui-accordion\"\r\n");
      out.write("\t\t\tdata-options=\"border:false,fit:true,selected:true\">\r\n");
      out.write("\t\t\t<div title=\"布局\" data-options=\"iconCls:'fa fa-desktop'\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/panel.html'>面板</li>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/tabs.html'>选项卡</li>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/accordion.html'>分类</li>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/layout.html'>布局</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"基本元素\" data-options=\"iconCls:'fa fa-wpforms'\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/button.html'>按钮</li>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/form.html'>表单</li>\r\n");
      out.write("\t\t\t\t\t<li data-url=\"example/menu.html\">菜单</li>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/other.html'>其他</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"窗口\" data-options=\"iconCls:'fa fa-window-maximize'\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/window.html'>窗口</li>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/dialog.html'>对话框</li>\r\n");
      out.write("\t\t\t\t\t<li data-url=\"example/message.html\">消息窗口</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"表格和树\" data-options=\"iconCls:'fa fa-table'\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/datagrid.html'>表格</li>\r\n");
      out.write("\t\t\t\t\t<li data-url='example/tree.html'>树</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"扩展\" data-options=\"iconCls:'fa fa-sitemap'\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li data-url='pagination.html'>嘿嘿嘿</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center'\" style=\"padding-top: 2px;\">\r\n");
      out.write("\t\t<!--主要内容-->\r\n");
      out.write("\t\t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"border:false,fit:true\">\r\n");
      out.write("\t\t\t<div title=\"首页\" data-options=\"iconCls:'fa fa-home'\">\r\n");
      out.write("\t\t\t\t<div style=\"padding: 20px;\">放点什么好呢......</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'south'\" class=\"super-south\">\r\n");
      out.write("\t\t<!--页脚-->\r\n");
      out.write("\t\t<div class=\"super-footer-info\">\r\n");
      out.write("\t\t\t<span><i class=\"fa fa-info-circle\"></i> 作者：tianyu</span> <span><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-copyright\"></i> CopyRight 2017 版权所有 <i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-caret-right\"></i></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--主题设置弹窗-->\r\n");
      out.write("\t<div id=\"win\">\r\n");
      out.write("\t\t<div class=\"themeItem\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"superGreen\" style=\"background: #1abc9c;\">green</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"themeActive\">\r\n");
      out.write("\t\t\t\t\t<div class=\"superBlue\" style=\"background: #3498db;\">blue</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"superGray\" style=\"background: #95a5a6;\">gray</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"superAmethyst\" style=\"background: #9b59b6;\">amethyst</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"superBlack\" style=\"background: #34495e;\">black</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"superYellow\" style=\"background: #e67e22;\">yellow</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"superEmerald\" style=\"background: #2ecc71;\">emerald</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"superRed\" style=\"background: #e74c3c;\">red</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
