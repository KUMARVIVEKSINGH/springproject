package springproject;

public class MyClass { // Noncompliant - should also override "hashCode()"

    @Override
    public boolean equals(Object obj) {
        return true;
    }

}