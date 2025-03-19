package Exemple;

import java.util.Objects;

public class ConfigurantonApi {

    public static ConfigurantonApi instance;

    private ConfigurantonApi() {
        // Constructor
    }

    public static ConfigurantonApi getInstance() {
        synchronized (ConfigurantonApi.class) {
            if (Objects.isNull(instance)) {
                instance = new ConfigurantonApi();
            }
        }

        return instance;
    }
}
