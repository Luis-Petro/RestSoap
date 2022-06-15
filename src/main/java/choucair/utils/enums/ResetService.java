package choucair.utils.enums;

public enum ResetService {
    BASE_URL("https://reqres.in"),
    CREATE_USER("/api/users");

    private String uri;

    ResetService(String uri){
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
