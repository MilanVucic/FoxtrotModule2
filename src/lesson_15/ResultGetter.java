package lesson_15;

public class ResultGetter {
    private ResultCallback callback;

    public ResultGetter(ResultCallback callback) {
        this.callback = callback;
    }

    public void fetchResults() {
        // ....
        if (5 > 3) {
            callback.onSuccess("Results");
        } else {
            callback.onError("Something went wrong...");
        }
    }
}
