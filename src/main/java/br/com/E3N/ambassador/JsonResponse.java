package br.com.E3N.ambassador;

public class JsonResponse {
    int userId;
    int id;
    String title;
    boolean completed;

    @Override
    public String toString() {
        return "JsonResponse{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
