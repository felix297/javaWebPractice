<%
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
%>
<p>
    Your name is: <%=name1%><br/>
    Your name is: <%=name2%><br/>
    Your name is: <%=name3%><br/>
    Your name is: <%=name4%><br/>
</p>
