package _10LambdaExpressions.LambdaExpressions4;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}

