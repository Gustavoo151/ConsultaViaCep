package com.logcursos.admin.catalogo.infrastructure;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class SaveCEP {
    private Gson gson = new GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .setPrettyPrinting()
        .create();

    public void saveCEP(String json) throws IOException {
        Results results = gson.fromJson(json, Results.class);
        Results meusResultados = new Results(results);
        FileWriter escrtrita = new FileWriter("cidade.json");
        escrtrita.write(gson.toJson(meusResultados));
        escrtrita.close();
        System.out.println("Arquivo salvo com sucesso!");
    }
}
