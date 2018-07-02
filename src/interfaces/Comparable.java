package interfaces;

/*
An interface is not a class, but a set of requirements
for the classes that want to conform to the interface.

We can make our interfaces generic (this is actually preferred)
 */

public interface Comparable<T> {
    int compareTo(T other);
}
