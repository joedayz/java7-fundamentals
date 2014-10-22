<%@ page import = " java.util.*,java.io.*,soccer.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Soccer League Example</TITLE>
        <META http-equiv=Content-Type content="text/html">
    </HEAD>
    <BODY>
        <P>
            <%
                String teamID = (request.getParameter("teamID"));
                int teamIndex = Integer.parseInt(teamID);
                if (session.getAttribute("theTeams") != null) {
                    Team[] theTeams = (Team[]) session.getAttribute("theTeams");
                    Player[] thePlayers = theTeams[teamIndex].getRankedPlayers();
            %>

            <!-- Start the table -->
        <table border="0" cellpadding="4" rules="all">
            <tr><th colspan="2"><%=theTeams[teamIndex].getName()%></th></tr>
            <tr><th>Player</th><th>Goals Scored</th></tr>
            <%
                    for (Player currPlayer : thePlayers) {
                        // Player array contains Object references - see getRankedPlayers() method
                        out.println("<tr><td>" + currPlayer + "</td><td>" + ((Player) currPlayer).getGoalsScored() + "</td></tr>");
                    }
                } else
                    out.println("You need to return to the main page to reload the games. Click below.");
            %>
        </table>
        <p>
        <table><tr><th> <a href="showGames.jsp">Return to main page</a></th></tr></table>

    </BODY>
</HTML>