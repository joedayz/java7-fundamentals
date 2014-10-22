<%@ page import = " java.util.*,java.io.*,soccer.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Soccer League Example</TITLE>
        <META http-equiv=Content-Type content="text/html">
    </HEAD>
    <BODY>
        <P>
            <%

                String gameID = (request.getParameter("gameID"));
                int gameIndex = Integer.parseInt(gameID);
                if (session.getAttribute("theGames") != null) {
                    Game[] theGames = (Game[]) session.getAttribute("theGames");
                    Game currGame = theGames[gameIndex];
                    Goal[] theGoals = currGame.getGoals();
            %>
            <!-- Start the table -->
        <table border="0" cellpadding="4" rules="all">
            <tr><th colspan="3"><%=currGame.getResult()%></th></tr>
            <tr><th>Team</th><th>Player</th><th>Time</th></tr>
            <tr>
                <%

                    for (int i = 0; i < theGoals.length; i++) {
                        out.println("<tr>");
                        out.println("<td>" + theGoals[i].getTheTeam().getName() + "</td>");
                        out.println("<td>" + theGoals[i].getThePlayer() + "</td>");
                        out.println("<td>" + theGoals[i].getTheTime() + "</td>");
                        out.println("</tr>");

                    }
                %>

        </table>
        <%
            } else
                out.println("You need to return to the main page to reload the games. Click below.");
        %>

        <p>
        <table><tr><th> <a href="showGames.jsp">Return to main page</a></th></tr></table>

    </BODY>
</HTML>
