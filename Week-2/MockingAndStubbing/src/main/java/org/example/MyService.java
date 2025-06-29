package org.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public String categorizeUser(String userId) {
        int age = api.getUserAge(userId);
        if (age < 18) return "Minor";
        else if (age < 60) return "Adult";
        else return "Senior";
    }
}
