package homework_1;

public interface CustomArray {
    int size = 1024;
    int countTrue();

    boolean getByIndex(int index);
    void reverse(int index);
    void setElement(int index, boolean value);
    void setElement(int index);
    void resetElement(int index);
}
