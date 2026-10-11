package in.hiresense.dbutils;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class AppInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();

        String url = setting("HIRESENSE_DB_URL", sc.getInitParameter("url"));
        String username = setting("HIRESENSE_DB_USERNAME", sc.getInitParameter("username"));
        String password = setting("HIRESENSE_DB_PASSWORD", sc.getInitParameter("password"));

        if (url == null || username == null || password == null) {
            throw new IllegalStateException(
                "Database configuration missing. Set HIRESENSE_DB_URL, HIRESENSE_DB_USERNAME, and HIRESENSE_DB_PASSWORD.");
        }

        DBConnection.openConnection(url, username, password);

        String appName = sc.getInitParameter("appName");
        sc.setAttribute("appName", appName == null ? "HireSense" : appName);
    }

    private static String setting(String environmentName, String fallback) {
        String value = System.getenv(environmentName);
        return value == null || value.trim().isEmpty() ? fallback : value;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DBConnection.closeConnection();
    }
}
