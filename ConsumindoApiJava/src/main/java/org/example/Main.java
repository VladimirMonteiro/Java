package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.entities.Titulo;
import org.example.entities.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um filme para a busca");
        var search = scanner.nextLine();

        // Codifica espaços e acentos para URL
        String encodedSearch = URLEncoder.encode(search, StandardCharsets.UTF_8);

        String address = "http://www.omdbapi.com/?t=" + encodedSearch + "&apikey=e027d2e4";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Exibe status e corpo da resposta
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        TituloOmdb meuTituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println(meuTitulo);
    }
}
