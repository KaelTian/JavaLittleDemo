package oop;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class GenericClass<T> {
    private Class<T> type;

    @SuppressWarnings("unchecked")
    public GenericClass() {
        Type superClass = getClass().getGenericSuperclass();
        if (superClass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) superClass;
            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            if (typeArguments.length > 0 && typeArguments[0] instanceof Class) {
                type = (Class<T>) typeArguments[0];
            }
        } else {
            type = (Class<T>) superClass;
        }
    }

    public Class<T> getType() {
        return type;
    }
}
