package lambda.Task112;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
