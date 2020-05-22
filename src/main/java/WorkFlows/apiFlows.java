package WorkFlows;

import Extensions.apiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class apiFlows extends commonOps
{
    @Step("Get Team From Grafana")
    public static String getTeamProperty(String jPath)
    {
        Response response = apiActions.get("/api/teams/search");
        return apiActions.extractFromJSON(response, jPath);
    }

    @Step("Create new team in Grafana")
    public static void postTeam(String name, String email)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        apiActions.post(requestParams, "/api/teams");   
    }

    @Step("Update team in Grafana")
    public static void updateTeam(String name, String email, String id)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        apiActions.put(requestParams, "/api/teams/" + id);
    }

    @Step("Delete team in Grafana")
    public static void deleteTeam(String id)
    {
        apiActions.deleteTeam(id);
    }
}
