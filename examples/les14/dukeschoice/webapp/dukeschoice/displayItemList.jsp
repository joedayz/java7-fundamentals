<%@ page import = " java.util.*,java.io.*,duke.init.*,duke.item.*,duke.util.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Duke's Choice Example</TITLE>
        <META http-equiv=Content-Type content="text/html">
    </HEAD>
    <BODY>
        <P>
        <H3>Dress Trousers in Stock</H3>
        <P></P>

        <%
            DukesDB theDB = new DukesDB();
            Searchable[] foundItems = theDB.findItems(120);

            for (Searchable element : foundItems) {

                out.print("<A href=\"displayItemDetail.jsp\">");

                out.print(element.getSku() + "</A>");
                out.print("&nbsp;&nbsp;&nbsp;" + element.getDescription() + "<br>");

            }

        %>


    </BODY>
</HTML>
