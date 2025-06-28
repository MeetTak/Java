package _10LambdaExpressions.LambdaExpressions3;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
