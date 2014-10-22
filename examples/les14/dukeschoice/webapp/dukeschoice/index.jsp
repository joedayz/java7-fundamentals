<%@ page import = " java.util.*,duke.init.*,duke.item.*,duke.util.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Apache Tomcat Examples</TITLE>
        <META http-equiv=Content-Type content="text/html">
    </HEAD>
    <BODY>
        <P>
        <P>
            <!--<table border="0" style="margin: auto;"> -->
        <table border="0" cellpadding=20> 
            <tr><th><H2>Welcome to Duke's Choice</th></tr></H2>
        <tr><td> <a href="listItems.jsp"> <img src="images/Duke.png"></a></td>

        <tr>
            <th>
                <a href="listItems.jsp">Go to search page</a>
            </th>
        </tr>
    </table>
</p>
<br>

<%
// Initialize the DukesDB object
    DukesDB theDB = new DukesDB();
    theDB.setupDb();
    session.setAttribute("dataSource", theDB);
%>

</BODY>
</HTML>
