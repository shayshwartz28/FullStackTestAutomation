package WorkFlows;

import Extensions.ApiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class ApiFlows extends CommonOps
{
    @Step("Get Team From Grafana")
    public static String getTeamProperty(String jPath)
    {
        Response response = ApiActions.get("/api/teams/search");
        return ApiActions.extractFromJSON(response, jPath);
    }

    @Step("Create new team in Grafana")
    public static void postTeam(String name, String email)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        ApiActions.post(requestParams, "/api/teams");
    }

    @Step("Update team in Grafana")
    public static void updateTeam(String name, String email, String id)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        ApiActions.put(requestParams, "/api/teams/" + id);
    }

    @Step("Delete team in Grafana")
    public static void deleteTeam(String id)
    {
        ApiActions.deleteTeam(id);
    }
}
