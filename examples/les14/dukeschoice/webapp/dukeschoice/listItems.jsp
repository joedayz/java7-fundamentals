<%@ page import = " java.util.*,duke.init.*,duke.item.*,duke.util.* " %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Apache Tomcat Examples</TITLE>
        <META http-equiv=Content-Type content="text/html">
    </HEAD>
    <BODY>
        <P>


            <SCRIPT>
                function getItem(theSelect)
                {
                    window.location='listItems.jsp?selection=' + theSelect[theSelect.selectedIndex].value;
                }
            </SCRIPT>
            <%
            // Initialize the DukesDB object
                DukesDB theDB = (DukesDB) session.getAttribute("dataSource");
                if (theDB == null) {
                    theDB = new DukesDB();
                    theDB.setupDb();
                    session.setAttribute("dataSource", theDB);
                }
            // Find the unique items for the dropdown list
                Searchable[] foundItemTypes = theDB.findUniqueItems();
            %>
            <!-- Start the table -->
        <table border=0 cellpadding=4 >
            <tr>
                <th colspan=5>
                    <H2>Duke's Choice Search</H2>
                </th>
            </tr>
            <tr>
                <th colspan=5>
                    <img src="images/Duke_small.png">
                </th>
            </tr>
            <%
            // Find the items based on the selection
                String selection = (request.getParameter("selection"));
                if (selection == null || selection.equals("")) {
                    selection = "-1"; // no items have negative id's so foundItems will be empty
                }// Check to make sure selection is not equal to null (first time on the page)
                Searchable[] foundItems = theDB.findItems(Integer.parseInt(selection));
            %>

            <tr><td valign="top" colspan=5>
                    <form action="display.jsp">
                        <select id="itemTypes" onChange="getItem(this);">
                            <option value="">Select an Item</option>
                            <% for (Object element : foundItemTypes) {%>
                            <option <%if (((Searchable) element).getItemID() == Integer.parseInt(selection)) {
        out.println(" selected=\"selected\"");
    }%>
                                value="<%=((Searchable) element).getItemID()%>"><%=((Searchable) element).getDescription()%></option>
                            <%}%>
                        </select>
                    </form></td></tr>
                    <%
                        if (foundItems.length > 0) {
                            out.println(" <tr></td><td>SKU</td><td>Description</td><td>Price</td><td>Available</td></tr>");
                        }
                    %>
                    <%
                        for (Searchable element : foundItems) {

                            out.println("<tr> </td><td><a href=\"displayItemDetail.jsp?SKU=" + element.getSku() + "\">" + element.getSku() + "</a></td>"
                                    + "<td>" + element.getDescription() + "</td>"
                                    + "<td>" + element.getPrice() + "</td>"
                                    + "<td>" + element.getQuantityInStock() + "</td>"
                                    + "</tr>");
                        }

                    %>
        </table>

    </BODY>
</HTML>
