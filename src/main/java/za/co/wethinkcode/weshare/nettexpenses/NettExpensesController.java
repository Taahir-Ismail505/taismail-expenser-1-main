package za.co.wethinkcode.weshare.nettexpenses;

import io.javalin.http.Context;

import java.util.Map;

public class NettExpensesController {
    public static final String PATH = "/home";

    public static void renderHomePage(Context context){
        Map<String, Object> viewModel = Map.of();

        context.render("home.html", viewModel);
    }
}