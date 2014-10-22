<%@ page import = " java.util.*,java.io.*,soccer.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML><HEAD><TITLE>Soccer League Example</TITLE>
        <META http-equiv=Content-Type content="text/html">
    </HEAD>
    <BODY>
        <P>
        <H2>Soccer League Games</H2>
        <P></P>

        <%

            String leagueState = (request.getParameter("leagueState"));

            League theLeague = null;
            Team[] theTeams = null;
            Game[] theGames = null;
            theLeague = (League) session.getAttribute("theLeague");
            theGames = (Game[]) session.getAttribute("theGames");
            theTeams = (Team[]) session.getAttribute("theTeams");
            if (theLeague == null || theTeams == null || theGames == null || leagueState != null) {
                theLeague = new League();
                //theTeams = theLeague.setupTeams();
                theTeams = theLeague.setupTeams(5, "The Blues", "The Reds", "The Magpies", "The Crows", "The Harriers", "The Rovers");
                theGames = theLeague.setupGames(theTeams);
                theLeague.play(theGames);
                session.setAttribute("theTeams", theTeams);
                session.setAttribute("theGames", theGames);
                session.setAttribute("theLeague", theLeague);

            }
        %>

        <form name="input" action="showGames.jsp" method="put">
            <input type="hidden" name="leagueState" value="playgames"></>
            <input type="submit" value="Replay games" />
        </form>

        <!-- Start the outer table -->
        <table border="0" cellpadding="4" bgcolor="lightgreen" frame="border">
            <tr><th colspan="2">Away Teams</th></tr>
            <tr>
                <th>Home<br>Teams</th>
                <td>
                    <!-- Start the inner table -->
                    <table border=1 cellpadding=4 rules="all"  bgcolor="white">

                        <tr>    
                            <td></td>
                            <%
                                // Write out the teams accross the first row of inner table
                                // sorted first by points scored, then by total goals scored
                                Arrays.sort(theTeams);
                                for (int i = 0; i < theTeams.length; i++) {
                                    out.println("<th><a href=\"displayTeamDetail.jsp?teamID=" + i + "\">" + theTeams[i].getName() + "</a></th>");
                                }
                            %>
                            <th>Goals</th><th>Points</th>
                        </tr>

                        <%
                            for (int i = 0; i < theTeams.length; i++) {
                                Team currHomeTeam = theTeams[i];
                                out.println("<th><a href=\"displayTeamDetail.jsp?teamID=" + i + "\">" + theTeams[i].getName() + "</a></th>");
                                
                                // Inner loop - for each home team loop through all away teams
                                for (Team aTeam : theTeams) {
                                    Team currAwayTeam = aTeam;

                                    if (currHomeTeam != currAwayTeam) {           
                                        // Need to find the index to this game in the theGames array - simplest to just search
                                        for (int j = 0; j < theGames.length; j++) {

                                            if (theGames[j].getHomeTeam() == currHomeTeam && theGames[j].getAwayTeam() == currAwayTeam) {
                                                out.println("<td><a href=\"displayGameDetail.jsp?gameID=" + j + "\">" + theGames[j].getScore() + "</a></td>");
                                                break;
                                            }
                                        }
                                    } else {
                                        out.println("<td>" + " X " + "</td>"); 
                                    }
                                }

                                // Last two columns show team points and goals
                                out.println("<td>" + currHomeTeam.getTotalGoals() + "</td>");
                                out.println("<td>" + currHomeTeam.getTotalPoints() + "</td>");

                                out.println("</tr>");
                            }
                        %>

                    </table>
                </td></tr>
        </table>

    </BODY></HTML>
